package io.blockapi.rest.commons.form;

import lombok.Data;

@Data
public class PartnerCryptoSubscriptionForm {

    private String address;
    private String addressLabel;
    private String subscriptionYn;

}
