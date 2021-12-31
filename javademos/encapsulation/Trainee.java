package javademos.encapsulation;

public class Trainee {

    // class level variables or attributes or properties
    private String name;
    private long id;
    private String contactNumber;
    private String email;
    private String designation;

    public Trainee(){
        // default constructor
        System.out.println("Trainee default constructor");
    }

    public Trainee(String name, long id, String contactNumber, String email, String designation){
        // parameterized constructor
        System.out.println("Trainee parameterized constructor");
        this.name = name;
        this.id = id;
        this.contactNumber = contactNumber;
        this.email = email;
        this.designation = designation;
    }


    // getter or accessor methods
    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getDesignation() {
        return designation;
    }

    // setter or mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}
