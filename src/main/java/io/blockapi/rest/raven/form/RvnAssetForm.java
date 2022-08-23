package io.blockapi.rest.raven.form;

import lombok.Data;

@Data
public class RvnAssetForm {

    private String assetDcd;
    private String assetNm;
    private long rootAssetId;
    private long parentAssetId;
    private String keyword;

}
