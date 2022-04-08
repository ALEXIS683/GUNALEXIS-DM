package app;

import java.util.ArrayList;

import Ingredients.*;
import Ingredients.InnerIngredient.InnerIngredient;

//TODO demander à la prof pour le troisième type comment on l'implémente...
public class Sandwich<TypePain, Tsauce, TypeAutIng> {
    private String nomSandwich;
    private TypePain tPain;
    private Tsauce tsauce;
    private ArrayList<TypeAutIng> typeAutIng;

    public Sandwich(TypePain tPain, Tsauce tsauce, ArrayList<TypeAutIng> typeAutIng){
        this.tPain = tPain;
        this.tsauce = tsauce;
        this.typeAutIng = typeAutIng;
    }

    public void moveFrom(Sandwich sandwich){
    }

    public void removeIngredient(){
        
    }

    public void aMemeIngQue(Sandwich sandwich){

    }

    public InnerIngredient lePlusCalorique(Sandwich sandwich){
        return null;
    }

    @Override
    public String toString() {
        return "Type de pain : "+tPain+" Type sauce : "+tsauce+" Ingrédients : "+typeAutIng;
    }

}