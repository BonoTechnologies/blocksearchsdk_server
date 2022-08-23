package io.blockapi.rest.bitcoin.domain;

import io.blockapi.rest.bitcoin.domain.BtcTxInputDomain;
import io.blockapi.rest.bitcoin.domain.BtcTxOutputDomain;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BtcPendingTxDomain {

    private String txId;
    private String txHash;
    private int txSize;
    private int txVsize;
    private int txWeight;
    private int txVersion;
    private int txLocktime;
    private int txInputCount;
    private int txOutputCount;

    private List<BtcTxInputDomain> inputs  = new ArrayList<>();
    private List<BtcTxOutputDomain> outputs = new ArrayList<>();

    private long createUts;

    public String getTxId() {
        return (txId != null && txId.startsWith("0x")) ? txId.substring(2) : txId;
    }

    public String getTxHash() {
        return (txHash != null && txHash.startsWith("0x")) ? txHash.substring(2) : txHash;
    }

}
