import Ingredients.Pain.*;
import Ingredients.Sauces.*;
import app.Sandwich;

import java.util.ArrayList;

import Ingredients.AutreIng.*;
import Ingredients.InnerIngredient.InnerIngredient;

public class Main {
    public static void main(String[] args) {
        GrosPain gp = new GrosPain();
        Blanche blanche = new Blanche();
        Salade salade = new Salade();
        Salade salade2 = new Salade();
        Concombre concombre = new Concombre();

        ArrayList<InnerIngredient> autrIngList = new ArrayList<>();
        autrIngList.add(salade);
        autrIngList.add(salade2);
        autrIngList.add(concombre);
        Sandwich<GrosPain, Blanche, InnerIngredient> sandwich1 = new Sandwich<>(gp, blanche, autrIngList);
        System.out.println(sandwich1.toString());

        
    }
}
