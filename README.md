# Introduction to Programming in Java 

## Note that while this theory information is good to know (definitions, etc), LEARN the language first. Then you can come back and figure out how these definitions and terms connect to your actual coding abilities. 

Side Note: if I were to describe the essence of programming, I would divide programming into 3 categories: 
    - Sequential Flow: here, everything in the program runs from start to end without loops, manipulations, and more. 
    - Control Flow Statements added: here, the program runs with whatever basics of programming (e.g. variables, methods, input) but can go in a non-sequential order due to control flow statements
    - Functions, classes, GUI, and dealing with files added: here, functions wrap the different things from the control flow sector, which are all wrapped into classes. Also, the user can interact with the program through a visual interface (GUI) and the program can deal with files. 

1. Java is a very versatile language: web apps, android apps, and businesses 

2. Computers understand two things: 
    - Machine Code: all 0s and 1s which are expressed in hex digits (as learned in CS120's conversion of MIPS assembly to hex)
    - Source Code: the high level code that WE write and understand 
        - In java, this will be a .java extension 
    - Byte Code: an intermediary between source and machine code for cross platform
        - The idea is, when you write a code on your computer, your computer can compile, but your friend's cannot. But his computer can deal with byte code. So you can share your code that way. 
        - In Java, this will be a .class extension 

3. JDK (Java Development Kit): a bunch of developer tools for download
    - JRE (Java Runtime Environment): has a bunch of libraries and toolkits 
    - JVM (Java Virtual Machine): can translate byte code to machine code 

4. IDE (Integrated Development Environment): software used to build and run programs 
    - Text Editor
    - Debugger
    - Compiler 

5. Escape Sequence: a character right after a backslash, \
    - \n = makes a new line after the string 
    - \t = makes a tab before the string 

6. Variable: something that holds data 
    - Boolean: true or false
        - Only uses 1 bit (because true or false --> 0/1)
    - Integer: stores some whole number value up to 2 billion 
        - Uses 4 bytes 
    - Long: stores some whole number up to 9 quintillion
        - Uses 8 bytes 
        - MUST include "L" at the end (e.g. long x = 12345L) 
    - Float: stores decimals up to 6-7 digits 
        - Uses 4 bytes
        - MUST include "f" at the end (e.g. float y = 2.456f) 
    - Double: stores decimals up to 15 digits 
        - Uses 8 bytes 
    - Char: stores a character 
        - Uses 2 bytes 
    - String: stores a "string" of characters 
        - Size depends 

7. Primitive vs Reference Data Types: 
    - Primitive Data Type: boolean, integer, double, character. 
        - Begins with lower case letter (b in boolean) 
        - Faster
        - Uses less memory 
        
    - Reference Data Type: string, and much more. These are OBJECTS  
        - Begins with capital letter (S in String) 
        - User defined. 
        - Slower
        - Uses more memory 

8. Expression: a bunch of operators and operands without an equal sign 
    - Operator: things that work on the operand (e.g. +, -, *, **, %) 
    - Operand: values, quantities, and other data

9. GUI (Graphical User Interface): allows user to interact with computer using displayed graphics (e.g. buttons) 
    - In Java, you must "import javax.swing.JOptionPane" 
    - Look at the .java file for a few useful methods of the JOptionPane class

10. If Statement: a statement which execute a block of code if a condition is true 

11. Switch Statement: a statement that will test to see if a variable is equal to some other values. Needs 3 key words:
    - "Switch"
    - "Case"
    - "Break" !!! 
    - Default 

12. Logical Operators: operators used to connect expressions
    - && (and): produces true if and only if ALL the expressions are true 
    - || (or): produces true if and only if ONE of the expressions is true
    - ! (not): produces true if and only if some value is NOT equal to another 

13. While Loops: code that will execute as long as a condition is still true 

14. Do-While Loops: a variation of the "while" loop in which the "do" loop comes before the "while" loop and will DEFINITELY execute at least once because the condition is checked AFTER the "do" loop. 

15. For Loops: a loop that will execute a code FOR the amount of times stated. 
    - Has a specific format: for (initialize counter, condition, increment/decrement index counter)

16. Nested Loops: loops inside other loops (think about a nest holding a bunch of other things)

17. Array: variables that store several values of the SAME data type. 
    - This is a reference data type
    - Consider this regular array as a row vector with a certain number of columns, which is the number of elements. 

18. 2D Array: arrays inside of an array. 
    - Consider a 2D array as an entire matrix of rows and columns. 

19. 2 Methods to Create Arrays:
    - Method 1: create an array with the values already included 
    - Method 2: initialize an array with the dimensions specified but not with the values included 

20. String Methods: certain functions that can be applied to a string object to help the programmer 
    - ".equals("string")" method checks to see if a string variable is the same as another string. It is CASE SENSITIVE! 
    - ".equalsIgnoreCase("string")" method checks to see if a string variable is the same as another string. It is NOT CASE SENSITIVE! 
    - ".length" method returns the length of a string 
    - ".charAt[index]" method returns the i-th index of the string 
    - ".indexOf['character'] method returns the index that the character is at 
    - ".isEmpty" method returns whether or not a string is empty 
    - ".toUpperCase" method makes all the characters in a string uppercase 
    - ".toLowerCase" method makes all the characters in the string lowercase
    - ".trim" method removes all of the empty spaces 
    - ".replace['old character']['new character']" method replaces one character with the other   

21. Wrapper Class: the reference data type version / object version of a primitive data type 
    - The advantage of using wrapper classes is that there are useful methods associated with these, since they are reference data types and thus, objects. 
        - Recall, the reference data type, String, has those useful methods since it is an object (an object is part of a class)
        - *To use these methods, first AUTOBOX data into an object/ref data type and then do "variable." to see the methods 
    - Note: the wrapper class version of a data type is the primitive data type spelled out completely with an uppercase letter to begin with, since it's a reference data type now. 
    - Ex: An "int" is a primitive data type; it's wrapper class is an "Integer" 
    - Autoboxing: converting from a primitive data type to a reference data type 
        - To autobox, we simply list the data type using the naming convention above 
    - Unboxing: vice versa 

22. ArrayList: an array that contains REFERENCE data types (i.e objects) and can be RESIZED after compile time.
    - This is something that "normal" strings cannot do 
    - To make one:
        - "import java.util.ArrayList;"
        - "ArrayList<(reference data type)> (name of string) = new ArrayList<>();" 
    - Useful methods: 
        - ".add" is a method that adds something to the arraylist
        - ".size" returns the size of that arraylist
        - ".get(i)" returns the specific element of the arraylist at index i
        - ".set(index, element)" changes a specific element at an index with another element
        - ".remove(index)" removes a particular element at an index 
        - ".clear" removes everything from the arraylist 

23. 2D ArrayList: an arraylist within an arraylist, similar to standard 2D arrays
    - To make one: 
        - "ArrayList<ArrayList<(ref data type of the arraylists you want to combine)>> = new ArrayList<>();" 

24. For-Each Loop: exactly what it sounds like-- an easy way to iterate through each element of a collection 
    - Equivalent to: "for (int i = 0; i < (list); i++)" 
    - To create:
        - "for (data type i : collection name)" 
    - More readable
    - Less Flexible 

25. Methods: blocks of code that run when they are invoked (i.e called upon) 
    - We can pass data into the methods, as long as we specify the type of the data being sent in. 
        - Arguments: what we pass in
        - Parameters: what the method receives 
    - Needs to have a return types
        - Void: means the method returns NOTHING. It's void. 
        - Int: means the method returns an integer. 
        - Double: means the method returns a double value.
        - etc ...

26. Overloaded Methods: methods that have the same name but different parameters 
    - Same method name, different parameters --> different method signature 
    - Method Signature: method name + parameters 
    - Basically, the point of overloaded methods is to be able to call the same method but CHOOSE how many arguments to pass in

27. printf() is a method that is used to print a controlled or formatted string to the console 
    - The structure is: "System.out.printf("string", object/value/variable)
        - Somewhere in the "string" part, you will have a format specifier (%): "%(flag)(precision)(width)(conversion character)" 
        - *Think of the format specifier as a "secret code" that will do something to that object/value/variable  
            - CONVERSION CHARACTERS: used to specify the data type of the object/variable/value being added
                - *These are the LAST to come after "%d" 
                - "%s" : conversion-character for displaying a string
               - "%d": conversion-character for displaying a decimal (integer)
                - "%b": conversion-character for displaying boolean 
                - "%f": conversion-character for displaying floats AND DOUBLES 
                - "%x": conversion-character for displaying a hex number 
            - WIDTH: used to add spaces at an exact location  
                - *These are the SECOND LAST to come after "%" 
                - "%(width)": the number specified for width will that many spaces at that exact part of the string 
            - PRECISION: used to tell the compiler how many decimals to display 
                - *These are the THIRD LAST to come after "%f"
                - "%(.precision)f": the number specified for the precision is how many decimal numbers to include (i.e. how precise the value should be)
            - FLAG: add certain effects like + or - signs, commas, etc.. to values   
                - *These are the FIRST to come after "%" and can be combined with any of the above
                - "%-": left-justify / to add spaces on the right side after the value
                - "%+": add a positive OR NEGATIVE sign to the value
                - "%0": to add some zeros to a value
                - "%,": to add commas (e.g. 1,000) 


            - NOTE THAT NOT ALL OF THESE CAN BE USED AFTER ONE %. You might have to break them into chunks
                - For instance, you might need to use "%10" and then "%.3f". If you do "%.310f" then it will round to 310 decimal points!   

28. "Final" Keyword: makes a variable IMMUTABLE (i.e. unchangeable)
    - Ex: "final double MYNUM = 5" 
        - This variable, MYNUM, is always equal to 5. It cannot be changed to anything else. 
    - The common practice is to name the final variables with ALL CAPITAL LETTERS 

29. Objects in OOP: instances of a class. Objects have:
    - Methods: what actions the object can perform
    - Attributes: what characteristics the objects have 
    - *Think of objects as immitating those actual objects around you. For example, your water bottle has different attributes such as holding cold water, being slim, being grey, and more. The water bottle can also have methods (functions) like drink and spill. We can create such objects using a class too
    - To create an instance of a class:
        - "(class name) (your name for the object) = new (class name)();" 
    - To access attrbiutes of the object: 
        - "(oject name).(attribute name);"
    - To access methods of the object:
        - "(object name).(method name)();"

30. Constructors: special methods that are used to instantiate objects with certain DEFAULT PARAMETERS  
    - Recall: to instantiate an object, "(class name) (name of object) = new (class name)();" 
        - The "(class name)();" is the CONSTRUCTOR 
        - We can pass in arguments when we are calling the constructor to give the object UNIQUE DEFAULT ATTRIBUTES 
            - But, to pass in arguments, we must define the constructor method IN THE CLASS where it came from and allow it to take in parameters 
            - If we want to use those parameters GLOBALLY within the object's class, we need to:
                1. Define global variables in that class
                2. Set each parameter equal to "this.(global varaiable)"  

31. Variable Scope: where in the program the variable is visible/usable
    - Local Scope: a variable is defined inside a method and only accessible inside that method 
    - Global Scope: a variable is defined outside a method but within a class so it is accessible anywhere inside the class 

32. Overloaded Constructors: constructors that have the same name in a class but different parameters 
    - Pretty much the same concept as overloaded methods, as constructors ARE METHODS! 

33. toString() method: a special method that all objects have which us to print the objects as strings 
    - Usually, this lets their attributes be displayed 
    - But, we must DEFINE the toString() method in the object's class 
        - "public String toString()" 

34. Creating an array of objects: 
    - It's just like a regular array, NOT LIKE AN ARRAYLIST, but you need to remember that if you want to print an object, you must create/define a toString() method to represent it textually 

35. Passing objects as arguments: 
    - To pass an object as an argument into another method's parameter, it is same idea as passing non-objects (e.g. regular integers) except that we need to declare the object's data type (i.e class) in the parameters
    - Look at the bicycle + garage example 

36. "Static" Keyword: a modifier that makes a variable or method independent of the objects of the class. It's always there. 
    - Every instance of that class has access to that method or variable and you can directly access it by using 
        - "(class).(method/var)".  
    - If the variable is NOT static, each time you create an object, that object has a unique version of that variable. 
    - If the variable IS static, each time you create an object, that version of the variable maintains a state and can be updated
    - In a class, the static variable makes the variable "global" within the class, like being able to use it in the main method. 

37. Inheritance: classes takes attributes from other classes 
    - Think of biology: when an individual inherits, it takes a version of the gene (allele) from the parnts 
    - Parent Class: where the attributes came from
    - Child Class: the class that inherited 
    - To allow a child class to inherit: 
        - "public class (child class name) extends (name of parent class)" 

38. Method Overriding: a child class rewrites and overrides a method that it inherited from the parent class
    - Overriding Method: the method in the child class that overrides the parent method
        - The overriding method should have "@Override" above for other developers 
    - Overridden Mehod: the parent method that was overridden 

39. "Super" keyword: a modifier similar to the "this" keyword but is used to access stuff from the PARENT class 
    - It is used to access the PARENT class' constructor AND methods 
    -  If a parent class has a constructor, the child class will also need a constructor. Typically, what would happen is that in the child class, you would call the super() within the child class constructor to inherit the stuff from the parent AND THEN initialize any new variables using "this.var" 

40. "Abstract" keyword: a modifier that "locks" a class 
    - The idea is, these parent classes are too "abstract" and should be kept secure; the only objects and methods that should be accessible are in their child classes, whom inherit those abstract methods from them. 
        - Ex: A parent class "vehicle" is too "abstract": no customer goes and asks to buy a vehicle. They ask to buy specific types, like "cars", which is a child class that borrows methods from the parent.  
    - When applied to classes, don't allow objects to be instantiated from them 
        - "abstract (class) (class name)" 
    - When applied to methods, prevents the methods from having bodies
        - "abstract (return type) (method name)" 
        - Instead, the child class will implement the method. 

41. Access Modifiers: add security to our programs in terms of what can access what 
    - Package: a folder of java classes' source code 
        - Ex: "Package 1" is a package 
        - To access different packages, we need to import them. 

    - (Default) Modifier: no keyword is applied when the default modifier is used 
        - When the default modifier is applied, only classes in the SAME package can see those default classes, methods or data 
    - Public Modifier: the keyword "public" is applied when this is used 
        - When the public modifier is applied, any class in any package can see those public classes, methods or data, as long as you are in the SAME PROJECT FOLDER 
        - In this case, we are in the same "Bro-Code-CrashCourse" project folder 
    - Private: the keyword "private" is applied when this is used 
        - When the private modifier is applied, the data or methods are only accessible in the SAME class and same package. 
    - Protected: the keyword "protected" is applied when this is used 
        - When the protected modifier is applied, any CHILD/SUB class in any package can see those classes, methods, or data, as long as those information are in the child class' PARENT/SUPER CLASS. 

42. Encapsulation: keeping your class attributes private and only accessible through getters and setters
    - Developers typically use encapsulation unless there's a good reason to make the attributes public 
    - Getters: methods that must be defined in a class to ACCESS those private attributes 
        - "public (data type) get(variable)" 
    - Setters: methods that must be defined in a class to SET/CHANGE those private attributes 
        - "public (data type) set(variable)" 
    - *These are both methods that can be called to ACCESS and SET those private attributes. This way, we can change those attributes and get them indirectly, but no class has DIRECT access to them. 

43. Copying Objects: making a copy of an object in which two objects have the same attributes but different memory addresses
    - i.e.: two unique objects but same characteristics 
    - To do this, we need to create a copy() method in the object's class 

44. Interfaces: templates for classes specifying what attributes and/or methods those classes must implement 
    - This is similar to the idea of a PARENT CLASS specifying things that a CHILD CLASS inherits, except multiple classes can "inherit" from one interface 

45. Polymorphism: the idea of an object taking on multiple forms. Typically, this involves inheritance: the "parent" class will take on different forms, AKA their "child" classes 
    - Typically, this allows us to put objects of different types in an array because all of these objects share the same data type of the parent class. Otherwise, there would be NO OVERLAPPING DATA TYPE to initialize the array 
        - Recall: to initialize an array, we  need to specify the data type 

46. Dyanmic Polymorphism: polymorphism during runtime: it is when an object takes on multiple forms during runtime (after compiling)
    - Dynamic: during runtime

47. Exception Handling: 
    - Exceptions: an event that disrupts the execution of code, typically crashing the program 
    - In Java, to handle exceptions, we can use the
        - try, catch, and finally blocks 
            - Try: this is where we put "dangerous" code that might cause our program to crash 
            - Catch: this is where we catch and deal with exceptions
                - Typically, we try to catch specific exceptions and then catch all exceptions (i.e. "Exceptions e")
            - Finally: a block of code that will always run 

48. File Class: the file class, java.io.File, is a class that allows us to create file objects to access our computer's files 
    - To create: 
        - "import java.io.File"
        - File (object name) = new File("file path and file name") 
    - Some userful methods: 
        - file.Exists() = checks to see if that file object with the given file name or path exists 
        - file.getPath() = returns the name of that file
        - file.getAbsolutePath() = returns the pathway to that file 
        - file.isFile() = checks to see if that file is a file 
        - file.delete() = deletes that file 
    
49. Writing to Files: to write to a file, we need the FileWriter class also in the io package 
    - This FileWriter class is different from the File class: the File class just creates an object with the file name/path; the FIleWriter class creates an object to write / add stuff to a file 

    - To create: 
        - "import java.io.FileWriter"
        - "FileWriter (object name) = new FileWriter("file name or pathway to it")
            - You can include an existing file name OR a new file you want to write to. 
    - You will need:
        - try block 
            - Create filewriter 
            - Use it
            - Close it  
        - catch block (since this is considered dangerous code)  
            catch(IOException e)
                e.printStackTrace();
    - Some useful methods: 
        - writer.write() = writes something NEW every time it is called. Be careful that this will override previous text each time you run the program! 
        - writer.append() = ADDS new text without overriding old ones
        - write.close() = good practice to close the writer when finished
            - * IF YOU DON'T CLOSE IT, THE WRITER WON'T WRITE!!  

50. Reading from Files: to read from a file, we need to use the FileReader class from the io package 
    - The FileReader class reads from a file CHARACTER BY CHARACTER and returns the INT value of the character. We need to CAST this int value into a character value so that we can understand it. 
        - When the INT value reaches -1, there is nothing left to read! 

    - To create: 
        - "import java.io.FileReader"
        - "FileReader reader = new FileReader("File name or pathway")"

    - You will need: 
        - try block 
            - Create the filereader
            - Use it in a while loop while the int return is not -1 
            - Close the filereader 
        - catch block (since the code is dangerous) 
            catch (IOException e) {
                e.printStackTrace();
                }
            catch (FileNotFoundException e) {
                e.printStackTrace(); 
                }
    
    - Some useful methods: 
        - reader.read() method will return ONE int value of the following character each time the program runs. 

51. Generic Methods: methods that can accept any reference data type as a parameter, no matter what class it belongs to 
    - To create:
        - "public static <Thing> (return type) (method name)" 
            - Here, the "Thing" is whatever reference data type is passed in. Basically, we're passing in our own data type to deal with 

52. Generic Classes: classes that can accept any reference data type as a parameter, no matter what class it belongs to 
    - To create:
        - "public class (class name) <Thing, Thing2>" (depending on how many parameters you want) 
            - Here, "thing" refers to whatever reference data type you want to pass in
            - Remember, it doesn't have to be "thing"; it can be "k", "v", "xyz", "blablabla", whatever. 
    - To instantiate:
        - (generic class name) <(Thing), (Thing2, etc)> = new (generic class name)<>();

53. Bounded Types: ways that we can limit the types of ref data types that our generic class can accept 
    - To do so, we need to extend the "Thing" to whatever parent class we want to limit the ref data type to 

54. Serialization: saving an object's information in a .ser file (bytestream)
    - We sent the object's information as a byte stream 
    - To do this: 
        1. "import java.io.*" in the object's class and the main class 
        2. Let your object's class extend the Serializable interface ("... implements Serializable")
        3. Create try-catch blocks to catch FileNotFoundException e and IOException e 
        4. "FileOutputStream outputStream = new FileOutputStream("desired .ser file");"
        5. "ObjectOutputstream out = new ObjectOutputStream(outputStream);" 
        6. "out.writeObject(object's name);" 
        7. Close everything
            - "outputStream.close();"
            - "out.close();" 
            
55. Deserialization: loading a saved file into an object to restore the state
    - To do this: 
        1. "import java.io.*;" in your main class and object class
        2. Make sure your object's class implements the serializable interface ("... extends Serializable")
        3. Create try-catch blocks to catch ClassNotFoundException e, FileNotFoundException e, and IOException e
        4. Declare the object, but don't intialize! ("(object class) (object name) = null;")
        5. "FileInputStream inputStream = new FileInputStream(".ser file pathway");" 
        6. "ObjectInputStream in = new ObjectInputStream(inputStream);"
        7. "(object's name) = (Object's class starting with capital letter -- casting) in.readObject();"
        8. Close everything
            - "inputStream.close();"
            - "in.close();"

56. Static vs Non-Static Methods REVISITED (LinkedIn Course) 
    - Static Methods: methods that don't need you to create an instance of the class to use. You can just use it directly 
        - Ex: Math.pow(a, b) doesn't require you to create a Math object (Math math = new Math()) first. 
        - Static Methods are also known as "Class Methods"
        
    - Non-Static Methods: methods that require you to create an instance of the class to use. 
        - Ex: myTriangle.findArea() requires a Triangle object first (Triangle myTriangle = new Triangle(1.5, 2, b))
        - Non-Static Methods are also known as "Instance Methods" 

57. Static vs Non-Static Variables REVISITED (LinkedIn Course)
    - Static Variables: variables that don't need you to create an instance of the class to use. It's always there and is always accessible by all class objects. 
        - This variable can be updated instantly and every instance of the class will have the updated variable 
        - Static Variables are AKA "Class Variables"

    - Non-Static Variables: variables that require you to create an instance of the class to use. It has a unique value for each object 
        - Non-Static Variables are also known as "Instance Variables" 

58. Important Serialization Reminders: 
    - Children classes of parent classes that implement serialization will also implement serialization (inheritance) 
    - Only OBJECTS can be serialized; static fields cannot because static things do not require objects to be created 
    - When we deserialize, we need to cast the object to the object's type, because the default is the type Object, not the class type 
    - If something is 'transient', it is not serialized 
    - serialVersionUID is a unique version ID for each serialized thing 

59. serialVersionUID: a version ID number that's created for every serialized object 
    - This makes sure that objects are compatible: if the serialVersionUID's dont' match, deserialization cannot happen. 
        - Think of it like a locker password: if I want to acces someone else's locker, I cannot, because I don't know their password. I'm not able to "deserialize" and extract their belongings. 

    - To get the serialVersionUID of the object, do the following: 
        - "long serialVersionUID = ObjectStreamClass.lookup(objectName.getClass()).getSerialVersionUID();"

    - It is recommended that you add a unique serialization number. To do this, go to the class of the object you want to serialize (SERIALIZER in this case) and add:
        - "private static final long serialVersionUID = (add a number)" 

    - If the serialVersionUID's don't match, you will get an InvalidClassException. Thus, we should add
        - "catch (InvalidClassException e)" to the try-catch block of the DESERIALIZER! 

60. Timer: a way to keep track of time
    - To create: 
        - "import java.io.*"
        - "Timer timer = new Timer();" 
    - To stop timer: 
        - "timer.cancel()" 

61. TimerTask: a task that will be done at a specific time based on the timer 
    - To create: 
        - "import java.io.*"
        - "TimerTask task = new TimerTask() 
        {
            @Override
            public void run() {
                #Whatever you want to run
            }
        }"

    - KEEP IN MIND, THE TIMERTASK IS A THREAD. That's why this syntax looks weird as of now. 
        - The stuff inside the curly braces of the TimerTask is what we call an "Anonymous Inner Type". It's all foreign now. 

62. To run the task and timer above together, some methods include: 
    - "timer.schedule(task name, delay in milliseconds)": performs a task after a delay in milliseconds 
    - "timer.schedule(task name, myCalendar.getTime());" performs a task at a certain time set to the calendar (SEE BELOW) 
    - "timer.scheduleAtFixedRate(task name, delay, period);" performs a task continuously.
        - task name is the task to be done
        - delay is how long to wait before executing task
        - period is how long until executing the task again 
        - WARNING: this may become an infinite loop if you don't let the myTask end at a certain time or mark!!!!! 

63. Calendar: used to set a certain date to do something or get the current date
    - To create:
        - "import java.io.*"
        - "Calendar myCalendar = Calendar.getInstance();" NOTE: this is a little bit different than usual!

    - Useful methods of the calendar class:
        -  "myCalendar.set(Calendar.YEAR, year);" this sets the year for the calendar to do something on that date
        - "myCalendar.set(Calendar.MONTH, Calendar.monthName);" this sets the month for the calendar to do something on that date
        - "myCalendar.set(Calendar.DAY_OF_MONTH, dateInNumber);" this sets the date for the calendar to do something
        - "myCalendar.set(Calendar.HOUR, hourInMILITARYTIME);" this sets the hour of the calendar IN MILITARY TIME 
        - "myCalendar.set(Calendar.MINUTE, minutes);" this sets the minutes of the calendar 
        - "myCalendar.set(Calendar.SECOND, seconds);" this sets the seconds of the minute of the calendar
        - "myCalendar.set(Calendar.MILLISECOND, milliseconds);" this sets the milliseconds of the calendar

64. CAVEAT WITH TIMER: 
    - After you use the timer once (say, timer.schedule(myTask, 3000));), it won't be able to used again for some reason. 
        - We will look into this soon 

65. 





    

