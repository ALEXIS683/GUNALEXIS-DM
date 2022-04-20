import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws ExceptionCalRange {
    // 1 Création des sandwichs
    Pain pain = new Pain();
    pain.setKcal(150);
    Sauce sauce = new Sauce();
    sauce.setKcal(50);
    Sandwich<Pain, Sauce, Ingredient> sandwichNormal = new Sandwich<>(
        "Standard", pain, sauce);
    Ingredient ingredient = new Ingredient();
    ingredient.setKcal(500);
    sandwichNormal.addIngredient(ingredient);
    IngredientVegan ingredientVegan = new IngredientVegan();
    ingredientVegan.setKcal(225);
    sandwichNormal.addIngredient(ingredientVegan);

    PainVegan painVegan = new PainVegan();
    painVegan.setKcal(5);
    SauceVegan sauceVegan = new SauceVegan();
    sauceVegan.setKcal(8);
    SandwichVegan<PainVegan, SauceVegan, Ingredient> sandwichVegan = new SandwichVegan<>("Vegan", painVegan,
        sauceVegan);
    sandwichVegan.addIngredient(ingredientVegan);

    SandwichVegetarien<PainVegetarien, SauceVegetarien, Ingredient> sandwichVegetarien = new SandwichVegetarien<>(
        "Vege", painVegan, sauceVegan);
    sandwichVegetarien.addIngredient(ingredientVegan);
    IngredientVegetarien ingredientVegetarien = new IngredientVegetarien();
    ingredientVegetarien.setKcal(250);
    sandwichVegetarien.addIngredient(ingredientVegetarien);

    // 2 Affichage l'ingrédient plus calorique
    System.out.println(sandwichNormal.ingredientPlusCalorique());
    System.out.println(sandwichVegetarien.ingredientPlusCalorique());

    // Ces propriétés changeront au fur et à mesure que nous déplacerons
    // ingredientVegan
    System.out.println(sandwichVegan.ingredientPlusCalorique());
    System.out.println(sandwichVegan.sandwichsAvecIngCommun(sandwichVegan));

    // 3
    sandwichVegan.moveIngTo(ingredientVegan, sandwichVegetarien);
    System.out.println(sandwichVegan.ingredientPlusCalorique());

    // 4
    System.out.println(sandwichVegan.sandwichsAvecIngCommun(sandwichVegan));

    // 5 Cas incorrects
    // SandwichVegan<PainVegan,SauceVegan,ArrayList<Ingredient>> sandwichVegan2 =
    // new SandwichVegan<>("Vegan2", pain, sauce);
    // ça marche pas

    sandwichNormal.moveIngTo(ingredient, sandwichVegetarien);
    sandwichVegetarien.moveIngTo(ingredientVegetarien, sandwichVegan);

    // 6 Iterateur et Stream
    System.out.println(sandwichVegan.ingredientPlusCaloriqueIterateur());
    System.out.println(sandwichVegan.ingredientPlusCaloriqueStream());
  }
}
