package BBIT_OOP2.CATII.ExceptionHandling;

import BBIT_OOP2.CATII.CONCRETE.Course;
import BBIT_OOP2.CATII.CONCRETE.Department;
import BBIT_OOP2.CATII.CONCRETE.faculty;
import BBIT_OOP2.CATII.CONCRETE.Student;
import BBIT_OOP2.CATII.System_Functionality.Management;


public class Exception_Handling {
    public static void main(String[] args) {
        Management universityManagement = new Management();

        Student student1 = new Student("John Doe", 20, "S001", 3.5);
        faculty faculty1 = new faculty("Dr. Smith", 45, "F001", "Computer Science");

        universityManagement.add(student1);
        universityManagement.add(faculty1);

        Course course1 = new Course("Introduction to Java", "CS101");
        course1.setAssignedFaculty(faculty1);
        universityManagement.addCourse(course1);

        Department dept1 = new Department("Computer Science");
        dept1.addCourse(course1);
        dept1.addFaculty(faculty1);
        universityManagement.addDepartment(dept1);

        course1.enrollStudent(student1);

        System.out.println("Initial Course Enrollment: " + course1.getEnrolledStudents().size());

        student1.setGPA(3.8);
        universityManagement.update(student1.getID(), student1);

        universityManagement.remove(student1.getID());

        System.out.println("Course Enrollment after removing a student: " + course1.getEnrolledStudents().size());

        try {
            student1.setGPA(-1.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
