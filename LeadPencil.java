import java.beans.BeanProperty;

public class LeadPencil extends Pencil {
    
    // POLYMORPHISM (VIDEO 42) 

    @Override
    void write(){
        System.out.println("This lead pencil is writing");
    }
    
}
