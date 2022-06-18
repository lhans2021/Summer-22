import java.util.*; // Importing every class in java.util, including a scanner and random class 

public class DiceRollerGlobal {
    
    int randomNum; // randomNum is a GLOBAL variable 

    DiceRollerGlobal() { // Creating the constructor; remember, the constructor is also a method. 
                   // Whatever object is created with this class will be created here, so whatever function or attributes are here will be assigned to the object RIGHT AWAY  
                   
        // All of these are the object's defaults 
        Random random = new Random(); // Recall: we are creating the random number GENERATOR
        randomNum = random.nextInt(6)+1; // randomNum is a GLOBAL variable; it is  accessible in the DiceRoller class.
                                                // randomNum is automatically assigned to the object we created  

    }
    void roll() { // this is the roll method of the DiceRoller constructor. 
        System.out.println("Your random number is "+randomNum); 
    }

}
