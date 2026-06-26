package tms.lessons.tmsservletstopic.lesson31.PatternDecorator;

public class Americano implements Beverage{
    @Override
    public String getDescription() {
        return "Американо";
    }

    @Override
    public float cost() {
        return 3;
    }
}
