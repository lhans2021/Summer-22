package Package2;
import Package1.*; // import everything from package 1

public class accessmodifiersC {
    
    String defaultMessage="This is a default message"; // the default modifier was used, so only any class in THIS package can see and use this string.

    public static void main (String[] args)
    {
        accessmodifiersA A = new accessmodifiersA();
        System.out.println(A.publicMessage); // we can access publicMessage because it has a public modifier 
    }

}
