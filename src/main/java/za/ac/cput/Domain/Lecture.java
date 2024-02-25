package za.ac.cput.Domain;

public class Lecture {
    private String employeeId;
    private String name;
    private String surname;
    private String gender;
    private String email;
    private String phoneNumber;

    private Contact LecturerContact;

    public Lecture() {

    }

    public Lecture(String employeeId, String name, String surname, String gender, String email, String phoneNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;

        LecturerContact = new Contact(phoneNumber, email);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +

                ", LecturerContact=" + LecturerContact +
                '}';
    }
}
