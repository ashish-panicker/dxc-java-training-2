package javademos.interfaces;

// pure abstract class
public interface Shape {

    double area();

    default void into(){
        System.out.println("This is a shape");
    }
    
}
