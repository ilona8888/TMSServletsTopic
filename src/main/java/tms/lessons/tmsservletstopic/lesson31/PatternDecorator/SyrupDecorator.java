package tms.lessons.tmsservletstopic.lesson31.PatternDecorator;

public class SyrupDecorator implements Beverage{

    Beverage beverage;
    public SyrupDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Сироп ";
    }

    @Override
    public float cost() {
        return beverage.cost() + 1;
    }
}
