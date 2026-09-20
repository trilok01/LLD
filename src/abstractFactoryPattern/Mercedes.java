package abstractFactoryPattern;

public class Mercedes implements Car<String, CarConstants.MercedesModels> {
    private CarConstants.MercedesModels model;

    @Override
    public void setModel(CarConstants.MercedesModels model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving Mercedes: " + model);
    }
}