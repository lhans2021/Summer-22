import java.util.*;

public class Videos74to81 {

    public static void main (String[] args) {

        // GENERICS (VIDEO 74)

        // Generic Methods 
        Integer[] myIntArray = {1, 2, 4, 6, 10, -5, 0, 3, 9}; // this is an array of wrapper class, Integer 
        Boolean[] myBoolArray = {true, false, false, true, false, true, true, false}; // this is the array of wrapper class, boolean
        Character[] myCharArray = {'A', 'Z', 'B', 'Y'}; // this is the array of wrapper class, Character 

        // notice that all of these are arrays, but we cannot create a method of one specific reference data type. they're all difference wrapper classes
        // so, we can call them "things" and pass in that generic data type 
        printArrays(myIntArray); // here, the "Thing" is "Integer" and the "array" is "myIntArray"
        System.out.print("\n"); 
        printArrays(myBoolArray); // here, the "Thing" is "Boolean" and the "array" is "myBoolArray"
        System.out.println(); 
        printArrays(myCharArray); // here, the "Thing" is "Character" and the array is "myCharArray"
        System.out.print("\n"); 

        System.out.println("###############################################"); 

        // Generic Classes 

        Rabbit rabbit = new Rabbit(); 
        GenericClass<Integer, String> myObjects1 = new GenericClass<>(1, "Hans");  // notice, we pass in "Intger" not "int" because "int" is NOT a ref data type 
        GenericClass<Integer, Rabbit> myObjects2 = new GenericClass<>(1, rabbit); // here, I pass in an Integer and Rabbit which are both ref data types 
        GenericClass<Integer, Double> myObjects3 = new GenericClass<>(1, 3.14); // here, I pass in an Integer as 'Thing' and Double as "Thing2" 
        myObjects3.printValues(); // now, I can call the printValues to print these two values I passed in 
        
        // Bounded Types
        GenericClassLimited<Double> myDouble = new GenericClassLimited<>(3.14); // this is valid, because I am passing in a Double which is a child of the Number class
        GenericClassLimited<Integer> myInteger = new GenericClassLimited<>(5); // valid too
        //GenericClassLimited<String> myString = new GenericClassLimited<>("Test"); //invalid because String is not a child of Number! 
    
        System.out.println("###############################################"); 

        // TIMER TASK (VIDEO 76)

        Timer myTimer = new Timer(); // this is the instantiation of a timer

        TimerTask myTask = new TimerTask() { // this is the instantiation of a TimerTask 
            
            int counter = 5; 
            @Override
            public void run() { // this is the "Anonymous Type". NOTE THAT THE TIMERTASK NEEDS THE Anonymous Type, which is this overriding method!
                if (counter<=20 && counter!=0) {
                    System.out.println(counter); 
                    counter--; 
                }
                else if (counter == 0) {
                    System.out.println("Time's up! 0 seconds");
                    myTimer.cancel();  
                }
            
                //System.out.println("Task is complete! "); 
            }
        };

        //myTimer.schedule(myTask, 3000); // here, the .schedule method performs "myTask" after "3000" milliseconds 

        Calendar myCalendar = Calendar.getInstance(); // this is the instantiation of a calendar
        myCalendar.set(Calendar.YEAR, 2022); // this sets the calendar to 2022 
        myCalendar.set(Calendar.MONTH, Calendar.JUNE); // this sets the calendar to June  
        myCalendar.set(Calendar.DAY_OF_MONTH, 14); // this sets the calendar to the 14th of  June 2022
        myCalendar.set(Calendar.HOUR_OF_DAY, 22); // this sets the calendar to 10PM (22:00) 
        myCalendar.set(Calendar.MINUTE, 15); // this sets the calendar to 10:15PM (22:15)
        myCalendar.set(Calendar.SECOND, 0); // this sets the calendar to 10:15:00PM -- exactly 10:15
        myCalendar.set(Calendar.MILLISECOND, 0); // this sets the calendar to 10:15:00:00PM -- 0 milliseconds 

        //myTimer.schedule(myTask, myCalendar.getTime()); // here, the .schedule method performs 'myTask' at the time specified to myCalendar ABOVE

        myTimer.scheduleAtFixedRate(myTask, 0, 1000); // here, the timer will execute "myTask" starting 0 seconds after calling it
                                                                    // and will repeat the task every 1 second (1000 milliseconds)



    
    }

    public static <Thing> void printArrays(Thing[] array) { // we pass in the "thing" as the reference data type
        for (Thing i : array) { // create a for-each loop to loop through every element in the array of "Things" 
            System.out.print(i + " ");
        } 
        

        // SERIALIZATION is in "Serializer" package 

    }

        
}
