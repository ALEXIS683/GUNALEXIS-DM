package Ingredients.InnerIngredient;

import PersExcpetions.InvalidKcalExpection;

public interface InnerIngredient {
    int echelleKcal = 100;
    static final int echellezpoidj = 3;

    public void convertKcalToKj();

    public default void setKcalPourCent(int kcal) throws InvalidKcalExpection {
        try {
            if (kcal < 0 || kcal > 100) {
                throw new InvalidKcalExpection();
            }
        } catch (InvalidKcalExpection e) {
            e.printStackTrace();
        }
    }

    public default Boolean isVegan() {
        return false;
    }

    public default Boolean isVegetarian() {
        return false;
    }

}