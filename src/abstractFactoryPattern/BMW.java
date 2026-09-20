package abstractFactoryPattern;

public class BMW implements Car<String, CarConstants.BMWModels> {
    private CarConstants.BMWModels model;

    @Override
    public void setModel(CarConstants.BMWModels model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving BMW: " + model);
    }
}