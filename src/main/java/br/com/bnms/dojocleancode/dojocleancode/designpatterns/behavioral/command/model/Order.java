package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Order {

    private List<Airport> airports;

}
