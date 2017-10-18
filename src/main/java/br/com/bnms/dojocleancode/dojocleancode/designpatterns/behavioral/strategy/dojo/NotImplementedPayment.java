package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.dojo;

public class NotImplementedPayment implements Payment {
    @Override
    public String pay() {
        return "Tipo de pagamento não aceito!!!";
    }
}
