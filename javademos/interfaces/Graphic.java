package javademos.interfaces;

public interface Graphic {

    void draw();

    void paint(Colour borderColour, Colour fillColour);

    // Java 8 +
    default void info(){
        System.out.println("This is a graphic");
    }

    default double area(){
        return 0;
    }

    static void infoStatic(){
        System.out.println("This is a graphic");
    }
    
}
