import java.util.ArrayList;

import javax.imageio.stream.MemoryCacheImageInputStream;

public class Videos30to39 {
    
    public static void main (String[] args) {

        // toSTRING METHOD (VIDEO 30)

    Car myCar = new Car(); // creating the car object
    System.out.printf("%s", myCar.toString()); 
    
    System.out.println("###############################################"); 


    // ARRAY OF OBJECTS (VIDEO 31)

    Human[] students = new Human[3]; // initialized an array of 3 human "objects" called students 

    Human student1 = new Human("Hans", 18, 164.4); // creating the human "objects" 
    System.out.println(student1.age); 
    Human student2 = new Human("Matthew", 19, 125.5);
    Human student3 = new Human("Aiden", 20, 155.5); 

    students[0] = student1; // adding those "objects" to the list 
    students[1] = student2;
    students[2] = student3; 

    System.out.println(students[0]); 

    // recall that we can actually create this list using another method of just creating with the values already there. Look back 

    System.out.println("###############################################"); 


    // OBJECT PASSING (VIDEO 32)

    Bicycle bike1 = new Bicycle("Hans"); // create 
    Bicycle bike2 = new Bicycle("Matt"); 
    Bicycle bike3 = new Bicycle("Kathryn"); 

    Garage myGarage = new Garage(); // we created the garage 
    myGarage.park(bike1); // we called the .park method to park the bike and passed in the bike we want to park 

    System.out.println("###############################################"); 


    // STATIC KEYWORD (VIDEO 33)

    Pets pet1 = new Pets("Lucky"); // create a new instance of the pet named Pet1 
    Pets pet2 = new Pets("Sushi"); // create a second instance of pet named Pet2 
    System.out.println(Pets.numOfPets);  // this prints out 2 because we created 2 pets, which updated that static variable every time. 
                                         // the static variable didn't go away
    
    System.out.println("###############################################"); 

    // INHERITANCE (VIDEO 34)

    ApplePhone A525G = new ApplePhone("Samsung"); 
    A525G.text(); // notice, this object of the Android class has a text feature, although if we check back, Android class doesn't explicitly have a method like this.
                  // it inherited it from the Smartphone class
    System.out.println("Face recognition: "+A525G.faceRecognition); 

    

    // METHOD OVERRIDING (VIDEO 35)

    Smartphone smartphone = new Smartphone();
    smartphone.fingerPrintScan(); // This prints out "Fingerprint scan successful"

    ApplePhone iPhone = new ApplePhone("iphone 12"); 
    iPhone.fingerPrintScan(); // This prints out "Fingerprint scan is NOT available for this phone" even though the one above prints succcessful. This is because the method was overridden

    System.out.println("###############################################"); 


    // SUPER KEYWORD (VIDEO 36)

    Hero myHero = new Hero("Batman", 20, "$$$"); 
    System.out.println(myHero); 

    System.out.println("###############################################"); 


    

    // ABSTRACTION (VIDEO 37) 

    Van myVan = new Van(); // the child class, van, has the drive method-- which was abstract in the parent class, vehicle-- all implemented 
    
    System.out.println("###############################################"); 


    // ACCESS MODIFIERS (VIDEO 38)

    // Check Package 1 and Package 2 

    // ENCAPSULATION (VIDEO 39)

    Laptop myLaptop = new Laptop("Dell", "i7", 2021);
    // System.out.println(myLaptop.year);  this doesn't work because the variable is private. 
    System.out.println(myLaptop.getBrand()); // we are calling the getter method to get the brand
    System.out.println(myLaptop.getYear());  // we are calling the getter method to get the year
    
    myLaptop.setBrand("Samsung"); // we are calling the setter method to set a new brand 
    System.out.println(myLaptop.getBrand()); 

    System.out.println("###############################################");


    }
}