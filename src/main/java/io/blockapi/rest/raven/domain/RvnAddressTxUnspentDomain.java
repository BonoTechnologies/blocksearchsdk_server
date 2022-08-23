package io.blockapi.rest.raven.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RvnAddressTxUnspentDomain {

    private String txId;
    private int    txIndex;

    private String blockHash;
    private long blockHeight;

    private int outputIndex;
    private String scriptPubkeyAsm;
    private String scriptPubkeyHex;

    private BigDecimal outputVal = BigDecimal.ZERO;

    private RvnAddressTxUnspentAssetDomain asset;
    private long confirmations;


}
