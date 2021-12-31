package javademos;

import javademos.conditional.Conditional;
import javademos.encapsulation.Mentor;
import javademos.encapsulation.Trainee;
import javademos.iterative.Loops;

public class Main {
    
    public static void main(String[] args) {
        // Loops loops = new Loops();
        // // loops.demoBreak();
        // // loops.demoContinue();
        // Conditional conditional = new Conditional();
        // conditional.checkGradeSwitchCase('A');
        // conditional.checkGradeSwitchCase('B');
        // conditional.checkGradeSwitchCase('C');
        // conditional.checkGradeSwitchCase('D');
        // conditional.checkGradeSwitchCase('E');
        // conditional.checkGradeSwitchCase('F');

        Trainee trainee = new Trainee("John", 1, "1234567890", "john@mail.com","Software Engineer");
        Mentor mentor = new Mentor("Jane", "12344", "jane@mail.com", "Java");

        // trainee.setName("John");
        // trainee.setId(12345);
        // trainee.setContactNumber("1234567890");
        // trainee.setEmail("john.doe@mail.com");
        // trainee.setDesignation("Software Engineer");

        // mentor.setName("Jane");
        // mentor.setContactNumber("0987654321");
        // mentor.setEmail("jane@mail.com");
        // mentor.setSpecialization("Java");

        System.out.println("Trainee Name: " + trainee.getName());
        System.out.println("Trainee ID: " + trainee.getId());
        System.out.println("Trainee Contact Number: " + trainee.getContactNumber());
        System.out.println("Trainee Email: " + trainee.getEmail());
        System.out.println("Trainee Designation: " + trainee.getDesignation());
        System.out.println("Mentor Name: " + mentor.getName());
        System.out.println("Mentor Contact Number: " + mentor.getContactNumber());
        System.out.println("Mentor Email: " + mentor.getEmail());
        System.out.println("Mentor Specialization: " + mentor.getSpecialization());

        Trainee[] trainees = new Trainee[3];
        trainees[0] = new Trainee();
        trainees[1] = new Trainee();
        trainees[2] = new Trainee();


    }
}
