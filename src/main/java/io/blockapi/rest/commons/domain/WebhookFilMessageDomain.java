package io.blockapi.rest.commons.domain;

import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Data
public class WebhookFilMessageDomain {

    private long webhookNo;
    private String webhookSendYn;
    private long subscriptionNo;
    private int pid;
    private String address;
    private String inOutDcd;
    private String inOut;
    private long blockHeight;
    private long blockTimestamp;
    private String messageId;
    private int messageNonce;
    private int receiptExitCode;
    private String messageFrom;
    private String messageTo;
    private BigDecimal messageVal;
    private String signedMessageId;

    private java.sql.Timestamp createDt;
    private java.sql.Timestamp updateDt;

}
