package javademos;

import javademos.conditional.Conditional;
import javademos.iterative.Loops;

public class Main {
    
    public static void main(String[] args) {
        Loops loops = new Loops();
        // loops.demoBreak();
        // loops.demoContinue();
        Conditional conditional = new Conditional();
        conditional.checkGradeSwitchCase('A');
        conditional.checkGradeSwitchCase('B');
        conditional.checkGradeSwitchCase('C');
        conditional.checkGradeSwitchCase('D');
        conditional.checkGradeSwitchCase('E');
        conditional.checkGradeSwitchCase('F');

        

    }
}
