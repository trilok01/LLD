package strategyPattern.vehicle;

import strategyPattern.drive.NormalDrive;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}