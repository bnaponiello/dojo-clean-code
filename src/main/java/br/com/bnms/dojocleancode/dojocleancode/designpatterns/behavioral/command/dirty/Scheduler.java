package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.dirty;

import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model.Airport;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.util.PrinterUtil.printSchedule;

public class Scheduler {

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

        printSchedule(airports, calculateTotalPrice(airports));
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
