package io.blockapi.rest.ethereum.domain;

import lombok.Data;

@Data
public class EthTxTokenTransferDomain {

    private long tokenId;
    private String contractAddress;
    private String tokenName;
    private String tokenSymbol;
    private int  tokenDecimals;

    private String transferFrom;
    private String transferTo;
    private String transferValue;
    private String transferDisplayValue;

}
