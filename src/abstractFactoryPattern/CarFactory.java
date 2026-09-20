package abstractFactoryPattern;

public interface CarFactory {
    Car createCar(CarConstants.CarBrands brand);
}