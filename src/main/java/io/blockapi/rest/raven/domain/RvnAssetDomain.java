package io.blockapi.rest.raven.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RvnAssetDomain {

    private long assetId;
    private String assetDcd;
    private String asset;
    private String assetNm;
    private String assetOwner;
    private String ownerYn;
    private BigDecimal assetFinalBalance = BigDecimal.ZERO;
    private String     assetFinalBalanceDisplayValue = "0";
    private BigDecimal assetAmount = BigDecimal.ZERO;
    private String     assetAmountDisplayValue = "0";

    private int assetUnits;
    private String reissuableYn;
    private String ipfsYn;
    private String ipfs;

    private long rootAssetId;
    private String rootAssetNm;

    private long parentAssetId;
    private String parentAssetNm;

    private String blockHash;
    private long blockHeight;

    // For CoinUs Service
    private String contractAddress;
    private String tokenSymbol;

}
