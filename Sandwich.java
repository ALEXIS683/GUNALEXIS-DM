import java.util.ArrayList;
import java.util.Iterator;

public class Sandwich<P extends Pain, S extends Sauce, I extends ArrayList<Ingredient>>
    implements Iterable<Ingredient> {
  protected String nom;
  protected P pain;
  protected S sauce;
  protected ArrayList<Ingredient> ingredients;

  public Sandwich(String nom, P pain, S sauce) {
    this.nom = nom;
    this.pain = pain;
    this.sauce = sauce;
    this.ingredients = new ArrayList<Ingredient>();
  }

  public Sandwich(String nom, P pain, S sauce, I ingredients) {
    this.nom = nom;
    this.pain = pain;
    this.sauce = sauce;
    this.ingredients = ingredients;
  }

  public void addIngredient(Ingredient i) {
    this.ingredients.add(i);
  }

  public void removeIngredient(Ingredient i) {
    if (this.ingredients.contains(i)) {
      this.ingredients.remove(i);
    } else {
      System.err.println("Ingredient n'est pas dans le sandwich !");
    }
  }

  public Iterator<Ingredient> iterator() {
    ArrayList<Ingredient> iterable = ingredients;
    iterable.add(pain);
    iterable.add(sauce);
    return iterable.iterator();
  }

  public Ingredient ingredientPlusCaloriqueIterateur() {
    Ingredient i = this.pain;

    for (Ingredient j : this) {
      if (j.kcal > i.kcal) {
        i = j;
      }
    }

    return i;
  }

  public Ingredient ingredientPlusCaloriqueStream() {
    ArrayList<Ingredient> tousIngredients = ingredients;
    tousIngredients.add(pain);
    tousIngredients.add(sauce);

    int maxKcal = tousIngredients.stream().mapToInt(x -> x.kcal).max().getAsInt();
    return (Ingredient) tousIngredients.stream().filter(x -> x.kcal == maxKcal).findFirst().get();
  }

  public Ingredient ingredientPlusCalorique() {
    Ingredient i = (this.pain.kcal > this.sauce.kcal) ? this.pain : this.sauce;

    for (int counter = 0; counter < this.ingredients.size(); counter++) {
      if (this.ingredients.get(counter).kcal > i.kcal) {
        i = this.ingredients.get(counter);
      }
    }

    return i;
  }

  public boolean sandwichsAvecIngCommun(Sandwich s) {
    int size = (this.ingredients.size() < s.ingredients.size()) ? this.ingredients.size() : s.ingredients.size();

    for (int counter = 0; counter < size; counter++) {
      if (this.ingredients.get(counter).equals(s.ingredients.get(counter))) {
        return true;
      }
    }

    return false;
  }

  public void moveIngTo(Ingredient i, Sandwich s) {
    if (!this.ingredients.contains(i)) {
      System.err.println("Ingredient n'est pas dans le sandwich !");
    } else {
      if ((s instanceof SandwichVegetarien)
          && (!(i instanceof IngredientVegetarien) || !(i instanceof IngredientVegan))) {
        System.err.println("Ingredient n'est pas compatible avec le sandwich !");
      } else if ((s instanceof SandwichVegan) && !(i instanceof IngredientVegan)) {
        System.err.println("Ingredient n'est pas compatible avec le sandwich !");
      } else {
        s.ingredients.add(i);
        this.ingredients.remove(i);
        System.out.println("Moved!");
      }
    }
  }

}
