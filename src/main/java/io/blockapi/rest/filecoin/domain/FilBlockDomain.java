package io.blockapi.rest.filecoin.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FilBlockDomain {

    private String blockHash;
    private long blockHeight;
    private int blockOrder;
    private long blockTimestamp;
    private String minerId;

    private long blockSize;
    private int winCount;
    private int messageCount;
    private BigDecimal blockReward = BigDecimal.ZERO;
    private BigDecimal feeReward = BigDecimal.ZERO;
    private BigDecimal totalReward = BigDecimal.ZERO;

    private BigDecimal parentBaseFee = BigDecimal.ZERO;

}
