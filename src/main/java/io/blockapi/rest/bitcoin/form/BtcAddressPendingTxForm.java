package io.blockapi.rest.bitcoin.form;

import lombok.Data;

@Data
public class BtcAddressPendingTxForm {

    private String inOut;
    private String inOutDcd;
}
