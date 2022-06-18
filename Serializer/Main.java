package Serializer;

import java.io.*; 

public class Main {
    
    public static void main (String[] args) {

    // SERIALIZATION (VIDEO 75)

    User user = new User(); // we instantiated a user object. 

    user.age = 18;
    user.name = "Hans"; 
    user.weight = 164.4; 

    // now we want to save that user information into some .ser file 

    try { // we need to use the try-catch block since we are dealing with files 
        
    FileOutputStream outputStream = new FileOutputStream("UserText.ser"); // this is step 4 
    ObjectOutputStream out = new ObjectOutputStream(outputStream); // this is step 5
    out.writeObject(user); // this is step 6 -- sending the information to the .ser file 
    outputStream.close(); // this is step 7 -- always close 
    out.close();

    long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID(); // this get's the serialVersionUID 
    System.out.println(serialVersionUID); 

    } 
    catch (FileNotFoundException e) { // these are the two exceptions we need when dealing with files
        e.printStackTrace(); 
    } catch (IOException e) {
        e.printStackTrace();
    }

    System.out.println("This user's info is saved "); 

    // now we want to retrieve that user info from the UserTex.ser 
    // CHECK DESERIALIZER!! 

    
    }
}
