package io.blockapi.rest.ethereum.domain;

import lombok.Data;

import java.math.BigInteger;

@Data
public class EthTokenHolderDomain {

    private long tokenId;
    private String contractAddress;
    private long indexedBlockNumber;

    private String address;
    private String ethAccountDcd;
    private String ethAccount;
    private String tokenContractYn;

    private BigInteger tokenBalance;

}
