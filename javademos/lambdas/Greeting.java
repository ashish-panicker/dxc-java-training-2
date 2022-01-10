package javademos.lambdas;

public class Greeting {

    public static void main(String[] args) {
        Greeting g = new Greeting();
        g.greet(new HelloWorldGreeter());
        g.greet(new JavaGreeter());
    }

    public void greet(Greeter g) {
        g.greet();
    }

}


class JavaGreeter implements Greeter {

    @Override
    public void greet() {
        System.out.println("Greetings from Java");
    }
}


class HelloWorldGreeter implements Greeter {

    @Override
    public void greet() {
        System.out.println("Hello world....");
    }
}


interface Greeter {
    void greet();
}


