package io.blockapi.rest.bitcoin.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BtcAddressTxUnspentDomain {

    private String txId;
    private int    txIndex;
    private String blockHash;
    private long blockHeight;
    private long blockConfirms;

    private int outputIndex;
    private String scriptPubkeyAsm;
    private String scriptPubkeyHex;

    private BigDecimal outputVal = BigDecimal.ZERO;

}
