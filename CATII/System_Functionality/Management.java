package BBIT_OOP2.CATII.System_Functionality;

import BBIT_OOP2.CATII.Abstract.IManageable;
import BBIT_OOP2.CATII.CONCRETE.Course;
import BBIT_OOP2.CATII.CONCRETE.Department;
import BBIT_OOP2.CATII.Abstract.Person;

import java.util.ArrayList;
import java.util.List;

public class Management implements IManageable {
    private List<Person> people;
    private List<Course> courses;
    private List<Department> departments;

    public Management() {
        this.people = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    // Overloaded add method to add different types of Person (Student, Faculty)
    @Override
    public void add(Person person) {
        people.add(person);
    }

    // Method to add courses
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Method to add departments
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Removing a person by ID
    @Override
    public void remove(String ID) {
        people.removeIf(person -> person.getID().equals(ID));
    }

    // Updating person details
    @Override
    public void update(String ID, Person updatedPerson) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getID().equals(ID)) {
                people.set(i, updatedPerson);
                return;
            }
        }
    }

    // Additional methods to remove courses and departments
    public void removeCourse(String courseCode) {
        courses.removeIf(course -> course.getCourseCode().equals(courseCode));
    }

    public void removeDepartment(String departmentName) {
        departments.removeIf(department -> department.getDepartmentName().equals(departmentName));
    }
}
