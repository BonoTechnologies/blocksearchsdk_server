package io.blockapi.rest.filecoin.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FilMessageDomain {

    private String messageId;

    private long blockHeight;
    private long blockTimestamp;
    private String messageTo;
    private String messageFrom;

    private String inOut;

    private BigDecimal messageVal = BigDecimal.ZERO;

    private int messageNonce;
    private long gasLimit;
    private long gasFeeCap;
    private long gasPremium;
    private int methodNumber;
    private String methodName;

    private String signedMessageId;
    private String decodedParams;

    private String messageStatus;
    private int    receiptExitCode;
    private String receiptReturnVal;
    private long   receiptGasUsed;
    private String rewardMinerId;

    private BigDecimal rewardMinerFee = BigDecimal.ZERO;
    private BigDecimal rewardBurnFee = BigDecimal.ZERO;

}
