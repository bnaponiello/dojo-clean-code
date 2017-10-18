package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.dojo;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {

    private static final Map<String, Payment> paymetsMethods = new HashMap<>();

    static {
        paymetsMethods.put("PAYPAL", new PaypalPayment());
        paymetsMethods.put("CREDIT_CARD", new CreditCardPayment());
        paymetsMethods.put("DEBIT", new DebitPayment());
        paymetsMethods.put("MERCADO_PAGO", new MercadoPagoPayment());
    }

    public Payment get(String paymentType){
        if (paymetsMethods.containsKey(paymentType)){
            return paymetsMethods.get(paymentType);
        }

        return new NotImplementedPayment();
    }
}
