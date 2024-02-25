package za.ac.cput.Domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student1;
    Student student2, student3;
    String dObString = "2000-Jun-20";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
    ;  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
    LocalDate date = LocalDate.parse( dObString, formatter);
    @BeforeEach
    void setUp() {
        student1 = new Student("Siphosethu","Makhambeni",1234567890,221272976,date,"promakhambeni@gmail.com","0714146558");
        student2 = new Student("Siphosethu", "Makhambeni", 1234567890, 221272976, date, "promakhambeni@gmail.com", "0714146558");
        student3 = student1;
    }

    @Test
    @Disabled
    void studentIdentityTest(){
        assertSame(student1, student2);
    }

    @Test
    void student1Equalsstudent2() {
        //assertTrue(student1.equals(student2));
        assertEquals(student1, student3);

    }

    @Test
    void studentEquality(){
        assertEquals(student1, student2);
}

}