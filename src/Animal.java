//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3

/**
 *
 * @author 
 * Nama        : Alvin Lukman Nulhakim
 * Nim         : 10117095
 * Kelas       : IF-3
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;

    public Animal(boolean vegetarian, String food, int legs) {
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
    
}
