package javademos;

import static javademos.arithematic.Operations.*;

public class Demo {
    
    public static void main(String[] args) {

        int sum = add(10, 20);
        System.out.println("Sum of 10 and 20 is " + sum);

        int sub = sub(10, 20);
        System.out.println("Subtraction of 10 and 20 is " + sub);

        int mul = mul(10, 20);
        System.out.println("Multiplication of 10 and 20 is " + mul);

        int div = div(10, 20);
        System.out.println("Division of 10 and 20 is " + div);

        int mod = mod(10, 20);
        System.out.println("Modulus of 10 and 20 is " + mod);


        // int add = Operations.add(10, 10);
        // System.out.println("Addition of " + 10 + " and " + 10 + " is " + add);

        // int sub = Operations.sub(10, 10);
        // System.out.println("Subtraction of " + 10 + " and " + 10 + " is " + sub);

        // int mul = Operations.mul(10, 10);
        // System.out.println("Multiplication of " + 10 + " and " + 10 + " is " + mul);

        // int div = Operations.div(10, 10);
        // System.out.println("Division of " + 10 + " and " + 10 + " is " + div);

        // int mod = Operations.mod(10, 10);
        // System.out.println("Modulus of " + 10 + " and " + 10 + " is " + mod);


        // Operations operations = new Operations();
        // int sum = operations.add(10, 20);
        // System.out.println("Sum of 10 and 20 is " + sum);
        // int sub = operations.sub(10, 20);
        // System.out.println("Subtraction of 10 and 20 is " + sub);
        // int mul = operations.mul(10, 20);
        // System.out.println("Multiplication of 10 and 20 is " + mul);
        // int div = operations.div(10, 20);
        // System.out.println("Division of 10 and 20 is " + div);
        // int mod = operations.mod(10, 20);
        // System.out.println("Modulus of 10 and 20 is " + mod);
    }
}

