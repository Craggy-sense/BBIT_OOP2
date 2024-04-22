package BBIT_OOP2.BBIT_OOP2_ASSINO.Exception_Handling;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("John Doe");

        try {
            patient.setAge(25); // Valid age
            System.out.println("Age set to: " + patient.getAge());
            patient.setAge(-1); // Invalid age, should throw exception
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }

        try {
            patient.setAge(135); // Invalid age, should throw exception
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
