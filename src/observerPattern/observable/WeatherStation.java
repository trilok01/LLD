package observerPattern.observable;

import observerPattern.observer.Display;

public interface WeatherStation {
    public void addObserver(Display display);
    public void removeObserver(Display display);
    public void notifyObserver();
    public void setTemp(int newTemp);
    public int getTemp();
}