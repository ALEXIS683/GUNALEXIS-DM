package Ingredients.InnerIngredient;

public interface InnerIngredientVegan extends InnerIngredientVegetarien{
    default Boolean isVegan(){
        return true;
    }
}