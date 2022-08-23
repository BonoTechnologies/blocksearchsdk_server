package io.blockapi.rest.commons.form;

import lombok.Data;

@Data
public class WebhookBtcTxForm {

    private long lastWebhookNo;
    private long subscriptionNo;
    private String address;
    private String webhookSendYn;
    private String inOut;
    private long blockHeight;
    private long startBlockHeight;
    private long endBlockHeight;

}
