package Vehicles;

import DriveStrategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;

    //=> Dependency-Injection using Constructor
    public Vehicle(DriveStrategy strategy) {
        this.driveStrategy = strategy;
    }

    public void drive() {
        this.driveStrategy.drive();
    }
}
