package app;

import java.util.ArrayList;

import Ingredients.InnerIngredient.*;

//TODO demander à la prof pour le troisième type comment on l'implémente...
public class Sandwich<TypePain, Tsauce, AutIng> {
    private String nomSandwich = "Sandwitch";
    private TypePain tPain;
    private Tsauce tsauce;
    private ArrayList<AutIng> AutIng;

    public Sandwich(TypePain tPain, Tsauce tsauce, ArrayList<AutIng> AutIng) {
        this.tPain = tPain;
        this.tsauce = tsauce;
        this.AutIng = AutIng;
    }

    public void moveFrom(Sandwich sandwich) {
    }

    public void removeIngredient(InnerIngredient i) {
        if (this.AutIng.contains(i)) {
            this.AutIng.remove(i);
        }

    }

    public boolean aMemeIngQue(Sandwich sandwich) {
        if (this.tPain == sandwich.tPain && this.tsauce == sandwich.tsauce && this.AutIng.equals(sandwich.AutIng)) {
            return true;
        }

        return false;
    }

    public InnerIngredient lePlusCalorique(Sandwich sandwich) {
        InnerIngredient 
    }

    @Override
    public String toString() {
        return "Type de pain : " + tPain + " Type sauce : " + tsauce + " Ingrédients : " + AutIng;
    }

}