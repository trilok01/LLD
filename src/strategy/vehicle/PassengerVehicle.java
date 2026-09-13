package strategy.vehicle;

import strategy.drive.NormalDrive;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}