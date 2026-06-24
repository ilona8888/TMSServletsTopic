package tms.lessons.tmsservletstopic.lesson31.patternAdaptor;

public class Main {
    public static void main(String[] args) {
        Card viseCard = new Card();
        PaymentByVisaCard paymentByVisaCard = new PaymentByVisaCard();
        PaymentProcessor paymentProcessor = new PaymentAdaptorFromVisaToMasterCard(paymentByVisaCard);
        paymentProcessor.pay(viseCard);
    }
}
