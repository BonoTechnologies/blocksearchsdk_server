package io.blockapi.rest.ethereum.domain;

import lombok.Data;

@Data
public class EthTokenTransferDomain {

    private String txHash;
    private int txIndex;
    private int txNonce;
    private int logIndex;
    private long tokenId;
    private String contractAddress;
    private String transferFrom;
    private String transferTo;
    private String transferValue = "0";
    private String transferDisplayValue = "0";

    private long   blockTimestamp;
    private String blockHash;
    private long   blockNumber;

    private String inOutDcd;
    private String inOut;

    private EthTokenDomain token;

}
