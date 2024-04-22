package BBIT_OOP2.CATII.CONCRETE;

import BBIT_OOP2.CATII.Abstract.Person;

import java.util.ArrayList;

public class Faculty extends Person {
    private String department;
    private ArrayList<String> coursesTaught;

    public Faculty(String name, int age, String ID, String department) {
        super(name, age, ID);
        this.department = department;
        this.coursesTaught = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<String> getCoursesTaught() {
        return coursesTaught;
    }

    public void assignCourse(String course) {
        coursesTaught.add(course);
    }

    public void removeCourse(String course) {
        coursesTaught.remove(course);
    }
}

