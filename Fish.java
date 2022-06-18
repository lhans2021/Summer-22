public class Fish implements Predator, Prey { // this fish class implements BOTH PREDATOR AND PREY interfaces 
    
    // INTERFACES (VIDEO 41)

    @Override  // this fish class implements both predator and prey, so it needs to override 4 methods 
    public void hunt() {
        System.out.println("The fish is hunting");
    }
    @Override
    public void kill() {
        System.out.println("The fish is killing");
    }

    @Override
    public void hide() {
        System.out.println("The fish is hiding"); 
    }
    @Override
    public void run () {
        System.out.println("The fish is running");
    }

}
