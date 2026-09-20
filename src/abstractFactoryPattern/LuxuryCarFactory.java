package abstractFactoryPattern;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public Car getCar(CarConstants.CarBrands brand) {
        return switch(brand) {
            case MERCEDES -> new Mercedes();
            case BMW -> new BMW();
            default -> {
                System.out.println("Invalid brand for luxury car factory");
                yield null;
            }
        };
    }
}