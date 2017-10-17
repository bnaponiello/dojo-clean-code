package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.pattern.command;

import br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model.Airport;
import lombok.Data;

/**
 * Command
 */
@Data
public abstract class AirportCommand {

    protected Airport airport;

    public abstract void execute();

}
