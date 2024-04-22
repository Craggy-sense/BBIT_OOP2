package BBIT_OOP2_ASSINO.Abstraction;


abstract class ElectricVehicle {

    abstract void batteryType();
}

// Concrete class ElectricCar extending ElectricVehicle
class ElectricCar extends ElectricVehicle {
    @Override
    void batteryType() {
        System.out.println("The car uses a lithium-ion battery.");
    }
}

// Concrete class ElectricBike extending ElectricVehicle
class ElectricBike extends ElectricVehicle {
    @Override
    void batteryType() {
        System.out.println("The bike uses rechargable battery.");
    }
}

// Main class for testing
public class Abstract {
    public static void main(String[] args) {
        // Create instances of ElectricCar and ElectricBike
        ElectricCar electricCar = new ElectricCar();
        ElectricBike electricBike = new ElectricBike();

        // Call the batteryType() method for each instance
        electricCar.batteryType();
        electricBike.batteryType();
    }
}

