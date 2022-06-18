public class ApplePhone extends Smartphone {
    
    //INHERITANCE (VIDEO 34)

    // Since Androids are smartphones and this class INHERITS from the Smartphone class, it has everything the smartphone has. But, it also has some others:

    String model; 

    ApplePhone(String model) {
        this.model = model;
    }
    @Override // this method is an overriding method because it changes the fingerPrintScan to another message.
    void fingerPrintScan() {
        System.out.println("Fingerprint scan is NOT available for this phone"); 
    }
    void Siri() {
        System.out.println("Hi, this is Siri! "); 
    }
}
