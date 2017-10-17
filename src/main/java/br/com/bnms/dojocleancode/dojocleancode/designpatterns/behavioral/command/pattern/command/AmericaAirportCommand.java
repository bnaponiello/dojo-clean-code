package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.pattern.command;

import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model.Airport;

import java.math.BigDecimal;

/**
 * Concrete Command
 */
public class AmericaAirportCommand extends AirportCommand {

    @Override
    public void execute() {
        super.airport = Airport.builder()
                .country("EUA")
                .boardingFee(BigDecimal.valueOf(59.63))
                .securityTax(BigDecimal.ZERO)
                .requireVisa(Boolean.TRUE)
                .build();

    }
}
