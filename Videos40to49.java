import java.util.*;
import java.io.*; 

public class Videos40to49 {
    
    // COPY OBJECTS (VIDEO 40)
    public static void main (String[] args) {
    //we'll use the laptop class for this 

    Laptop myLaptop = new Laptop("ASUS", "i5", 2022); // instantiating a new laptop object 
    Laptop yourLaptop = new Laptop("HP", "i5", 2023); // instantiating another laptop object 

    // now we want to copy myLaptop to yourLaptop 
   // myLaptop = yourLaptop; // NOT correct-- this makes the two laptops IDENTICAL with the SAME address! 

    // instead, we use the copy method that we created 
    yourLaptop.copy(myLaptop); // using our new "copy" method to copy myLaptop onto yourLaptop, but keeping them unique 
    System.out.println(yourLaptop.getBrand()); // this prints out ASUS because we copied it over 

    // we can also use the copy method to directly create a copy without creating the object first and then applying the method.
    // this requires OVERLOADED constructors 

    Laptop laptop1 = new Laptop("DELL", "i7", 2020); 
    Laptop laptop2 = new Laptop(laptop1); // we are using the overloaded constructor to directly create a copy 
    System.out.println(laptop2.getBrand()); // this should print out "DELL" because we created a copy of laptop1 directly  
    System.out.println(laptop2.getProcessor()); // this should print out "i7" because we created a copy of laptop1 directly
    

    // INTERFACES (VIDEO 41)

    Fish fish = new Fish(); 
    fish.hunt(); // the fish implemented the hunt method from the predator interface 

    Rabbit rabbit = new Rabbit();
    rabbit.hide(); // the rabbit implemented the hide method from the prey interface 

    System.out.println("###############################################"); 


    // POLYMORPHISM (VIDEO 42)

    Pencil woodenPencil = new WoodenPencil(); // we are initializing a wooden pencil which is ALSO A PENCIL 
    Pencil leadPencil = new LeadPencil();  // we are initializing a lead pencil which is ALSO A PENCIL 

    // WoodenPencil[] myPencils = {woodenPencil, leadPencil}; // this is not valid because a lead pencil is NOT a wooden pencil
    
    Pencil[] myPencils = {woodenPencil, leadPencil}; // this is valid because all of these children classes are PENCILS (parent class)

    for (Pencil i:myPencils) { // since every pencil has a write method that was overridden, we can use a for-each loop to write 
        i.write();
    }

    System.out.println("###############################################"); 

    // DYNAMIC POLYMORPHISM (VIDEO 43)

    Pencil myPencil; // I declared the pencil but I didn't finish initializing it. I want the user to decide what form it takes on
                    // the user decides how the pencil will morph.

    Scanner scanner = new Scanner(System.in); // created a scanner to allow users to decide
    System.out.println("Enter 1 for wooden pencil and 2 for lead pencil"); 
    int choice = scanner.nextInt(); 

    if (choice == 1) { // user wants the pencil to take on the wooden pencil form 
        myPencil = new WoodenPencil(); // we finish initializing the myPencil to become a wooden pencil 
        myPencil.write();
    }
    else if (choice == 2) { // user wants the pencil to take on the lead pencil form 
        myPencil= new LeadPencil(); // we finish initializing the myPencil object to become a lead pencil
        myPencil.write(); 
    }
    else {
        myPencil=new Pencil(); // user didn't choose, so it becomes the parent default pencil
        System.out.println("Choice is invalid");
    }

    //scanner.close(); // it's BEST PRACTICE to close a scanner 

    System.out.println("###############################################"); 


    // EXCEPTIONS (VIDEO 44)

    //Scanner scanner2 = new Scanner(System.in); 
    
    try { // we are putting some dangerous code here that might cause exceptions (crashes) 

        System.out.println("Enter a number to divide"); 
        int x = scanner.nextInt(); 
        System.out.println("enter another number to divide");
        int y = scanner.nextInt(); 
        int z = x/y; 
        System.out.println("The result is" +z); 

    }
    catch(ArithmeticException e) { //we are catching an arithmetic exception here and dealing with it (e.g. divide by zero error)
                                   // always put "e" after declaring the exception 

        System.out.println("Cannot divide by zero!");

    } 
    catch (InputMismatchException e) { // we are catching an input mismatch exception here and dealing with it
                                       // i.e. user inputs incorrect data type (mismatch of data type)

        System.out.println("Please enter valid stuff"); 


    } 
    catch (Exception e) { // we are now catching any exception possible and dealing with it. 
                          // it is true that this will handle anything, but it's good practice to handle specifics first 
        
        System.out.println("Something weng wrong... try again");

    }
    finally { // this finally block will run no matter what.
        System.out.println("Thank you"); 
        //scanner.close(); // here, we are closing the scanner as good practice 
    }

    // FILE CLASS (VIDEO 45)

    System.out.println("Enter a file name or file path"); // we're asking user to input a file name or pathway. 
    String fileName = scanner.next(); // user inputs their file name or path 

    File file = new File(fileName); // create a new file object with that user input 

    if (file.exists()) { // the file.Exists method checks to see if that file object with the name/path exists 
        System.out.println("This file exists"); 
    }

    System.out.println(file.getAbsolutePath()); // the getAbsolutePath() gives me the pathway to the file 
    System.out.println(file.getPath()); // the getPath() gives me the name of the file 
    System.out.println(file.isFile()); // the isFIle() checks to see if this is a file 
    System.out.println(file.isDirectory()); // this checks if this is a directory (folder) or not 

    System.out.println("###############################################"); 

    // FILE WRITER (VIDEO 46)


    try {
        FileWriter writer = new FileWriter("secret_message.txt"); // we created a file writer to write to secret_message_txt.
        writer.write("Hi, this is your secret text!\nYour email is: hli221@binghamton.edu"); 
        writer.append("I am appending this to your file"); // the append method ADDS stuff without deleting previous text 
        writer.close(); 

    } 
    catch (IOException e) { // this is the autogenerated exception block that must be included 
        // TODO Auto-generated catch block
        e.printStackTrace();
    } 

    System.out.println("###############################################"); 

    // FILE READER (VIDEO 47)

    try {
        FileReader reader = new FileReader("secret_message.txt"); // create the file reader 
        int charIntValue = reader.read(); // the reader will read ONE character each time the program is run. we want it to keep reading and printing until int = -1 (terminating int)

        while (charIntValue != -1) {
            char trueCharacter = ((char)charIntValue); // since the reader returns the INT value of the character, we need to cast it to a CHAR 
            System.out.print(trueCharacter); // print the current character that was casted from the INT 
                                            // NOTICE: we did not use the "println", but only "print", because otherwise, it will print the character on a new line EVERY time
            charIntValue = reader.read(); // read the next character and then repeat the loop to convert and print until the int = -1 
        }
        reader.close(); // good practice to close the reader
    }
    catch (FileNotFoundException e) { // this exception must come first. 
        e.printStackTrace();
    }
    catch (IOException e) { // this IOException handles every exception in the io class, hence, "IOException" like "Exception" 
        e.printStackTrace();
    }
    


    }





}



