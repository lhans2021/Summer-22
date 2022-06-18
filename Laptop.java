public class Laptop {
    
    // ENCAPSULATION (VIDEO 39) 

    private String brand;  // this is a private variable 
    private String processor; // this is a private attribute
    private int year;  // this is a private attribute 

    Laptop(String brand, String processor, int year){
        setBrand(brand); 
        setProcessor(processor); 
        setYear(year); 

    }

    Laptop(Laptop laptop) { // this is an overloaded constructor that takes in the original laptop and copies it to the new one while creating the new one at the same time
        this.brand = laptop.getBrand(); 
        this.year = laptop.getYear(); 
        this.processor = laptop.getProcessor(); 
    }

    //create a getter 
    public String getBrand() { // this getter method will allow us to indirectly access the private attributes
        return this.brand; 
    }
    public String getProcessor() {
        return this.processor; 
    }
    public int getYear() {
        return this.year; 
    }

    //creating a setter
    public void setBrand(String brand) { // this setter method allows us to send in a brand to update the original brand which is a private attribute
        this.brand = brand; 
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public void setYear(int year) {
        this.year = year; 
    }

    // COPY OBJECTS (VIDEO 40)

    public void copy(Laptop laptop) { // creating a "copy" method passing in myLaptop 
        this.brand = laptop.getBrand(); // this.brand is yourLaptop and we are setting its brand equal to the laptop of myLaptop 
        this.year = laptop.getYear(); // this.year is yourLaptop's year and we are setting its year equal to myLaptop's year 
        this.processor = laptop.getProcessor(); // same idea 
        
    }



}
