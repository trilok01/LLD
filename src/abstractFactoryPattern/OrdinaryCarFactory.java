package abstractFactoryPattern;

public class OrdinaryCarFactory implements CarFactory {
    @Override
    public Car getCar(CarConstants.CarBrands brand) {
        return switch(brand) {
            case HYUNDAI -> new Hyundai();
            case TATA -> new Tata();
            default -> {
                System.out.println("Invalid brand for ordinary car factory");
                yield null;
            }
        };
    }
}