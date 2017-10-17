package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern.payments;

/**
 * Concrete strategy
 */
public class MercadoPagoStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Pago com MERCADO PAGO");
    }
}
