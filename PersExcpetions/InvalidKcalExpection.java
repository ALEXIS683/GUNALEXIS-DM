package PersExcpetions;

/**
 * kcalExpection
 */
public class InvalidKcalExpection extends Exception{
    public InvalidKcalExpection(){
        super("Wrong number. It should be between 0 and 100");
    }
    
}