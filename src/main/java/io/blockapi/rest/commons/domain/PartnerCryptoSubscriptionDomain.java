package io.blockapi.rest.commons.domain;

import lombok.Data;

@Data
public class PartnerCryptoSubscriptionDomain {

    private long subscriptionNo;
    private int cryptoId;
    private String address;
    private String addressLabel;
    private String subscriptionYn;

    private java.sql.Timestamp createDt;
    private java.sql.Timestamp updateDt;

}
