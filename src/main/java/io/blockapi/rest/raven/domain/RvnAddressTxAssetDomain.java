package io.blockapi.rest.raven.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RvnAddressTxAssetDomain {

    private long assetId;
    private String assetTypeDcd;
    private String assetType;
    private String assetNm;
    private int    assetUnits;

    private BigDecimal assetAmount = BigDecimal.ZERO;
    private String     assetAmountDisplayValue = "0";

}
