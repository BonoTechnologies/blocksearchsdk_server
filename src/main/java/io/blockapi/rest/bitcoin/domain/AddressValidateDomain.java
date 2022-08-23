package io.blockapi.rest.bitcoin.domain;

import lombok.Data;

@Data
public class AddressValidateDomain {

    private String address;
    private boolean isvalid;

}
