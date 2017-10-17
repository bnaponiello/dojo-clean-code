package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.strategy.pattern;

public enum PaymentEnum {

    PAYPAL("PAYPAL", "PAYPAL"),
    CREDIT_CARD("CREDIT_CARD", "CARTÃO DE CRÉDITO"),
    DEBIT("DEBIT", "DÉBITO"),
    MERCADO_PAGO("MERCADO_PAGO", "MECADO PAGO");


    private String paymentId;
    private String message;

    PaymentEnum(final String paymentId, final String message) {
        this.paymentId = paymentId;
        this.message = message;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getMessage() {
        return message;
    }
}
