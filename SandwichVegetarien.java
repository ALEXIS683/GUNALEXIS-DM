import java.util.ArrayList;

public class SandwichVegetarien<P extends PainVegetarien, S extends SauceVegetarien, I extends ArrayList<Ingredient>>
    extends Sandwich<P, S, I> {

  public SandwichVegetarien(String nom, P pain, S sauce) {
    super(nom, pain, sauce);
  }

  @Override
  public void addIngredient(Ingredient i) {
    if (!(i instanceof IngredientVegetarien) && !(i instanceof IngredientVegetarien)) {
      System.err.println("Ingredient n'est pas vegan !");
    } else {
      this.ingredients.add(i);
    }
  }

}
