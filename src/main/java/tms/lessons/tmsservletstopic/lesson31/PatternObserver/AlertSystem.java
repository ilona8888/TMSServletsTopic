package tms.lessons.tmsservletstopic.lesson31.PatternObserver;

public class AlertSystem implements Observer{
    @Override
    public void update(double temperature) {
        if(temperature > 29) System.out.println("Осторожно на улице высокая температура");
    }
}
