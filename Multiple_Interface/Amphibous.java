package BBIT_OOP2_ASSINO.Multiple_Interface;

// Define the Amphibious interface
interface Amphibious {
    void dock();
    void launch();
}

interface AirVehicle {
    void fly();
}

// Implementing the AmphibiousPlane class that implements both interfaces
class AmphibiousPlane implements Amphibious, AirVehicle {
    @Override
    public void dock() {
        System.out.println("Amphibious Plane is docking.");
    }

    @Override
    public void launch() {
        System.out.println("Amphibious Plane is launching.");
    }

    @Override
    public void fly() {
        System.out.println("Amphibious Plane is flying.");
    }
}

