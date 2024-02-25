package za.ac.cput.Main;

import za.ac.cput.Domain.Course;
import za.ac.cput.Domain.Lecture;
import za.ac.cput.Domain.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String dObString = "2000-Jun-20";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        formatter = formatter.withLocale(Locale.UK);  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
        LocalDate date = LocalDate.parse( dObString, formatter);

//Im creating a new student Object and setting its values
        Student student1 = new Student("Mpumzi", "Mbula", 00062, 219053324, date, "mphumzimbula@gmail.com", "0658436358");
        System.out.println(student1);

        Course course1 = new Course();
        course1.studentList.add(student1);



        Lecture lectuer1 = new Lecture("Le01", "Mlungisi", "Mbuyazi", "Male", "mmbuyazi63@gmail.com", "0739956042");
        System.out.println(lectuer1);

    }

}
