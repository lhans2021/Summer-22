import java.util.Scanner; // Need this for scanner (input) 
import java.util.ArrayList; // Need this for array list 


public class Videos10to19 
{
    public static void main(String[] args) {
        
        // SWITCH STATEMENT (VIDEO 10)

        String time = "12PM"; // This is the variable that we are comparing for equality with other values 
        switch (time){ // This is the switch statement that will take the variable, time, and compare for equality with the cases 
            case ("12PM"): System.out.println("It is 12PM! ");  // This is the first case
            case ("1PM"): System.out.println("It is 1PM! "); // This is the second case
            case ("2PM"): System.out.println("It is 2PM! "); // This is the third case
            case ("3PM"): System.out.println("It is 3PM! "); // This is the fourth case 
            // Notice, Java prints out EVERY print statement. This is because we don't have  "break". How it works is that
            // without the break, as soon as the program finds a match to a case, it will run that block of code and everything else after
        }
        String time2 = "7PM";
        switch(time2) {
            case("4PM"): System.out.println("It is 4PM! "); 
            break; 
            case("5PM"): System.out.println("It is 5PM!" ); 
            break;
            case("6PM"): System.out.println("it is 6PM! "); 
            break;
            default: System.out.println("There are no matching cases! "); // The default statement is like the "else" block. 
        }   

        // LOGICAL OPERATORS (VIDEO 11)

        // && Operator 
        int temp = 75; 
        if (temp >= 90) {
            System.out.println("It is reallly hot! ");
        }
        else if (temp >= 75 && temp < 90){ // This "else if" statement will evaluate to true IF AND ONLY IF both boolean expressions are true
            System.out.println("It is hot!" );
        }
        else {
            System.out.println("It is warm or cold, but NOT hot ");
        }
        // || Operator
        String play = "Q"; 
        if (play.equals("Q") || play.equals("q")){ // This "if" statement will evaluate to true if ONLY ONE of the expressions is true
            System.out.println("Exiting game ... "); // Please note that to compare strings, we must use the string method, .equals. Using == will compare addresses
        }
        else {
            System.out.println("Continuing the game ... ");
        }
        // ! Operator
        String grade = "a";
        if (!grade.equals("A") && !grade.equals("a")){ // The "!" will see if the grade is not an A or not an a. 
            System.out.println("You did not get an A in this class ");
        }
        else {
            System.out.println("You got an A in the class! "); 
        }

        // WHILE LOOPS (VIDEO 12)

        String userName = ""; 
        Scanner scanner = new Scanner(System.in); 
        while(userName.isBlank()){ // The "isBlank" method sees if a string is empty. 
            System.out.println("Enter your username, please ");
            userName = scanner.nextLine(); // The "nextLine" will read input from the user until there is a line change. Simply using "next" will read input until the user enters a space. 
        }   
            // Do-While loop 
        int a = 0; 
        do { // This "do" loop will execute AT LEAST once, since it comes before the while loop. 
            System.out.println("Initializing the program ..."); 
            a++; 
        } while (a == 0); // In this case, since the value of a is now 1, a is now equal to 0, and the whole do-while loop will exit. 
        
        // FOR LOOP (VIDEO 13)

        int loopNumber = 1; 
        for (int i = 60; i >=0; i--) { // The for loop is going to execute the code as long as the counter, i, is greater than or equal to 0. It will execute 61 times. 
            System.out.println(i);
            System.out.println(loopNumber); 
            loopNumber++; 
        }

        // NESTED LOOPS (VIDEO 14)

        System.out.println("Please enter a number of rows "); 
        int rows = scanner.nextInt();
        System.out.println("Please enter a number of columns "); 
        int columns = scanner.nextInt(); 
        System.out.println("Enter a symbol you would like to create the rectangle with "); 
        String symbol = scanner.next(); 
        // This program creates an mxn rectangle of symbols. 
        for (int i = 1; i <= rows; i++) { // This goes to the m-th row and executes the nested for loop, then goes to the next row
            for (int j = 1; j <= columns; j++) { // This nested for loop will print out the symbol n times, because there are n columns in each row 
                System.out.print(symbol);
            }
            System.out.println(); 
        }
        // Let's convert this into a matrix... create an mxn martix of symbols 
        for (int i1 = 1; i1 <= rows; i1++) {
            System.out.print("{"); 
            for (int j1 = 2; j1 <= columns-1; j1 ++) {
                System.out.print(symbol);
            }
            System.out.print("}");
            System.out.println();  
        }
        

        // ARRAYS (VIDEO 15)

        // Method 1 of creating arrays: create an array with values already included 
        String[] names = {"andrew", "Hanna", "Lance", "Liying"}; // Note that there is a [] after the data type. This means it is a string of that data type
        names[0] = "Hans"; // To access an value, write the name of the array and the position of the value. 
        for (int index = 0; index < 4; index++){
            System.out.println(names[index]);
        }
        // Method 2 of creating arrays: initialize an array and specify the dimension without including the values 
        boolean[] myBooleans = new boolean[3]; // This is initializing an array of 3 booleans, which means index goes from 0 to 2

        myBooleans[0] = true;
        myBooleans[1]= false;
        myBooleans[2] = true; 

        for (int index1 = 0; index1< myBooleans.length; index1++){ // Note here, the .length method returns the number of elements in the array
            System.out.println("\t" + myBooleans[index1]);
        }

        // 2-D ARRAYS (VIDEO 16)

        // Method 1 of creating a 2D array: create the matrix with the values already included 
        String[][] brands = { {"Toyota, Honda, Ford, Dodge"}, // Notice here that we use two [][]. First one is for rows, second for columns 
                              {"Nike, Adidas, Sketchers, Puma"},
                              {"Dell, Samsung, Apple, HP"}                            
                            };
    
        // Method 2 of creating a 2D array: initialize the array and specify its dimension without including the values 
        String[][] cities = new String[2][3]; // This is initializing a 2x3 matrix or 2D array without the values 
        
        cities[0][0] = "NYC"; // This is the 1st row (0th index), 1st column (0th index),and so on, up to the 2nd row (1st index), 3rd column (2nd index)
        cities[0][1] = "Seattle";
        cities[0][2] = "Boston"; 
        cities[1][0] = "Beijing"; 
        cities[1][1] = "Seoul"; 
        cities[1][2] = "Taipei"; 

        for(int row = 0; row < cities.length; row++) { // The .length of a 2D array tells how many rows there are, which is 2 in this case 
            for (int column = 0; column < cities[row].length; column++) { // The length of cities[row].length is the number of columns there are in that specific row,  the length of a regular array 
                System.out.print(cities[row][column]+" "); 
            }
            System.out.println(); 

        }

        // STRING METHODS (VIDEO 17)

        String day = "Sunday"; 
        String space = "      SPACE     "; 
        int r1 = day.length(); // Returns the length of the string
        char r2 = day.charAt(2); // Returns the character at index 2 
        int r3 = day.indexOf('d'); // Returns the index that the character 'd' is located at
        boolean r4 = day.isEmpty(); // Returns whether or not this string is empty
        String r5 = day.toUpperCase(); // Returns a new string with everything uppercase 
        String r6 = day.toLowerCase(); // Returns a new string with everything lowercase
        String r7 = space.trim(); // Returns a new string with all of the space removed 
        String r8 = day.replace("Sun", "Satur"); // Replaces "Sun" with "Satur" to create "Saturday" 

        System.out.println(r8); 

        // WRAPPER CLASSES (VIDEO 18)

        // Autoboxing: we are now creating object wrapper class versions of their corresponding primitive data type version
        Boolean a1 = true; // Initialized a Boolean object / ref data type / wrapper class
        Character a2 = '@'; // Initialized Character object / ref data type / wrapper class 
        Integer a3 = 123; // Initialized Integer object / ref data type / wrapper class
        Double a4 = 3.14; // Initialized a Double object / ref data type / wrapper class
        // We can call methods on these now objects, treating them not as primitive data types 
        System.out.println(a1.equals(false)); // This should print false because a1 = true which isn't equal to false. 
        // Unboxing: we are now treating these objects as their original data types
        if (a2 == '@'){ // We treat "a2" as a regular primitive data type, which allows for an equality (==) comparison 
            a2 = '%';
            System.out.println("a2 is now "+a2); 
        }

        // ARRAYLIST (VIDEO 19)

        ArrayList<String> chocolate = new ArrayList<>(); // This is the initialization of my ArrayList of Strings

        chocolate.add("KitKat"); // To add things to the array list, we must use the ".add" method! 
        chocolate.add("Twix"); 
        chocolate.add("Snickers"); 

        chocolate.set(0, "M&M"); // To change certain things in the array list, we must use the ".set" method! 
        chocolate.remove(1); // To remove certain things from the array list, we must use the ".remove" method!
        // chocolate.clear(); 

        for (int choco = 0; choco < chocolate.size(); choco ++) { // To get the size of an arraylist, use the ".size" method! 
            System.out.println(chocolate.get(choco)); // To get a particular element from an arraylist, use the ".get" method! 
        }


        
        }

} 


