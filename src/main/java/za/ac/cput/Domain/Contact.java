/*
@Author Joshua Mokwebo 
Date : 25/02/2024
Time:11:13
!please note  i am using JDK 17 please make necesaarry changes on your pom file if need be 


*/



package za.ac.cput.Domain;



public class  Contact {
    private String phoneNumber;
    private String email;


    public Contact() {

    }

    public Contact(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
