package Ingredients.InnerIngredient;

/**
 * ingredientsVege
 */
public interface InnerIngredientVegetarien extends InnerIngredient{
    public default Boolean isVegetarian(){
        return true;
    }
    
}