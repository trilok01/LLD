package observerPattern;

import observerPattern.observable.WeatherStation;
import observerPattern.observable.WeatherStationImpl;
import observerPattern.observer.Display;
import observerPattern.observer.MobileDisplay;
import observerPattern.observer.TvDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStationImpl();
        Display mobildDisplay = new MobileDisplay(weatherStation);
        Display tvDisplay = new TvDisplay(weatherStation);

        weatherStation.addObserver(mobildDisplay);
        weatherStation.addObserver(tvDisplay);
        weatherStation.setTemp(25);
        weatherStation.setTemp(30);
        weatherStation.setTemp(30); // No notification should be sent
        weatherStation.setTemp(28);
    }
}