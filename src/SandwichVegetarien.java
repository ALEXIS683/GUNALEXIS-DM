package src;

public class SandwichVegetarien<P extends PainVegetarien, S extends SauceVegetarien, I extends Ingredient>
    extends Sandwich<P, S, I> {

  public SandwichVegetarien(String nom, P pain, S sauce) {
    super(nom, pain, sauce);
  }

  @Override
  public void addIngredient(I i) {
    if (!(i instanceof IngredientVegetarien) && !(i instanceof IngredientVegetarien)) {
      System.err.println("Ingredient n'est pas vegetarien !");
    } else {
      this.ingredients.add(i);
    }
  }

}
