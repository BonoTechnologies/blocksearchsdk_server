package io.blockapi.rest.ethereum.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class EthPendingTxDomain {

    private String txHash;
    private int txNonce;
    private String txFrom;
    private String txTo;

    private BigDecimal txValue;
    private BigDecimal txGasPrice;
    private long txGas;
    private String txInput;

    private String inOutDcd;
    private String inOut;

    // eip-1559
    private int type;
    private BigDecimal maxFeePerGas;
    private BigDecimal maxPriorityFeePerGas;
    private List<EthTxAccessDomain> accessList;

    private long createUts;
}
