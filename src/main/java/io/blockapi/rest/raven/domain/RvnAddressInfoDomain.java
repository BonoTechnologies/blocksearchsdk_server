package io.blockapi.rest.raven.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RvnAddressInfoDomain {

    private String     rvnAddress;

    private BigDecimal totalReceived = BigDecimal.ZERO;
    private String     totalReceivedDisplayValue = "0";

    private BigDecimal totalSent = BigDecimal.ZERO;
    private String     totalSentDisplayValue = "0";

    private BigDecimal finalBalance = BigDecimal.ZERO;
    private String     finalBalanceDisplayValue = "0";

    private long   txCount;
    private String blockHash;
    private long   blockHeight;

}
