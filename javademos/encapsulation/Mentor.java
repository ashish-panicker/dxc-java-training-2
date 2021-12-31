package javademos.encapsulation;

public class Mentor {

    private String name;
    private String email;
    private String contactNumber;
    private String specialization;

    public Mentor() {
        System.out.println("Mentor default constructor");
    }

    public Mentor(String name, String email, String contactNumber, String specialization) {
        System.out.println("Mentor parameterized constructor");
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }



}
