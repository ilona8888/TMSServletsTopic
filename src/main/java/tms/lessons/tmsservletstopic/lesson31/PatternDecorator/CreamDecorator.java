package tms.lessons.tmsservletstopic.lesson31.PatternDecorator;

public class CreamDecorator implements Beverage {

    Beverage beverage;

    public CreamDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Сливки ";
    }

    @Override
    public float cost() {
        return 1.50F;
    }
}
