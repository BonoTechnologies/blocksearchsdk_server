package io.blockapi.rest.ethereum.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EthBlockDomain {

    private long blockNumber;
    private String blockHash;
    private long blockTimestamp;
    private String blockParentHash;
    private String blockNonce;
    private String blockSha3Uncles;
    private String blockLogsBloom;
    private String blockTransactionsRoot;
    private String blockStateRoot;
    private String blockReceiptsRoot;
    private String blockMiner;
    private BigDecimal blockDifficulty;
    private BigDecimal blockTotalDifficulty;
    private String blockExtraData;
    private long blockSize;
    private long blockGasLimit;
    private long blockGasUsed;

    private BigDecimal blockAvgGasPrice = BigDecimal.ZERO;
    private BigDecimal blockAvgGasCost = BigDecimal.ZERO;
    private BigDecimal blockTotalGasCost = BigDecimal.ZERO;
    private long blockTotalUncleCount;
    private long blockTotalTxCount;

    private String finalizedYn;

    // eip-1559
    private BigDecimal baseFeePerGas;

}
