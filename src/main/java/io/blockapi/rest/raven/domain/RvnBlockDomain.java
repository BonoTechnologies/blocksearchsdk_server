package io.blockapi.rest.raven.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RvnBlockDomain {

    private String blockHash;
    private long blockHeight;
    private int blockSize;
    private int blockVersion;
    private long blockTimestamp;
    private String bits;
    private long blockNonce;
    private String blockDifficulty;
    private String merkleRoot;
    private String chainwork;
    private String prevBlockHash;
    private String nextBlockHash;
    private int blockTxCount;

    private BigDecimal blockReward = BigDecimal.ZERO;
    private BigDecimal blockInputVal = BigDecimal.ZERO;
    private BigDecimal blockOutputVal = BigDecimal.ZERO;
    private BigDecimal blockFees = BigDecimal.ZERO;

    private String finalizedYn;

    private RvnMinerInfoDomain minerInfo;
}
