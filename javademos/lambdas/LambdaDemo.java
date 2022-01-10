package javademos.lambdas;

public class LambdaDemo {

    public void greet(GreetLambda g) {
        g.greet();
    }

    public static void main(String[] args) {
        LambdaDemo ld = new LambdaDemo();
        GreetLambda hwLambda = () -> System.out.println("Hello world....");

        ld.greet(hwLambda);
        ld.greet(() -> System.out.println("Greetings from Java"));

        MathLambda divLambda = (a, b) -> {
            if (b == 0) {
                return 0;
            }
            return a / b;
        };
        System.out.println(divLambda.operation(10, 2));
    }
}


@FunctionalInterface
interface MathLambda {
    int operation(int a, int b);
}


@FunctionalInterface
interface GreetLambda {
    void greet();
}
