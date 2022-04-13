import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws ExceptionCalRange {
    // Sandwich normal
    Pain pain = new Pain();
    pain.setKcal(150);
    Sauce sauce = new Sauce();
    sauce.setKcal(50);

    Sandwich<Pain, Sauce, ArrayList<Ingredient>> sandwichNormal = new Sandwich<>(
        "Standard", pain, sauce);

    Ingredient ingredient = new Ingredient();
    ingredient.setKcal(20);
    sandwichNormal.addIngredient(ingredient);
    IngredientVegan ingredientVegan = new IngredientVegan();
    ingredientVegan.setKcal(225);
    sandwichNormal.addIngredient(ingredientVegan);
    System.out.println(sandwichNormal.ingredientPlusCalorique());

    // Sandwich vegan
    PainVegan painVegan = new PainVegan();
    painVegan.setKcal(5);
    SauceVegan sauceVegan = new SauceVegan();
    sauceVegan.setKcal(5);

    SandwichVegan<PainVegan, SauceVegan, ArrayList<Ingredient>> sandwichVegan = new SandwichVegan<>("Vegan", painVegan,
        sauceVegan);

    sandwichVegan.addIngredient(ingredientVegan);
    sandwichVegan.addIngredient(ingredient); // Ne va pas marcher comme ingredient n'est pas vegan

    SandwichVegetarien<PainVegetarien, SauceVegetarien, ArrayList<Ingredient>> sandwichVegetarien = new SandwichVegetarien<>(
        "Vege", painVegan, sauceVegan);
    sandwichVegetarien.addIngredient(ingredient);
    sandwichVegetarien.addIngredient(ingredientVegan);
  }
}
