package abstractFactoryPattern;

public class BMW implements Car {
    private CarConstants.BMWModels model;

    public void setModel(CarConstants.BMWModels model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving BMW: " + model);
    }
}