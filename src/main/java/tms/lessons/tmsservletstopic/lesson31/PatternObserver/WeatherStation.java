package tms.lessons.tmsservletstopic.lesson31.PatternObserver;

import tms.lessons.tmsservletstopic.lesson31.PatternObserver.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private final List<Observer> observers = new ArrayList<>();
    private double temperature;

    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers(); //sent notification
    }
}
