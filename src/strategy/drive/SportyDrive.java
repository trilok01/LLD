package strategy.drive;

public class SportyDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving sportily");
    }
}