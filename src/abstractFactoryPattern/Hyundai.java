package abstractFactoryPattern;

public class Hyundai implements Car<String, CarConstants.HyundaiModels> {
    private CarConstants.HyundaiModels model;

    @Override
    public void setModel(CarConstants.HyundaiModels model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving Hyundai: " + model);
    }
}