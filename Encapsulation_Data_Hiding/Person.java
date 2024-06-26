package BBIT_OOP2.BBIT_OOP2_ASSINO.Encapsulation_Data_Hiding;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Patient extends Person {
    private String condition;

    public Patient(String name, int age, String condition) {
        super(name, age);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Condition: " + condition);
    }
}

class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

class Hospital {
    private Doctor doctor;
    private Patient patient;

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void displayHospitalDetails() {
        System.out.println("Doctor Details:");
        if (doctor != null) doctor.displayDetails();
        System.out.println("\nPatient Details:");
        if (patient != null) patient.displayDetails();
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("Kamau Athiambo", 20, "TB");
        Doctor doctor1 = new Doctor("Kipchrichr Mwende", 55, "Cardiology");
        Hospital hospital = new Hospital();
        hospital.setDoctor(doctor1);
        hospital.setPatient(patient1);
        hospital.displayHospitalDetails();
    }
}
