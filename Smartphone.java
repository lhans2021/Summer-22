public class Smartphone {
    
    // INHERITANCE (VIDEO 34)
   
    boolean fingerPrintScanner = true;
    boolean faceRecognition = true; 

    void fingerPrintScan() {
        System.out.println("Fingerprint scan successful"); 

    }
    void faceRecognize () {
        System.out.println("Face scan successful"); 
    }

    void call() {
        System.out.println("You are making a phone call ... "); 
    }
    void text() {
        System.out.println("Message successfully sent"); 
    }
}
