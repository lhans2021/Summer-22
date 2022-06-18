package Package1; 
import Package2.*; // import everything from package 2

public class accessmodifiersA { 

    public String publicMessage = "This is public"; // this variable can be used anywhere in any package 
    protected String protectedMessage = "This is protected"; // this variable can only be used in this class' CHILD classes! 
    public static void main (String[] args) {
        accessmodifiersB B = new accessmodifiersB();
        //System.out.println(B.privateMessage); // we cannot access privateMessage because we're in a different class 


    }
}