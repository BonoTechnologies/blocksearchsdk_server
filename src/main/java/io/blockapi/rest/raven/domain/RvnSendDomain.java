package io.blockapi.rest.raven.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RvnSendDomain {

    private String hex;

    private String to;
    private String from;
    private BigDecimal amount;

    private String assetNm;

}
