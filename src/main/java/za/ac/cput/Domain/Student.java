package za.ac.cput.Domain;

import java.time.LocalDate;

/**
 * Author Mpumzi Mbula
 * 219053324
 * Date:25/02/2024
 * GitHub:https://github.com/20Mphumzi16/universitycourse.git
 */
public class Student {


    private  String email;
    private String phoneNumber;
    private String studentName;
    private String studentSurname;
    private long idNumber;
    private int studentNumber;
    private LocalDate dateOfBirth;
    private Contact contact;

    public Student() {
        contact= new Contact();
    }

    public Student( String studentName, String studentSurname, long idNumber, int studentNumber, LocalDate dateOfBirth,String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.idNumber = idNumber;
        this.studentNumber = studentNumber;
        this.dateOfBirth = dateOfBirth;
        contact=new Contact(phoneNumber,email);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Student{" +

                ", studentName=" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", idNumber=" + idNumber +
                ", studentNumber=" + studentNumber +
                ", dateOfBirth=" + dateOfBirth +
                ", " + contact +
                '}';
    }
}
