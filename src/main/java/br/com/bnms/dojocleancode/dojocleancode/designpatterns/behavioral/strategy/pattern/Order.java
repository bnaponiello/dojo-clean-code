package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern;

import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern.payments.PaymentStrategy;

/**
 * Context
 */
public class Order {

    public void processOrder(final PaymentStrategy paymentStrategy) {
        if (paymentStrategy == null) {
            System.out.println("Tipo de pagamento não aceito!!!");
        } else {
            paymentStrategy.pay();
        }
    }

}
