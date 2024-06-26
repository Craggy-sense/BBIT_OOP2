package BBIT_OOP2.BBIT_OOP2_ASSINO.Inheritance;

public class Vehicle {
    public String brand;
    public String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("The " + brand + " " + model + " engine is started.");
    }

    public void stopEngine() {
        System.out.println("The " + brand + " " + model + " engine is stopped.");
    }
}

class Motorcycle extends Vehicle {
    public int numWheels;
    public boolean hasKickStart;

    public Motorcycle(String brand, String model, int numWheels, boolean hasKickStart) {
        super(brand, model);
        this.numWheels = numWheels;
        this.hasKickStart = hasKickStart;
    }

    public void performWheelie() {
        System.out.println("The " + brand + " " + model + " is performing a wheelie.");
    }

    public void honkHorn() {
        System.out.println("Beep beep! (Motorcycle horn sound)");
    }
}

class Bus extends Vehicle {
    public int numSeats;
    public boolean hasAirConditioning;

    public Bus(String brand, String model, int numSeats, boolean hasAirConditioning) {
        super(brand, model);
        this.numSeats = numSeats;
        this.hasAirConditioning = hasAirConditioning;
    }

    public void announceStops() {
        System.out.println("Attention passengers! We are now approaching the next bus stop.");
    }

    public void openDoor() {
        System.out.println("The bus door is opening.");
    }
}

class Trailer extends Vehicle {
    public int maxLoadCapacity;
    public boolean hasRamp;

    public Trailer(String brand, String model, int maxLoadCapacity, boolean hasRamp) {
        super(brand, model);
        this.maxLoadCapacity = maxLoadCapacity;
        this.hasRamp = hasRamp;
    }

    public void loadCargo() {
        System.out.println("Loading cargo onto the " + brand + " " + model + " trailer.");
    }

    public void unloadCargo() {
        System.out.println("Unloading cargo from the " + brand + " " + model + " trailer.");
    }
}

class Boat extends Vehicle {
    public int length;
    public boolean isSailboat;

    public Boat(String brand, String model, int length, boolean isSailboat) {
        super(brand, model);
        this.length = length;
        this.isSailboat = isSailboat;
    }

    public void sail() {
        if (isSailboat) {
            System.out.println("The " + brand + " " + model + " is sailing with the wind.");
        } else {
            System.out.println("The " + brand + " " + model + " is navigating on the water.");
        }
    }

    public void anchor() {
        System.out.println("The " + brand + " " + model + " is dropping anchor.");
    }
}

