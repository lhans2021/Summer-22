public class Hero extends NonHero {

    // SUPER KEYWORD (VIDEO 37)

    // This class ALSO has the "String name" and "int age" because it inherited them from the NonHero class 

    String power; // = this.power 

    Hero (String name, int age, String power) {
        super(name, age);  // we use the "super" keyword to send these values to the NonHero object to store into variables 
        this.power = power; 
    }

    public String toString() {
        return super.toString()+" and my power is "+this.power; 
    }

}
