public class Human {
    
    // CONSTUCTORS (VIDEO 27)

    // Recall, we ALWAYS MUST DECLARE the variables in order to use them / assign unique attributes 
    static String name; // = this.name 
    static int age; // = this.age
    static double weight;  // = this.weight

    // ** Notice: we are defining the constructor and letting it take in parameters!
    Human(String name, int age, double weight) { // With these, we can create a unique human, instead of with the car example where all cars were the same
        // All of these are the humans' DEFAULTS
        // We are assigning these defaults to global variables using "this" so we can use these defaults in the entire class  
        this.name = name; // this.name represents the "String name" declared above and is set to be the name parameter sent in
        this.age = age; // this.age represents the "Int age" declared above and is set to be the age parameter sent in 
        this.weight = weight;  // this.weight represents the "double weight" declared above and is set to be the weight parameter sent in

    }

    //Let's define some methods of the human
    void eat()
    {
        System.out.println(this.name + " is eating "); // Notice, we use "this.name" it is a global variable 

    }
    
    void drink() {
        System.out.println(this.name + " is drinking "); 
    }

    public String toString() {
        return "My name is "+name; 
    }
}


