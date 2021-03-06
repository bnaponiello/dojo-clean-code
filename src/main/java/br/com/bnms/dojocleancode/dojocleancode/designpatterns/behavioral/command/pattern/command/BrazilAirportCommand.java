package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.pattern.command;

import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model.Airport;

import java.math.BigDecimal;

/**
 * Concrete Command
 */
public class BrazilAirportCommand extends AirportCommand {

    @Override
    public void execute() {
        super.airport = Airport.builder()
                .country("Brasil")
                .boardingFee(BigDecimal.valueOf(114.97))
                .securityTax(BigDecimal.ZERO)
                .requireVisa(Boolean.FALSE)
                .build();
    }
}
