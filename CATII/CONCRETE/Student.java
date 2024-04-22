package BBIT_OOP2.CATII.CONCRETE;

import BBIT_OOP2.CATII.Abstract.Person;

import java.util.ArrayList;

public class Student extends Person {
    private double GPA;
    private ArrayList<String> coursesEnrolled;

    public Student(String name, int age, String ID, double GPA) {
        super(name, age, ID);
        this.GPA = GPA;
        this.coursesEnrolled = new ArrayList<>();
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public ArrayList<String> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void enrollInCourse(String course) {
        coursesEnrolled.add(course);
    }

    public void dropCourse(String course) {
        coursesEnrolled.remove(course);
    }
}

