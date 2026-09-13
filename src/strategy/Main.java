package strategy;

import strategy.vehicle.PassengerVehicle;
import strategy.vehicle.SportsVehicle;
import strategy.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();

        vehicle = new PassengerVehicle();
        vehicle.drive();
    }
}