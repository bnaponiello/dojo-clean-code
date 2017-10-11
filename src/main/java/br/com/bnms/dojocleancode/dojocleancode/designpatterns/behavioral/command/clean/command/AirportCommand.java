package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.clean.command;

import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model.Airport;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Command
 */
@Data
public abstract class AirportCommand {

    protected Airport airport;

    public abstract void execute();

}
