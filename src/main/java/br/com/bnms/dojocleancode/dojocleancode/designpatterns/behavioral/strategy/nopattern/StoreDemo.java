package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.nopattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StoreDemo {

    private static final String PAYPAL = "PAYPAL";
    private static final String CREDIT_CARD = "CREDIT_CARD";
    private static final String DEBIT = "DEBIT";
    private static final String MERCADO_PAGO = "MERCADO_PAGO";

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while(true) {
            System.out.println("Como deseja pagar sua compra?");
            final String input = reader.readLine();

            if ("1".equals(input)) {
                System.out.println("Obrigado por comprar conosco! Volte sempre!");
                break;
            }

            pay(input);

            System.out.print("\n\n");
        }
    }

    private static void pay(final String paymentType) {
        System.out.println("Processando pagamento...");
        if (PAYPAL.equalsIgnoreCase(paymentType)) {
            paypalPayment();
        } else if (CREDIT_CARD.equalsIgnoreCase(paymentType)) {
            creditCartPayment();
        } else if (DEBIT.equalsIgnoreCase(paymentType)) {
            debitPayment();
        } else if (MERCADO_PAGO.equalsIgnoreCase(paymentType)) {
            mercadoPagoPayment();
        } else {
            System.out.println("Tipo de pagamento não aceito!!!");
        }
    }

    private static void paypalPayment() {
        System.out.println("Pago com PAYPAL");
    }

    private static void creditCartPayment() {
        System.out.println("Pago com CARTÂO DE CRÉDITO");
    }

    private static void debitPayment() {
        System.out.println("Pago no DÉBITO");
    }

    private static void mercadoPagoPayment() {
        System.out.println("Pago com MERCADO PAGO");
    }

}
