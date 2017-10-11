package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean;

import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean.command.AirportCommand;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean.command.AmericaAirportCommand;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean.command.BrazilAirportCommand;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean.command.FranceAirportCommand;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean.command.PortugalAirportCommand;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model.Airport;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * Client
 */
public class Client {

    private static final NumberFormat nf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        final AirportControl airportControl = new AirportControl();

        airportControl.addAirport(new BrazilAirportCommand());
        airportControl.addAirport(new AmericaAirportCommand());
        airportControl.addAirport(new PortugalAirportCommand());
        airportControl.addAirport(new FranceAirportCommand());

        printHeader();

        for (final AirportCommand airportCommand : airportControl.getAirportCommands()) {
            printBody(airportCommand.getAirport());
        }

        printFooter(airportControl.calculateTotalAirportsPrice());
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
