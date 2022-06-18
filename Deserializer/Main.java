package Deserializer;

import java.io.*; 

public class Main {
    
    // Deserializing 

    public static void main (String[] args) {

    User user = null; // declare the object, but don't instantiate

    try {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\0202i\\Documents\\Coding\\Bro-Code-CrashCourse\\Serializer\\UserText.ser");
        ObjectInputStream in = new ObjectInputStream(inputStream); 
        user = (User) in.readObject(); 
        // now our object's state is loaded back in

        // let's check: user's weight should be 164.4
        System.out.println(user.weight); 
        inputStream.close();
        in.close();

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID(); // this serialVersionUID must match that of the object serialized in the Serializer Main class
                                                                                                // otherwise, InvalidClassException 
        System.out.println(serialVersionUID);
        
    }
    catch (FileNotFoundException e) {
        e.printStackTrace(); 
    }
    catch (InvalidClassException e) { // this exception is if the serialVersionUID's don't match. 
        System.out.println("serialVersionUID's don't match");
    }
    catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    }
    
}
