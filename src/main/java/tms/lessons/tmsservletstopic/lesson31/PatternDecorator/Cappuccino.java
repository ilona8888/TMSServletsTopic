package tms.lessons.tmsservletstopic.lesson31.PatternDecorator;

import java.util.stream.BaseStream;

public class Cappuccino implements Beverage {
    @Override
    public String getDescription() {
        return "Капучино";
    }

    @Override
    public float cost() {
        return 5;
    }
}
