package observerPattern.observer;

import observerPattern.observable.WeatherStation;

public class MobileDisplay implements Display {
	WeatherStation weatherStation;
	
	public MobileDisplay(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}
	
	@Override
	public void display() {
		int newTemp = weatherStation.getTemp();
		
		System.out.println("New Temperature on Mobile: " + newTemp);
	}

}
