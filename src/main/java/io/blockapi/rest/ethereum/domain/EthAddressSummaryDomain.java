package io.blockapi.rest.ethereum.domain;

import lombok.Data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data
public class EthAddressSummaryDomain {

    private String address;
    private String ethAccountDcd;
    private String ethAccount;
    private String tokenContractYn;

}
