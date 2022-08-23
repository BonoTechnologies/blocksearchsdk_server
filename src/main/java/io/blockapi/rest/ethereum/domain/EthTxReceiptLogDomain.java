package io.blockapi.rest.ethereum.domain;

import lombok.Data;

@Data
public class EthTxReceiptLogDomain {

    private String txHash;
    private int txIndex;
    private int logIndex;
    private String removed;
    private String blockHash;
    private long blockNumber;
    private String address;
    private String data;
    private String type;
    private String topics;

}
