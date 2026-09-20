package abstractFactoryPattern;

public interface CarFactory{
    public Car getCar(CarConstants.CarBrands brand);
}