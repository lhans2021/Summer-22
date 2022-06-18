public class Pizza {

    // OVERLOADED CONSTRUCTORS (VIDEO 29)

    // All of these constructors have the SAME NAME but different parameters, so they have a different signature 
    
    String bread;
    String sauce;
    String cheese;
    String topping; 
    
    Pizza() { 
        System.out.println("Your pizza costs $0. Make another selection, with ingredients. "); 

    }
    Pizza (String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce; 
        System.out.println("Your pizza costs $5, would you like to go ahead and create i? "); // If I were to continue this program, if the user says yes, I'll call another method here to create the pizza 
    }
    Pizza (String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese= cheese; 
        System.out.println("Your pizza costs $7, would you like to go ahead anc creat eit? "); 
    }
    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread; // the user passes in a "bread" and that is saved to "this.bread" which is a global variable 
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping; 
        System.out.println("Your pizza costs $10, would you like to go ahead and create it? "); 
    }


}