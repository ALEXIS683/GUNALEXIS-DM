package Ingredients.Sauces;

import Ingredients.InnerIngredient.InnerTypeSauce;

public class Blanche implements InnerTypeSauce {
    private boolean piquante=false;
    private String nom="Blanche";

    @Override
    public boolean estPiquante() {
        return piquante;
    }

    @Override
    public String getNom() {
        // TODO Auto-generated method stub
        return nom;
    }

    @Override
    public void setNom() {
        // TODO Auto-generated method stub
        
    }
    
}
