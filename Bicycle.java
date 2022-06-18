public class Bicycle {
    
    // OBJECT PASSING (VIDEO 32)

    String owner; // = this.owner. This is a global variable and can be used in the entire class 

    Bicycle(String owner) {
        this.owner = owner; 
    }
    public String toString() {
        return this.owner+"'s bicycle ";  // the tostring method returns who this belongs to 
    }
}
