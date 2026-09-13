package solid.liskovSubstitution;

public class MotorCycle extends EngineVehicle {
    @Override
    public Integer getNumberOfWheels() {
        return 2;
    }
}