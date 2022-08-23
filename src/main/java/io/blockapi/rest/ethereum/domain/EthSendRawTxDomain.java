package io.blockapi.rest.ethereum.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class EthSendRawTxDomain {

    private long id;
    private String networkId;

    private String hex;
    private String txHash;
    private int txNonce;
    private String from;
    private String to;
    private String contractAddress;
    private BigDecimal txValue;
    private BigDecimal txGasPrice;
    private long txGas;
    private String txInput;
    private String walletConnectYn = "N";

    private int type;
    private BigDecimal maxFeePerGas;
    private BigDecimal maxPriorityFeePerGas;
    private List<EthTxAccessDomain> accessList;

}
