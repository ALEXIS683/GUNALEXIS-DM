package Ingredients.Pain;

import Ingredients.InnerIngredient.InnerTypePain;

public class GrosPain implements InnerTypePain {
    private String nom;
    private boolean graines=false;

    @Override
    public Boolean aDesGraines() {
        return graines;
    }

    public GrosPain(String nom){
        this.nom = nom;
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
