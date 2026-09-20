package abstractFactoryPattern;

public class Hyundai implements Car {
    private CarConstants.HyundaiModels model;

    public void setModel(CarConstants.HyundaiModels model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving Hyundai: " + model);
    }
}