package abstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new LuxuryCarFactory();
        Car<String, CarConstants.BMWModels> bmwCar = carFactory.getCar(CarConstants.CarBrands.BMW);
        bmwCar.setModel(CarConstants.BMWModels.SERIES_3);
        bmwCar.drive();

        Car<String, CarConstants.MercedesModels> mercedesCar = carFactory.getCar(CarConstants.CarBrands.MERCEDES);
        mercedesCar.setModel(CarConstants.MercedesModels.C_CLASS);
        mercedesCar.drive();

        CarFactory ordinaryCarFactory = new OrdinaryCarFactory();
        Car<String, CarConstants.TataModels> tataCar = ordinaryCarFactory.getCar(CarConstants.CarBrands.TATA);
        tataCar.setModel(CarConstants.TataModels.NANO);
        tataCar.drive();

        Car<String, CarConstants.HyundaiModels> hyundaiCar = ordinaryCarFactory.getCar(CarConstants.CarBrands.HYUNDAI);
        hyundaiCar.setModel(CarConstants.HyundaiModels.ELANTRA);
        hyundaiCar.drive();
    }
}