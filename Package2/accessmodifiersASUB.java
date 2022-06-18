package Package2;

import Package1.*; // import everything from package 1 

public class accessmodifiersASUB extends accessmodifiersA { // this class is a child class of the A class 
    
    public static void main(String[] args){
        accessmodifiersC c = new accessmodifiersC(); // since this class is in the same package as class C, we can access the defaultMessage 
        System.out.println(c.defaultMessage); 
        accessmodifiersASUB ASUB = new accessmodifiersASUB();
        System.out.println(ASUB.protectedMessage); // since this ASUB object fo this ASUB class is a CHILD class of the A class, I can access the protectedMessage

        

    }
}
