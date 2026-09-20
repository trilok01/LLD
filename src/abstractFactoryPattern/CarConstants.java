package abstractFactoryPattern;

public final class CarConstants {
    private CarConstants() {
        // private constructor to prevent instantiation
    }

    public enum CarBrands {
        BMW,
        MERCEDES,
        TATA,
        HYUNDAI
    }

    public enum BMWModels {
        SERIES_3,
        SERIES_5,
        SERIES_7
    }

    public enum MercedesModels {
        C_CLASS,
        E_CLASS,
        S_CLASS
    }

    public enum TataModels {
        NANO,
        INDICA,
        SAFARI
    }

    public enum HyundaiModels {
        ELANTRA,
        SONATA,
        TUCSON
    }
}