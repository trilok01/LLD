package abstractFactoryPattern;

public class Tata implements Car<String, CarConstants.TataModels> {
    private CarConstants.TataModels model;

    @Override
    public void setModel(CarConstants.TataModels model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving Tata: " + model);
    }
}