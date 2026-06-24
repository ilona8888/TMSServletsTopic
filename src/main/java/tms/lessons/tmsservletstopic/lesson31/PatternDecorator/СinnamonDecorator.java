package tms.lessons.tmsservletstopic.lesson31.PatternDecorator;

public class СinnamonDecorator implements Beverage {

    Beverage beverage;
    public СinnamonDecorator(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + " Корица ";
    }

    @Override
    public float cost() {
        return (float) (beverage.cost() + 0.50);
    }
}
