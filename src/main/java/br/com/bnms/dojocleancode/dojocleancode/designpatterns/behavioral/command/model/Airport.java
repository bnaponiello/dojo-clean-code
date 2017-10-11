package br.com.bnms.dojocleancode.dojocleancode.designpatterns.behavioral.command.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Airport {

    private String country;

    private BigDecimal boardingFee;

    private BigDecimal securityTax;

    private Boolean requireVisa;

    private BigDecimal totalPrice;

}
