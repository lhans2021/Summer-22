import java.util.*; 

public class DiceRollerLocal {
    
    // VARIABLE SCOPE (VIDEO 28)

    DiceRollerLocal() { // This is the constructor method that will be called every time an object is created. 
        // All of these are the object's DEFAULTS, which includes running the roll method   
        Random random = new Random();
        int randomNum = random.nextInt(6)+1; // the num variable is LOCAL to the constructor method 
        roll(randomNum); 
    }
    void roll(int randomNum) {
        System.out.printf("Your next random number is %d", randomNum); 
    }

}
