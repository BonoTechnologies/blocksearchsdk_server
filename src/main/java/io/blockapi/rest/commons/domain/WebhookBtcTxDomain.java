package io.blockapi.rest.commons.domain;

import io.blockapi.rest.bitcoin.domain.BtcTxDomain;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class WebhookBtcTxDomain {

    private long webhookNo;
    private String webhookSendYn;
    private long subscriptionNo;
    private int pid;
    private String address;
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

    private BtcTxDomain transfer;

    private java.sql.Timestamp createDt;
    private java.sql.Timestamp updateDt;


}
