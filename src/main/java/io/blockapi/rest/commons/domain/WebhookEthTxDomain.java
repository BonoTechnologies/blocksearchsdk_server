package io.blockapi.rest.commons.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class WebhookEthTxDomain {

    private long webhookNo;
    private String webhookSendYn;
    private long subscriptionNo;
    private int pid;
    private String address;
    private String tokenTransferYn;
    private String inOutDcd;
    private String inOut;
    private long blockNumber;
    private String blockHash;
    private long blockTimestamp;
    private String txId;
    private int txNonce;
    private String txSuccessYn;
    private String txFrom;
    private String txTo;
    private BigDecimal txVal;

    private WebhookEthTxTransferDomain transfer;

    private java.sql.Timestamp createDt;
    private java.sql.Timestamp updateDt;

}
