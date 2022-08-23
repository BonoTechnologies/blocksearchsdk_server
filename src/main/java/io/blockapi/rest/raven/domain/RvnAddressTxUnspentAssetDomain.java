package io.blockapi.rest.raven.domain;

import lombok.Data;

@Data
public class RvnAddressTxUnspentAssetDomain {

    private long assetId;
    private String assetTypeDcd;
    private String assetType;
    private String assetNm;
    private int    assetUnits;

    private long rootAssetId;
    private long parentAssetId;

}
