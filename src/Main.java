package src;

public class Main {
  public static void main(String[] args) throws ExceptionCalRange {
    // 1) Création des Sandwichs
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

    // 2) Affichage de Ingrédient Plus Calorique
    System.out.println(sandwichNormal.ingredientPlusCalorique());
    System.out.println(sandwichVegetarien.ingredientPlusCalorique());

    // Ces Valeurs Changeront Quand Nous Déplacerons ingredientVegan
    System.out.println(sandwichVegan.ingredientPlusCalorique());
    System.out.println(sandwichVegan.sandwichsAvecIngCommun(sandwichVegetarien));

    // 3)
    sandwichVegan.moveIngTo(ingredientVegan, sandwichVegetarien);
    System.out.println(sandwichVegan.ingredientPlusCalorique());

    // 4)
    System.out.println(sandwichVegan.sandwichsAvecIngCommun(sandwichVegetarien));

    // 5) Cas Incorrects
    // SandwichVegan<PainVegan,SauceVegan,ArrayList<Ingredient>> sandwichVegan2 =
    // new SandwichVegan<>("Vegan2", pain, sauce);
    // Cela Compile Pas

    sandwichNormal.moveIngTo(ingredient, sandwichVegetarien);
    sandwichVegetarien.moveIngTo(ingredientVegetarien, sandwichVegan);

    // 6) Iterateur et Stream
    System.out.println(sandwichVegan.ingredientPlusCaloriqueIterateur());
    System.out.println(sandwichVegan.ingredientPlusCaloriqueStream());
  }
}
