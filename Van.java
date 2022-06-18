public class Van extends Vehicle { // this is a child class 
    
    // ABSTRACTION (VIDEO 37) 

    Van() {
        drive(); 
    }

    @Override
    void drive() {
        System.out.println("The van is now driving "); 
    }

    // Notice here that we are implementing that drive method from the "vehicle" class that was abstract. 
    // we override that abstract method and actually use it here in the child class. 
}
