package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.dojo;

public class MercadoPagoPayment implements Payment {
    @Override
    public String pay() {
        return "Pago com MERCADO PAGO";
    }
}
