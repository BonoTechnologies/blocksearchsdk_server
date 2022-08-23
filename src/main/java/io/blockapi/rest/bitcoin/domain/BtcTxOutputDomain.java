package io.blockapi.rest.bitcoin.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BtcTxOutputDomain {

    private String txId;
    private int outputIndex;
    private String outputAddress;
    private BigDecimal outputVal = BigDecimal.ZERO;
    private String scriptPubkeyAsm;
    private String scriptPubkeyHex;
    private String scriptPubkeyType;
    private Integer scriptPubkeyReqsigs;

    private String spentYn;
    private String spentTxId;
    private int spentInputIndex;

}
