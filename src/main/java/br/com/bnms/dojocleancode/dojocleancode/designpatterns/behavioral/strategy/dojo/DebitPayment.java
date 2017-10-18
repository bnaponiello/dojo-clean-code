package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.dojo;

public class DebitPayment implements Payment {
    @Override
    public String pay() {
        return "Pago no DÉBITO";
    }
}
