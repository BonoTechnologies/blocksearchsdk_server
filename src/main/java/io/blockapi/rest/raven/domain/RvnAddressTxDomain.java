package io.blockapi.rest.raven.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RvnAddressTxDomain {

    private String inOutDcd;
    private String inOut;
    private String fromAddress;
    private String toAddress;

    private BigDecimal val = BigDecimal.ZERO;
    private String     valDisplayValue = "0";

    // asset
    private String assetActivityDcd;
    private String assetActivity;

}
