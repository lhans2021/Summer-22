public class Rabbit implements Prey { // the keyword "Implement" means that this class implements the interface, just like "extends" in inheritance

    // INTERFACES (VIDEO 41)

    @Override // we are using "overriding" to create an overiding method to implement the interface  
    public void run() {
        System.out.println("The rabbit is running"); 
    }

    public void hide() {
        System.out.println("The rabbit is hiding");
    }
    
}
