import javax.swing.JOptionPane; // Import the swing package with te JOptionPane class. 
import java.util.Scanner; // Import utility package with the Scanner class 
import java.util.Random; // Import the util package with the Random class

public class Videos1to9 {
	
	// This is the Main Method! 
	public static void main (String[] args) {
		
		// PRINTING TO THE CONSOLE (VIDEO 1)

		System.out.println("I love pizza"); // The "ln" (line) makes an indentation in the console after printing 
		System.out.println("It's really good");
		// Using escape characters in Java 
		System.out.print("I also like fries \n"); // Alternatively, use an "escape sequence" for a new line (i.e. \n) 
		System.out.print("It's also really good \n");
		System.out.println("\t Today is a great day!"); // The \t is a tab escape sequence to tab before the string 
		// When using escape characters and strings, be careful when enclosing your actual string with \ or " "
		System.out.println("\"He said you are nice\""); // If you are trying to put a string in quotes, use this format
		System.out.println("\"She said today's weather is nice\""); 
		System.out.println("\\My name is Andrew"); // Use double backslash if you want to put a backslash before the string; otherwise, compiler thinks it's an escape sequence
		
		// USING VARIABLES (VIDEO 2)
		
		// Integers
		int a; // Declaring a variable 
		a = 123; // Assigning a variable
		int b = 123; // Declaration + Assignment = Initialization 
		// Longs (if integer is too large)
		long c = 123458949249529459L; // Make sure to end the long variable initialization with "L" 
		// Doubles 
		double d = 3.14; 
		// Booleans
		boolean e = true; 
		// Characters
		char grade = 'A'; // Make sure to include SINGLE quotes 
		char symbol = '@'; // It can also include non-letters 
		// String
		String name = "Hans"; // Make sure String has a capital S! This is because it is a REFERENCE data type 
		// Concatenation 
		System.out.println("The number is : " + d + " and name is " + name);  
		
		// SWAPPING TWO VARIABLES (VIDEO 3)

		String f = "water";
		String g = "Koolaid"; 
		String temp; // Since java has no specific technique to swap, we will use a "temp" to hold the values temporarily

		temp = f; // temp is now water 
		f = g; // f is now Koolaid
		g = temp; // g is now water 

		System.out.println("f: " + f);
		System.out.println("g: " + g); 

		// GETTING USER INPUT (VIDEO 4)

		Scanner scanner = new Scanner(System.in); // Creating a new scanner object called "scanner" with lowercase s. 
		System.out.print("What is your name? \n"); 
		String name1 = scanner.next(); // One scanner class method is the next() which will take a string in from the user
		System.out.println("What is your age?"); 
		int age = scanner.nextInt(); // Another scanner class method is nextInt() which will take an integer in from the user
		System.out.println("What is your favorite fruit?"); 
		String fruit = scanner.next(); 

		System.out.println("My name is " + name1 + " and I am " + age + " years old. My favorite fruit is " + fruit); 

		// EXPRESSIONS (VIDEO 5)

		int friends = 10; 
		friends = friends + 1; 
		friends ++ ; // This has the same function as doing friends = friends + 1 (incrementor) 
		friends --; // This is a decrementor 
		System.out.println("I have " + friends + " many friends"); 

		int h = 26; 
		h = h % 4; // Modulus gives the REMAINDER of dividing those operands 
		System.out.println(h); 

		// Integer Division 
		int people = 16; 
		people = people / 9; // The division of 16 by 9 is going to yield decimals; those decimals will be truncated (removed)
		System.out.println("The number of people left is " + people); // This produces 1 because 1.7 is truncated to 1. 	
																	  // To resolve, change "int" to "double" and CAST the value

		// Casting
		double myNum = 16; // Change the type from "Integer" to "double" 
		myNum = (double) myNum / 9; // Use "(data type)" to cast! 
		System.out.println(myNum); 

		// GUI INTRO (VIDEO 6)

		// // Use JOptionPane with Strings 
		// String brand = JOptionPane.showInputDialog("Enter a brand please"); // Get user to input STRING in GUI and save to the variable, brand
		// JOptionPane.showMessageDialog(null, "Your name is " +name); 
		// // Using JOptionPane with Integers 
		// int bottles = Integer.parseInt(JOptionPane.showInputDialog("Enter how many bottles there are ")); // Must convert the string that the JOPtionPane gets into an INTEGER 
		// JOptionPane.showMessageDialog(null, "There are " + bottles + " many bottles"); 
		// // Using JOptionPane with Doubles
		// double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height? ")); 
		// JOptionPane.showMessageDialog(null, "Your height is " + height); 

		// USING THE MATH CLASS (VIDEO 7)
		double j = 3.14;
		double k = -10; 
		double jkmax = Math.max(j, k); // In the "Math" class, the "max" method finds the larger of two values! 
		double jkmin = Math.min(j, k); // In the "Math" class, the "min" method finds the smaller of the two values! 
		double jkabs = Math.abs(k); // In the "Math" class, the "abs" method finds the absolute value of the value! 
		double jksqrt = Math.sqrt(j); // In the "Math" class, the "sqrt" method finds the sqare root of the value 
		double jkceil = Math.ceil(j); // In the "Math" class, the "ceil" method ROUNDS the number UP (hence, ceiling)
		double jkfloor = Math.floor(j); // In the "Math" class, the "floor" method ROUNDS the number DOWN (hence, floor) 
		System.out.println("The larger of the two numbers is " + jkmax); 
		System.out.println("The smaller of the two number is " + jkmin);
		// Example: Let's find the hypotenuse of a triangle with user inputted sides 
		System.out.println("Enter the first side "); 
		double side1 = scanner.nextDouble(); 
		System.out.println("Enter the second side "); 
		double side2 = scanner.nextDouble(); 
		double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)); // In the "Math" class, the "pow" method raises the first argument to the power of the second argument
		System.out.println("The hypotenuse is " + hypotenuse); 

		// RANDOM NUMBERS (VIDEO 8)
		Random random = new Random(); // Notice: this looks similar to creating a scanner, but without "System.in" because no user input
		int r1 = random.nextInt(); // Notice: this generates a large number. This is because integers can hold up to 2 billion. 
		double r2 = random.nextDouble();  // Notice: this also generates a large number. Same reason. 
		int r4 = random.nextInt(5); // This will limit the random generator to 5 numbers (0-4). The (5) is the bound.
		int r5 = random.nextInt(5)+1; // This will get numbers from 1-5 since the bound of 5 gets (0-4), and adding one gets (1-5).  
		boolean r3 = random.nextBoolean(); 
		System.out.println(" " + r1 + " " + r2 + " " +r3); 

		// IF STATEMENTS (VIDEO 9)

		int myAge = 20; 
		if (myAge == 20) { // The program will check this first. If it's not true, it will go to the "else if". If it is true, it will skip everything else!! 
			System.out.println("You are an adult "); 
		}
		else if (myAge >= 75) { // The program will check this if the first "if" statement is not true. If it was true, it won't come here
			System.out.println("You are older than 75 "); 
		}
		else { // This is the last thing the program will check if nothing else was true. 
			System.out.println("You are not an adult "); 
		}




		


	

		










		
	}

}
