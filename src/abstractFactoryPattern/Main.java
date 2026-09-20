package abstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        CarFactory luxuryCarFactory = new LuxuryCarFactory();

        BMW bmwCar = (BMW) luxuryCarFactory.createCar(CarConstants.CarBrands.BMW);
        bmwCar.setModel(CarConstants.BMWModels.SERIES_3);
        bmwCar.drive();

        Mercedes mercedesCar = (Mercedes) luxuryCarFactory.createCar(CarConstants.CarBrands.MERCEDES);
        mercedesCar.setModel(CarConstants.MercedesModels.C_CLASS);
        mercedesCar.drive();

        CarFactory ordinaryCarFactory = new OrdinaryCarFactory();

        Tata tataCar = (Tata) ordinaryCarFactory.createCar(CarConstants.CarBrands.TATA);
        tataCar.setModel(CarConstants.TataModels.NANO);
        tataCar.drive();

        Hyundai hyundaiCar = (Hyundai) ordinaryCarFactory.createCar(CarConstants.CarBrands.HYUNDAI);
        hyundaiCar.setModel(CarConstants.HyundaiModels.ELANTRA);
        hyundaiCar.drive();
    }
}