package tms.lessons.tmsservletstopic.lesson31.PatternDecorator;

public class latte implements Beverage{
    @Override
    public String getDescription() {
        return "Латте";
    }

    @Override
    public float cost() {
        return 5;
    }
}
