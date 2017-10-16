package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.util;

import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean.AirportControl;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean.command.AirportCommand;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model.Airport;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class PrinterUtil {

    private static final NumberFormat nf = NumberFormat.getCurrencyInstance();

    public static void printSchedule(final List<Airport> airports, final BigDecimal totalAirportsPrice) {
        printHeader();

        for (final Airport airport : airports) {
            printBody(airport);
        }

        printFooter(totalAirportsPrice);
    }

    private static void printHeader() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Preços e Taxas Detalhados");
        System.out.println("---------------------------------------------------------");
    }

    private static void printBody(final Airport airport) {
        System.out.println(String.format("%s - Taxa de embarque: %s", airport.getCountry(), nf.format(airport.getBoardingFee())));
        System.out.println(String.format("%s - Taxa de segurança: %s", airport.getCountry(), nf.format(airport.getSecurityTax())));
        System.out.println(String.format("%s - Exige visto: %s", airport.getCountry(), airport.getRequireVisa() ? "Sim" : "Não"));
        System.out.print("\n");
    }

    private static void printFooter(final BigDecimal total) {
        final NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("---------------------------------------------------------");
        System.out.println(String.format("Preço Total: %s", nf.format(total)));
    }
}
