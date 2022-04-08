package Ingredients.Pain;

import Ingredients.InnerIngredient.InnerTypePain;

public class GrosPain implements InnerTypePain {
    private String nom="Gros Pain";

    @Override
    public Boolean aDesGraines() {
        return false;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
        
    }

    

}
