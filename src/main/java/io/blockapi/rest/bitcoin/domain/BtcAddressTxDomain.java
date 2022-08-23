package io.blockapi.rest.bitcoin.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BtcAddressTxDomain {

    private String inOutDcd;
    private String inOut;
    private String fromAddress;
    private String toAddress;

    private BigDecimal val = BigDecimal.ZERO;
    private String     valDisplayValue = "0";

}
