package src;

public class SandwichVegan<P extends PainVegan, S extends SauceVegan, I extends Ingredient>
        extends Sandwich<P, S, I> {

    public SandwichVegan(String nom, P pain, S sauce) {
        super(nom, pain, sauce);
    }

    @Override
    public void addIngredient(I i) {
        if (!(i instanceof IngredientVegan)) {
            System.err.println("Ingredient n'est pas vegan !");
        } else {
            this.ingredients.add(i);
        }
    }

}
