package javademos.iterative;

public class Loops {

    public void demoContinue(){
        int loopIndex = 1;
        while (loopIndex <= 10) {

            System.out.println("in the while loop - continue");

            if (loopIndex == 5) {
                ++loopIndex;
                continue;
            }

            System.out.println("loopIndex = " + loopIndex);
            loopIndex++;
        }
        System.out.println("out of the while loop - break");
    }

    public void demoBreak() {

        int loopIndex = 1;
        while (loopIndex <= 10) {
            
            System.out.println("in the while loop ");

            if (loopIndex == 5) {
                break;
            }

            System.out.println("loopIndex = " + loopIndex);
            loopIndex++;
        }
        System.out.println("out of the while loop");
    }


    public void demoWhileLoop() {

        int loopindex = 1; // Initialize loop index

        while (loopindex <= 10) { // Loop while loop index is less than or equal to 10

            System.out.println("loopindex: " + loopindex);
            System.out.println("Hello form while loop");

            loopindex++; // Increment loop index
        }

    }

    public void demoForLoop() {

        for (int loopIndex = 1; loopIndex <= 10; loopIndex++) {
            System.out.println("loopindex: " + loopIndex);
            System.out.println("Hello form for loop");
        }

    }

    public void demoDoWhileLoop() {

        int loopIndex = 100; // Initialize loop index

        do {
            System.out.println("loopindex: " + loopIndex);
            System.out.println("Hello form do while loop");
            loopIndex++; // Increment loop index

        } while (loopIndex <= 10); // Loop while loop index is less than or equal to 10

    }

}
