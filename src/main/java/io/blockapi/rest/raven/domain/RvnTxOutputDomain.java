package io.blockapi.rest.raven.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RvnTxOutputDomain {

    private String txId;
    private int outputIndex;
    private String outputType;
    private String outputAddress;
    private BigDecimal outputVal = BigDecimal.ZERO;
    private String scriptPubkeyAsm;
    private String scriptPubkeyHex;

    private RvnAddressTxAssetDomain asset;

    private String spentYn;
    private String spentTxId;
    private int spentInputIndex;

}
