package za.ac.cput.Domain;

import java.util.ArrayList;

public class Course {
    private String courseID;
    private String courseName;
    private int maximumCourseCapacity;
    public static ArrayList<Student> studentList=new ArrayList<>();
    private int credits;

    public Course(){

    }

    public Course(String courseID, String courseName, int maximumCourseCapacity, int credits) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.maximumCourseCapacity = maximumCourseCapacity;
        this.credits = credits;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMaximumCourseCapacity() {
        return maximumCourseCapacity;
    }

    public void setMaximumCourseCapacity(int maximumCourseCapacity) {
        this.maximumCourseCapacity = maximumCourseCapacity;
    }

    public static ArrayList<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(ArrayList<Student> studentList) {
        Course.studentList = studentList;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", maximumCourseCapacity=" + maximumCourseCapacity +
                ", credits=" + credits +
                '}';
    }
}
