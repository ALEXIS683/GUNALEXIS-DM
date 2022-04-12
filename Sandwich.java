import java.util.ArrayList;

public class Sandwich<P extends Pain, S extends Sauce, I extends ArrayList<Ingredient>> {
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

  public Ingredient ingredientPlusCalorique() {
    Ingredient i = (this.pain.kcal > this.sauce.kcal) ? this.pain : this.sauce;

    for (int counter = 0; counter < this.ingredients.size(); counter++) {
      if (this.ingredients.get(counter).kcal > i.kcal) {
        i = this.ingredients.get(counter);
      }
    }

    return i;
  }

  public boolean sandwichsAvecMemesIngredients(Sandwich<P, S, I> s) {
    if (this.ingredients.size() != s.ingredients.size()) {
      return false;
    }

    for (int counter = 0; counter < s.ingredients.size(); counter++) {
      if (!this.ingredients.get(counter).equals(s.ingredients.get(counter))) {
        return false;
      }
    }

    return true;
  }

  public void moveIngTo(Sandwich<P, S, I> s, Ingredient i) {
    if (!this.ingredients.contains(i)) {
      System.err.println("Ingredient n'est pas dans le sandwich !");
    } else {

    }
  }

}
