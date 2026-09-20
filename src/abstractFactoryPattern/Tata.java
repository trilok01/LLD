package abstractFactoryPattern;

public class Tata implements Car {
    private CarConstants.TataModels model;

    public void setModel(CarConstants.TataModels model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving Tata: " + model);
    }
}