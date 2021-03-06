import java.util.*; 

public class Videos20to29 // Videos 20to29 class 
{
    public static void main(String[] args) { // Main METHOD. It is the function of the Videos20to29 class 
                                             // This is the "static" method "main" that returns "void" (i.e. nothing) 
        // 2D ARRAYLIST (VIDEO 20)
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Bread");
        bakeryList.add("Cake");
        bakeryList.add("Donuts");

        ArrayList<String> frozenGoodsList = new ArrayList<>();
        frozenGoodsList.add("Ice Cream");
        frozenGoodsList.add("Ice Cream Cake");
        frozenGoodsList.add("Frozen Fruits"); 

        ArrayList<String> produceList = new ArrayList<>(); 
        produceList.add("Watermelons");
        produceList.add("Grapes");
        
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>(); // Creating a 2D arraylists of string arraylists (ArrayList<String>)
        groceryList.add(bakeryList);  // Recall, to add something to an array list, use ".ad". Here, we're adding an entire arraylist
        groceryList.add(frozenGoodsList);
        groceryList.add(produceList);

        System.out.println(groceryList); // Prints out entire grocery list
        System.out.println(groceryList.get(0).get(0)); // Prints out 0th index of 0th index which is 0th index of bakeryList 
        System.out.println("###############################################"); 

        // FOR-EACH LOOP (VIDEO 21)

        String[] carBrands = {"Honda", "Subaru", "Tesla", "Dodge"}; 
        for (String i : carBrands) { // This is how to use the for-each loop. 
            System.out.print(i + "\n"); 
        }

        ArrayList<String> animals = new ArrayList<>();  // Here, we have an arraylist
        animals.add("Elephant");
        animals.add("Pig"); 
        animals.add("Duck"); 
        for (String i0 : animals) { // Here, we use the for-each loop for the arraylist. Same idea. 
            System.out.println(i0);
        } 

        System.out.println("###############################################"); 

        // METHODS (VIDEO 22)

        String myName = "Hans";
        double myGPA = 3.96; 
        hello(myName, myGPA); // We can pass the String variable, myName, into the method "hello" as an argument and call it. 
        double n1 = 3.5;
        double n2 = 4.6;
        double difference = difference(n1, n2); // We can pass two doubles into the "difference" method and it will return the difference of the two values 
        System.out.println(difference);

        System.out.println("###############################################"); 

        // OVERLOADED METHODS (VIDEO 23)

        double om1 = multiply(1.5, 2.6); 
        double om2 = multiply(2.5, 9.0, 4.5); 
        double om3 = multiply(1.5, 1.5, 1.5, 1.5); 
        System.out.println(om2); 

        System.out.println("###############################################"); 

        // PRINTF (VIDEO 24)
       
       String myStr = "Taekwondo"; // We want to dispaly this string with a specific formatting and effects 
       int myInt = 123;
       int myInt2 = -123; 
       double myDouble = 3.141519; 
       double myDouble2 = -3.141519; 
       boolean myBool = false;  

       System.out.printf("Taekwondo %20f \n", myDouble); // Width of 20 for 20 spaces and f to specify that this is a float/double
       System.out.printf("Taekwondo %.3f", myDouble); //Precision of 3, f for float
       System.out.printf("Taekwondo %+.3f \n", myDouble2); // + flag to add a negative sign since myDouble2 is negative, .3 for precision of 3, f for float 
       System.out.printf("Taekwondo %+020.3f \n", myDouble2); // + flag to add negative sign, 0 to pad the double value with zeros after the 20 spaces because of the width of 20, .3 for precision of 3, f for float 
       System.out.printf("Taekwondo %+030f \n", myDouble2); 

       System.out.println("###############################################"); 

       // FINAL KEYWORD (VIDEO 25)

       final double PI = 3.14159;
       System.out.println(PI); 

       System.out.println("###############################################"); 


       // OBJECTS (OOP) (VIDEO 26)
       
       // We can create a car object
       Car myCar1 = new Car(); // We created an instance of the Car class and named the object, myCar1. myCar has all the methods and attributes as defined in the class
       Car myCar2 = new Car(); // We created another instance of the Car class named the object, myCar2.

       System.out.println(myCar1.brand); // myCar.brand accesses the brand attribute of the Car class 
       System.out.println(myCar1.year); 
       
       myCar1.park(); // myCar1.park accesses the park method of the Car class 
       myCar2.drive(); //myCar2.drive() accesses the drive method of the Car class 
       System.out.println("###############################################"); 

       // CONSTRUCTORS (VIDEO 27)

       Human myHuman = new Human("Hans", 18, 164.4); // We pass in unique data to create a unique object  
       //System.out.println(myHuman.name); // Here, we are accessing the unique name of the unique object
       //myHuman.drink(); // Here, we are accessing the "drink" method of the unique object 

       System.out.println("###############################################"); 


       // VARIABLE SCOPE  (VIDEO 28)

       DiceRollerGlobal myDiceRoller = new DiceRollerGlobal(); // Creating an object called myDiceRoller which will have a random number as its attribute. 
       myDiceRoller.roll(); // This will call its roll method which will now use the random number to produce a random number 

       DiceRollerLocal myDiceRoller2 = new DiceRollerLocal(); // Creating an object called myDiceRoller2 from the other class which will also print the random num since that is part of its defaults 

       System.out.println("###############################################"); 

       // OVERLOADED CONSTRUCTORS (VIDEO 29)

        Pizza pizza1 = new Pizza(); // We are calling the Pizza() constructor with one of the overloaded methods 
        Pizza pizza2 = new Pizza("Thick", "Tomato"); // We are calling the Pizza constructor with another overloaded method 
    }

    // METHODS (VIDEO 22)  

    public static void hello(String name, double GPA) { // This is the creation of a new "static" method "hello" that returns "Void". 
        System.out.println("Hello "+name); // In this case, I print out the String, name= myName = "Hans"
        System.out.println("Your GPA is "+GPA); // In this case, I print out the double, GPA = myGPA = 3.96
    } 

    public static double difference(double n1, double n2) { // This is the creation of a new "static" method "double" that returns a "double". 
        return n1 - n2; // Returns the difference to the caller. 
    }

    // OVERLOADED METHODS (VIDEO 23)

    public static double multiply(double a, double b) {
        return a*b;
    }
    public static double multiply(double a, double b, double c) {
        return a*b*c;
    }
    public static double multiply(double a, double b, double c, double d) {
        return a*b*c*d; 
    }

    
}    
