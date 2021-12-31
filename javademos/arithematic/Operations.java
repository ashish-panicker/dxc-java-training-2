package javademos.arithematic;

public class Operations {

    public static int add(int number1, int number2) {
        System.out.println("Addition");
        return number1 + number2;
        // return sum;
        // System.out.println("Sum of " + number1 + " and " + number2 + " is " + sum);
    }

    public static int sub(int number1, int number2) {
        System.out.println("Subtraction");
        return number1 - number2;
        // System.out.println("Subtraction of " + number1 + " and " + number2 + " is " + sub);
    }

    public static int mul(int number1, int number2) {
        System.out.println("Multiplication");
        return number1 * number2;
        // System.out.println("Multiplication of " + number1 + " and " + number2 + " is " + mul);
    }

    public static int div(int number1, int number2) {
        System.out.println("Division");
        return number1 / number2;
        // System.out.println("Division of " + number1 + " and " + number2 + " is " + div);
    }

    public static int mod(int number1, int number2) {
        System.out.println("Modulus");
        return number1 % number2;
        // System.out.println("Modulus of " + number1 + " and " + number2 + " is " + mod);
    }

}
