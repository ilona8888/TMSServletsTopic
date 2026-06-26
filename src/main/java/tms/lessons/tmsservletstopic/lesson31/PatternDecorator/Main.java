package tms.lessons.tmsservletstopic.lesson31.PatternDecorator;

public class Main {
    public static void main(String[] args) {
        Beverage latteWithSyrup = new SyrupDecorator(new latte());
        Beverage cappuccinoWithCinnamonAndCream = new CreamDecorator(new СinnamonDecorator(new Cappuccino()));
        Beverage americanoWithCream = new CreamDecorator(new Americano());


        System.out.println(String.format("Кофе: %s Цена: %s",latteWithSyrup.getDescription(),latteWithSyrup.cost()));
        System.out.println(String.format(
                "Кофе: %s Цена: %s",
                cappuccinoWithCinnamonAndCream.getDescription(),
                cappuccinoWithCinnamonAndCream.cost()));

        System.out.println(String.format(
                "Кофе: %s Цена: %s",
                americanoWithCream.getDescription(),
                americanoWithCream.cost()));
    }
}
