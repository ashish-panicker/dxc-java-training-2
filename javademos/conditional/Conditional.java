package javademos.conditional;

public class Conditional {


    public void simpleIfElse() {

        int age = 30;

        if (age >= 18) {
            System.out.println("You are old enough to vote");
        } else {
            System.out.println("You are not old enough to vote");
        }
    }

    public void ternary() {
        int age = 30;

        String vote = (age >= 18) ? "You are old enough to vote" : "You are not old enough to vote";

        System.out.println(vote);
    }

    /**
     * grade [A, B, C, D]
     */
    public void checkGrade(char grade) {
        if (grade == 'A') {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Good");
        } else if (grade == 'C') {
            System.out.println("Fair");
        } else if (grade == 'D') {
            System.out.println("Poor");
        } else {
            System.out.println("Invalid grade");
        }
    }

    public void checkGradeSwitchCase(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            default:
                System.out.println("Invalid grade");
        }

    }


}
