package io.blockapi.rest.bitcoin.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SendToAddressDomain {

    private String hex;

    private String address;

    private String to;
    private String from;

    private BigDecimal amount;

}
