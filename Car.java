public class Car {

    // OBJECTS (OOP) (VIDEO 26)

    // Let's define some of our Car's attributes
    String brand = "Tesla";
    String model = "Model S";
    int year = 2020; 
    double price = 60000.00; 
    boolean autoDrive = false; // Our car cannot autodrive 
    // Let's define some of our Car's methods 
    void drive() // Our car has a drive mode 
    {
        System.out.println("Your car is now in the drive mode... ");
    }
    void park() // Our car has a parking mode 
    {
        System.out.println("Your car is now in the parking mode ... "); 
    }
    
    // ** notice that we defined attributes and methods, but did NOT DEFINE the constructor here  

    // toSTRING METHOD (VIDEO 30)

    public String toString() { // toString is a special method of objects to represent them as strings 
        return "This car has the following attributes: \n"+brand+"\n"+model+" and more \n"; // we are defining this method to return the following when we print the object 
    }
}

