package BBIT_OOP2.CATII.CONCRETE;

import java.util.ArrayList;
import java.util.List;

// Department class
public class Department {
    private String departmentName;
    private List<Course> courses;
    private List<faculty> facultyMembers;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.courses = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    // Getters and setters
    public String getDepartmentName() {
        return departmentName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<faculty> getFacultyMembers() {
        return facultyMembers;
    }

    // Methods to manage courses and faculty
    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void addFaculty(faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void removeFaculty(faculty faculty) {
        facultyMembers.remove(faculty);
    }
}
