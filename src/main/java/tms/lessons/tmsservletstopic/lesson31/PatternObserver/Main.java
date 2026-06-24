package tms.lessons.tmsservletstopic.lesson31.PatternObserver;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer logger = new TemperatureLogger();
        Observer alert = new AlertSystem();

        weatherStation.attach(logger);
        weatherStation.attach(alert);

        weatherStation.setTemperature(35); // update  logger and alert

        weatherStation.detach(alert);

        weatherStation.setTemperature(40); // update  only logger
    }
}
