package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean;

import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean.command.AirportCommand;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean.command.AmericaAirportCommand;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean.command.BrazilAirportCommand;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean.command.FranceAirportCommand;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean.command.PortugalAirportCommand;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model.Airport;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import static br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.util.PrinterUtil.printSchedule;

/**
 * Scheduler
 */
public class Scheduler {

    public static void main(String[] args) {
        final AirportControl airportControl = generateAirportControl();
        final List<Airport> airports = new ArrayList<>();
        for (final AirportCommand airportCommand : airportControl.getAirportCommands()) {
            airports.add(airportCommand.getAirport());
        }
        printSchedule(airports, airportControl.calculateTotalAirportsPrice());
    }

    private static AirportControl generateAirportControl() {
        final AirportControl airportControl = new AirportControl();

        airportControl.addAirport(new BrazilAirportCommand());
        airportControl.addAirport(new AmericaAirportCommand());
        airportControl.addAirport(new PortugalAirportCommand());
        airportControl.addAirport(new FranceAirportCommand());

        return airportControl;
    }

}
