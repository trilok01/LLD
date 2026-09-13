package strategyPattern.vehicle;

import strategyPattern.drive.SportyDrive;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportyDrive());
    }
}