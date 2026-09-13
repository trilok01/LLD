package observerPattern.observable;

import java.util.ArrayList;
import java.util.List;
import observerPattern.observer.Display;

public class WeatherStationImpl implements WeatherStation {
    List<Display> observer = new ArrayList<>();
    int currentTemp;

	@Override
	public void addObserver(Display display) {
		this.observer.add(display);
	}

	@Override
	public void removeObserver(Display display) {
		this.observer.remove(display);
	}

	@Override
	public void notifyObserver() {
		for(Display o : observer) {
			o.display();
		}
	}

	@Override
	public void setTemp(int newTemp) {
		boolean shouldNotify = newTemp != this.currentTemp;
		
		this.currentTemp = newTemp;
		
		if(shouldNotify) {
			this.notifyObserver();
		} else {
			System.out.println("Temperature is same as previous, no notification sent.");
		}
	}

	@Override
	public int getTemp() {
		return this.currentTemp;
	}
}