package io.blockapi.rest.ethereum.domain;

import lombok.Data;

@Data
public class EthPendingTokenTransferDomain {

    private long tokenId;
    private String txHash;
    private long logIndex;
    private String contractAddress;
    private String transferFrom;
    private String transferTo;
    private String transferValue;

    private long createUts;

}
