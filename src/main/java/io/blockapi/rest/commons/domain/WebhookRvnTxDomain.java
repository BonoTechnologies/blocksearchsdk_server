package io.blockapi.rest.commons.domain;

import io.blockapi.rest.raven.domain.RvnTxDomain;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class WebhookRvnTxDomain {

    private long webhookNo;
    private String webhookSendYn;
    private long subscriptionNo;
    private int pid;
    private String address;
    private String assetTransferYn;
    private String inOutDcd;
    private String inOut;
    private long blockHeight;
    private String blockHash;
    private long blockTimestamp;
    private String txId;
    private String txSuccessYn;
    private String txFrom;
    private String txTo;
    private BigDecimal txVal = BigDecimal.ZERO;
    private long assetId;
    private String assetNm;
    private int assetDecimal;
    private String transferFrom;
    private String transferTo;
    private BigDecimal transferVal;

    private RvnTxDomain transfer;

    private java.sql.Timestamp createDt;
    private java.sql.Timestamp updateDt;

    public String getTxId() {
        return (txId != null && txId.startsWith("0x")) ? txId.substring(2) : txId;
    }

    public long getBlockHeight() {
        return (blockHeight < 999999999999999999L ? blockHeight : -1);
    }

    public String getBlockHash() {
        return (blockHash != null && blockHash.startsWith("0x")) ? blockHash.substring(2) : blockHash;
    }

}
