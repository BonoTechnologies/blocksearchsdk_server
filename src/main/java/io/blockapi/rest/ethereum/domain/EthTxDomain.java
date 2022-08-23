package io.blockapi.rest.ethereum.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class EthTxDomain {

    @JsonIgnore
    private String txReceiptLogsBloom;

    private String txHash;
    private int    txReceiptStatus;
    private String txStatus;
    private int txNonce;
    private String blockHash;
    private long blockNumber;
    private int txIndex;
    private EthAddressSummaryDomain from;
    private EthAddressSummaryDomain to;

    @JsonFormat(shape= JsonFormat.Shape.STRING)
    private BigDecimal txValue = BigDecimal.ZERO;
    private String txDisplayValue = "0";

    private BigDecimal txGasPrice = BigDecimal.ZERO;
    private long txGas;
    private String txInput;
    private long blockTimestamp;

    // ETH_TX_RECEIPT
    private long cumulativeGasUsed;
    private long txGasUsed;
    private BigDecimal txCost = BigDecimal.ZERO;
    private String contractAddress;
    private String txReceiptRoot;

    private List<EthTxTokenTransferDomain> tokenTransfers = new ArrayList<>();

    private String inOutDcd;
    private String inOut;

    private int txTotalTokenTransferCount;
    private String walletConnectYn;

    // eip-1559
    private int type;
    private BigDecimal maxFeePerGas;
    private BigDecimal maxPriorityFeePerGas;
    private List<EthTxAccessDomain> accessList;
    private BigDecimal baseFeePerGas;

}
