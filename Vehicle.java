public abstract class Vehicle { // this is the parent class 
    
    // ABSTRACTION (VIDEO 37) 

    // This vehicle class is kept "abstract" and is "locked": no objects can be created from this. 
    // The idea of a "vehicle" is too abstract-- nobody buys vehicles. Instead, they buy specifics, like "vans". 
    
    abstract void drive(); // this is an "abstract" method that contains no body; noone should be able to use this drive method on 
                            // just a vehicle. They should use the overriden "drive" method in the specific "van" class. 
                            // this abstract method is just a blueprint 
}
