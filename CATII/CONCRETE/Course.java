package BBIT_OOP2.CATII.CONCRETE;

import java.util.ArrayList;
import java.util.List;

// Course class
public class Course {
    private String courseName;
    private String courseCode;
    private faculty assignedFaculty;
    private List<Student> enrolledStudents;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getters and setters
    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public faculty getAssignedFaculty() {
        return assignedFaculty;
    }

    public void setAssignedFaculty(faculty assignedFaculty) {
        this.assignedFaculty = assignedFaculty;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    // Methods to manage enrolled students
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void unenrollStudent(Student student) {
        enrolledStudents.remove(student);
    }
}



