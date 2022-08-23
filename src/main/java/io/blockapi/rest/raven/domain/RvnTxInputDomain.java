package io.blockapi.rest.raven.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RvnTxInputDomain {

    private String txId;
    private int inputIndex;
    private String inputAddress;
    private BigDecimal inputVal = BigDecimal.ZERO;
    private long inputSequence;
    private String coinbaseYn;
    private String coinbase;
    private String scriptSigAsm;
    private String scriptSigHex;
    private String prevTxId;
    private int outputIndex;

}
