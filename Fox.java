public class Fox implements Predator { // this fox class implements the predator interface 
     
    // INTERFACES (VIDEO 41)

    @Override // we are using the idea of "overriding" to create overriding methods so that we can implement the predator interface
    public void hunt() {
        System.out.println("The fox is hunting");
    }

    @Override
    public void kill(){ 
        System.out.println("The fox is killing"); 
    }

}
