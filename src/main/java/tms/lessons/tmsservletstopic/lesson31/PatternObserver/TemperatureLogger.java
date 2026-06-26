package tms.lessons.tmsservletstopic.lesson31.PatternObserver;

public class TemperatureLogger implements Observer{
    @Override
    public void update(double temperature) {
        System.out.println("Текущая температура" + " " + temperature);
    }
}
