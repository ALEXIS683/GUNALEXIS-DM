import java.util.ArrayList;
import java.util.Iterator;

public class Sandwich<P extends Pain, S extends Sauce, I extends Ingredient> implements Iterable<I> {
  protected String nom;
  protected P pain;
  protected S sauce;
  protected ArrayList<I> ingredients;

  public Sandwich(String nom, P pain, S sauce) {
    this.nom = nom;
    this.pain = pain;
    this.sauce = sauce;
    this.ingredients = new ArrayList<I>();
  }

  public void addIngredient(I i) {
    if (!(i instanceof Pain) && !(i instanceof Sauce)) {
      this.ingredients.add(i);
    }
  }

  public void removeIngredient(I i) {
    if (!(i instanceof Pain && !(i instanceof Sauce))) {
      if (this.ingredients.contains(i)) {
        this.ingredients.remove(i);
      } else {
        System.err.println("Ingredient n'est pas dans le sandwich !");
      }
    }
  }

  public Iterator<I> iterator() {
    ArrayList<I> iterable = ingredients;
    iterable.add((I) pain);
    iterable.add((I) sauce);
    return iterable.iterator();
  }

  public I ingredientPlusCaloriqueIterateur() {
    I i = (I) this.pain;

    for (I j : this) {
      if (j.kcal > i.kcal) {
        i = j;
      }
    }

    return i;
  }

  public I ingredientPlusCaloriqueStream() {
    ArrayList<I> tousIngredients = ingredients;
    tousIngredients.add((I) pain);
    tousIngredients.add((I) sauce);

    int maxKcal = tousIngredients.stream().mapToInt(x -> x.kcal).max().getAsInt();
    return (I) tousIngredients.stream().filter(x -> x.kcal == maxKcal).findFirst().get();
  }

  public I ingredientPlusCalorique() {
    I i = (this.pain.kcal > this.sauce.kcal) ? (I) this.pain : (I) this.sauce;

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

  public void moveIngTo(I i, Sandwich s) {
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
