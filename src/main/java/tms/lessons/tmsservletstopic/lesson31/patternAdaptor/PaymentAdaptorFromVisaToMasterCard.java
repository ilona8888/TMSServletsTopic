package tms.lessons.tmsservletstopic.lesson31.patternAdaptor;

public class PaymentAdaptorFromVisaToMasterCard implements PaymentProcessor {

    PaymentByVisaCard payment;

    public PaymentAdaptorFromVisaToMasterCard(PaymentByVisaCard payment) {
        this.payment = payment;
    }

    @Override
    public void pay(Card card) {
        //some logic that convert payment instead of visa into mastercard
        payment.payByVisaCard(card);
    }
}
