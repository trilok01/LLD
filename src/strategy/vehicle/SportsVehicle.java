package strategy.vehicle;

import strategy.drive.SportyDrive;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportyDrive());
    }
}