package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.pattern;

import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.pattern.command.AirportCommand;
import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model.Airport;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Invoker
 */
@Getter
public class AirportControl {

    private List<AirportCommand> airportCommands = new ArrayList<>();

    public void addAirport(final AirportCommand airportCommand) {
        airportCommand.execute();
        airportCommand.getAirport().setTotalPrice(calculateTotalAirportPrice(airportCommand.getAirport()));
        airportCommands.add(airportCommand);
    }

    private BigDecimal calculateTotalAirportPrice(final Airport airport) {
        return airport.getBoardingFee().add(airport.getSecurityTax());
    }

    public BigDecimal calculateTotalAirportsPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (final AirportCommand airportCommand : this.airportCommands) {
            totalPrice = totalPrice.add(airportCommand.getAirport().getTotalPrice());
        }
        return totalPrice;
    }

}
