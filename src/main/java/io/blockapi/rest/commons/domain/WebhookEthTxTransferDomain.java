package io.blockapi.rest.commons.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class WebhookEthTxTransferDomain {

    private String contractAddress;
    private long tokenId;
    private String tokenNm;
    private String tokenSymbol;
    private int tokenDecimal;
    private String transferFrom;
    private String transferTo;
    private BigDecimal transferVal;

}
