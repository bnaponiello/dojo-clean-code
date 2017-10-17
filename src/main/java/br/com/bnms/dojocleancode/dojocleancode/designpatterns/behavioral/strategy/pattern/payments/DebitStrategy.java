package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern.payments;

/**
 * Concrete strategy
 */
public class DebitStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Pago no DÉBITO");
    }
}
