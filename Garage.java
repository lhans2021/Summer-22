public class Garage {
 
    // OBJECT PASSING (VIDEO 32)

    // Without this part below that is commented out, the logic still works fine. This is optional-- you can use it if you want to keep the same format
        // Bicycle bicycle; // = this.bicycle. This is the bicycle that was passed in and can we used globally 

    // Garage(Bicycle bicycle) { // to pass objects of the Bicycle class, we need to set the parameter as accepting Bicycle objects  
    //     this.bicycle = bicycle; // we save the bicycle object being passed in as a global variable so we can use this passed in bicycle object throughout this class 

    // }
    void park(Bicycle bicycle) { // this is a park method that has a bicycle as its parameter and will park the bike 
        System.out.println(bicycle+" is now parked");  
    }

}
