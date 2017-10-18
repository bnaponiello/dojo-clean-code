package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.dojo;

public class PaypalPayment implements Payment {

    @Override
    public String pay() {
        return "Pago com PAYPAL";
    }
}
