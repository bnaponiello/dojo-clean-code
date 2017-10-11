package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.dirty;

import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model.Airport;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model.Order;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

public class Scanner {

    public static void main(String[] args) {
        final Airport brazilAirport = Airport.builder()
                .country("Brasil")
                .boardingFee(BigDecimal.valueOf(114.97))
                .securityTax(BigDecimal.ZERO)
                .requireVisa(Boolean.FALSE)
                .build();
        brazilAirport.setTotalPrice(calculateTotalPrice(brazilAirport));

        final Airport americaAirport = Airport.builder()
                .country("EUA")
                .boardingFee(BigDecimal.valueOf(59.63))
                .securityTax(BigDecimal.ZERO)
                .requireVisa(Boolean.TRUE)
                .build();
        americaAirport.setTotalPrice(calculateTotalPrice(americaAirport));

        final Airport portugalAirport = Airport.builder()
                .country("Portugal")
                .boardingFee(BigDecimal.valueOf(98.28))
                .securityTax(BigDecimal.valueOf(43.34))
                .requireVisa(Boolean.TRUE)
                .build();
        portugalAirport.setTotalPrice(calculateTotalPrice(portugalAirport));

        final Airport franceAirport = Airport.builder()
                .country("França")
                .boardingFee(BigDecimal.valueOf(38.9))
                .securityTax(BigDecimal.valueOf(43.34))
                .requireVisa(Boolean.TRUE)
                .build();
        franceAirport.setTotalPrice(calculateTotalPrice(franceAirport));

        final List<Airport> airports = Arrays.asList(brazilAirport, americaAirport, portugalAirport, franceAirport);
        final Order order = new Order(airports);

        final NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println("---------------------------------------------------------");
        System.out.println("Preços e Taxas Detalhados");
        System.out.println("---------------------------------------------------------");

        for (final Airport airport : order.getAirports()) {
            System.out.println(String.format("%s - Taxa de embarque: %s", airport.getCountry(), nf.format(airport.getBoardingFee())));
            System.out.println(String.format("%s - Taxa de segurança: %s", airport.getCountry(), nf.format(airport.getSecurityTax())));
            System.out.println(String.format("%s - Exige visto: %s", airport.getCountry(), airport.getRequireVisa() ? "Sim" : "Não"));
            System.out.print("\n");
        }

        System.out.println("---------------------------------------------------------");
        System.out.println(String.format("Preço Total: %s", nf.format(calculateTotalPrice(order.getAirports()))));

    }

    private static BigDecimal calculateTotalPrice(final Airport airport) {
        return airport.getBoardingFee().add(airport.getSecurityTax());
    }

    private static BigDecimal calculateTotalPrice(final List<Airport> airports) {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (final Airport airport : airports) {
            totalPrice = totalPrice.add(airport.getTotalPrice());
        }
        return totalPrice;
    }

}
