package observerPattern.observer;

import observerPattern.observable.WeatherStation;

public class TvDisplay implements Display {

	WeatherStation weatherStation;
	
	public TvDisplay(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}
	
	@Override
	public void display() {
		int newTemp = weatherStation.getTemp();
		
		System.out.println("New Temperature on TV: " + newTemp);
	}

}
