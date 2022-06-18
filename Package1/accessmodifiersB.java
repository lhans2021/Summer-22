package Package1;
import Package2.*; // import everything from package 2

public class accessmodifiersB {
 
    static private String privateMessage = "private message"; // because this is private, the only way to use this variable is in THIS class 
    public static void main (String[] args) { 
        System.out.println(privateMessage); // we can access privateMessage because we're in the same class 
    }
}
