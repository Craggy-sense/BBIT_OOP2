package BBIT_OOP2_ASSINO.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalService {
    private List<Vehicle> availableVehicles;

    public VehicleRentalService() {
        this.availableVehicles = new ArrayList<>();
        // Populate with some sample vehicles
        this.availableVehicles.add(new Vehicle(VehicleType.CAR));
        this.availableVehicles.add(new Vehicle(VehicleType.BIKE));
        this.availableVehicles.add(new Vehicle(VehicleType.SCOOTER));
    }

    // Rent a vehicle by type
    public boolean rentVehicle(VehicleType type, int durationHours) {
        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getType() == type) {
                // process the rental
                availableVehicles.remove(vehicle);
                System.out.println("Rented a " + type + " for " + durationHours + " hours.");
                return true;
            }
        }
        System.out.println("No " + type + " available for rent.");
        return false;
    }

    // Rent a vehicle by type with insurance option
    public boolean rentVehicle(VehicleType type, int durationHours, InsuranceOption insurance) {
        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getType() == type) {
                // process the rental
                availableVehicles.remove(vehicle);
                String insuranceMsg = (insurance == InsuranceOption.WITH_INSURANCE) ? " with insurance." : " without insurance.";
                System.out.println("Rented a " + type + " for " + durationHours + " hours" + insuranceMsg);
                return true;
            }
        }
        System.out.println("No " + type + " available for rent.");
        return false;
    }
}
