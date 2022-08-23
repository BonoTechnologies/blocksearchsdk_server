package io.blockapi.rest.commons.form;

import lombok.Data;

@Data
public class WebhookEthTxForm {

    private long lastWebhookNo;
    private long subscriptionNo;
    private String address;
    private String webhookSendYn;
    private String inOut;
    private long blockNumber;
    private long startBlockNumber;
    private long endBlockNumber;
    private long tokenId;

}
