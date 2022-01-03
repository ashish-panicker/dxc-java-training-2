package javademos.exceptions;

public class ExceptionMain {

    public static void main(String[] args) {

        try {
            checkAge(17);
        } catch (InvaliVoterAgeException e) {
            System.err.println(e.getMessage());
        }
    }

    static void checkAge(int age) throws InvaliVoterAgeException {
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            throw new InvaliVoterAgeException("You are not eligible to vote");
        }
    }

    static void array() {
        int[] a = new int[10]; // 0 size -1
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 7;
        a[7] = 8;
        a[8] = 9;
        a[9] = 10;
        try {
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }

    static void divide() {
        int number1 = 4;
        int number2 = 0;
        int result = 0;
        try {
            result = number1 / number2;
        } catch (ArithmeticException e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Result is " + result);
        }
    }

}
