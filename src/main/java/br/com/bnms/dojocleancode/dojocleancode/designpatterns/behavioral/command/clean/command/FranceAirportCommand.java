package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean.command;

import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model.Airport;

import java.math.BigDecimal;

/**
 * Concrete Command
 */
public class FranceAirportCommand extends AirportCommand {

    @Override
    public void execute() {
        super.airport = Airport.builder()
                .country("França")
                .boardingFee(BigDecimal.valueOf(38.9))
                .securityTax(BigDecimal.valueOf(43.34))
                .requireVisa(Boolean.TRUE)
                .build();
    }
}
