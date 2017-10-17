package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.pattern.command;

import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model.Airport;

import java.math.BigDecimal;

/**
 * Concrete Command
 */
public class PortugalAirportCommand extends AirportCommand {

    @Override
    public void execute() {
        super.airport = Airport.builder()
                .country("Portugal")
                .boardingFee(BigDecimal.valueOf(98.28))
                .securityTax(BigDecimal.valueOf(43.34))
                .requireVisa(Boolean.TRUE)
                .build();
    }
}
