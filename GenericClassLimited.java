public class GenericClassLimited <Thing extends Number> {  // here, i am using the bounded type to limit the "Thing" to only children of the "Number" parent class 

                                                            // the "Number" parent class only includes numbers since it extends Numbers 

        Thing x; 
        GenericClassLimited(Thing x) {
            this.x = x; 
        }
    

}
