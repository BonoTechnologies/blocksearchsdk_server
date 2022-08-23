package io.blockapi.rest.commons.form;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tech.bono.gear.commons.entity.form.CommonForm;

@Data
public class WebhookFilMessageForm {

    private long lastWebhookNo;
    private long subscriptionNo;
    private String address;
    private String webhookSendYn;
    private String inOut;
    private long blockHeight;
    private long startBlockHeight;
    private long endBlockHeight;

}