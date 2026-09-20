package abstractFactoryPattern;

public class Mercedes implements Car {
    private CarConstants.MercedesModels model;

    public void setModel(CarConstants.MercedesModels model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving Mercedes: " + model);
    }
}