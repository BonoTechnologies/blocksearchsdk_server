package io.blockapi.rest.ethereum.domain;

import lombok.Data;

import java.util.List;

@Data
public class EthTxAccessDomain {
    private String address;
    private List<String> storageKeys;
}
