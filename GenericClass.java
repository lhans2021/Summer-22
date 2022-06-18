public class GenericClass <Thing , Thing2> { // this is a generic class that can accept the ref data type "Thing" and "Thing2" 
    
    Thing x; // this is one generic ref data type 
    Thing2 y;  // this is another generic ref data type 

    GenericClass(Thing x, Thing2 y) { // the constructor can take in any two ref data types which will be assigned to the "Thing" 
        this.x = x; 
        this.y = y; 


    }

    public Thing getValues() { // this one returns x which is of type "Thing"
        return x; 
    }
    public Thing2 getValues2() { // this one returns y which is of type "Thing2" 
        return y; 
    }
    public void printValues() { 
        System.out.println(x);
        System.out.println(y);  
    }

}
