public class NonHero {
    
    // SUPER KEYWORD (VIDEO 37)

    // This is the SUPER/PARENT class. It takes care of the NonHero object's AND Hero object's name and age. 
    // The Hero object's name and age is sent to the NonHero constructor to be stored into the name and age variables
    // since the Hero object inherited those variables from this NonHero class. 

    String name; 
    int age; 

    NonHero(String name, int age) {
        this.name = name;
        this.age = age; 
    }

    public String toString() {
        return "My name is "+this.name+ " and my age is "+this.age; 
    }
    
}
