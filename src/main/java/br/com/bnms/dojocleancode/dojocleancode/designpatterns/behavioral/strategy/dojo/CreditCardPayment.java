package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.dojo;

public class CreditCardPayment implements Payment {
    @Override
    public String pay() {
        return "Pago com cartão de crédito";
    }
}
