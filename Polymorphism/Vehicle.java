package BBIT_OOP2.BBIT_OOP2_ASSINO.Polymorphism;

import java.util.ArrayList;
import java.util.List;
public class Vehicle {
    private VehicleType type;

    public Vehicle(VehicleType type) {
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }
}

