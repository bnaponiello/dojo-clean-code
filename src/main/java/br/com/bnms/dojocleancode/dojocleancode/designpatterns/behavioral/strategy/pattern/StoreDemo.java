package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern;

import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern.payments.CreditCardStrategy;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern.payments.DebitStrategy;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern.payments.MercadoPagoStrategy;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern.payments.PayPalStrategy;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern.payments.PaymentStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern.PaymentEnum.CREDIT_CARD;
import static br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern.PaymentEnum.DEBIT;
import static br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern.PaymentEnum.MERCADO_PAGO;
import static br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern.PaymentEnum.PAYPAL;

public class StoreDemo {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while(true) {
            System.out.println("Como deseja pagar sua compra?");
            final String input = reader.readLine();

            if ("1".equals(input)) {
                System.out.println("Obrigado por comprar conosco! Volte sempre!");
                break;
            }

            final Order order = new Order();
            order.processOrder(pay(input));

            System.out.print("\n\n");
        }
    }

    private static PaymentStrategy pay(final String paymentType) {
        if (PAYPAL.getPaymentId().equalsIgnoreCase(paymentType)) {
            return new PayPalStrategy();
        } else if (CREDIT_CARD.getPaymentId().equalsIgnoreCase(paymentType)) {
            return new CreditCardStrategy();
        } else if (DEBIT.getPaymentId().equalsIgnoreCase(paymentType)) {
            return new DebitStrategy();
        } else if (MERCADO_PAGO.getPaymentId().equalsIgnoreCase(paymentType)) {
            return new MercadoPagoStrategy();
        } else {
            return null;
        }
    }
}
