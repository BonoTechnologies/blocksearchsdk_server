package io.blockapi.rest.ethereum.domain;

import lombok.Data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data
public class EthAddressDomain {

    private String address;
    private BigInteger balance;
    private String displayBalance;

    private String ethAccountDcd;
    private String ethAccount;
    private String tokenContractYn;
    private long indexedBlockNumber;

    private long addressTotalTxCount;
    private long addressOutTxCount;
    private long addressInTxCount;

    private long addressTotalTokenTransferCount;
    private long addressOutTokenTransferCount;
    private long addressInTokenTransferCount;

    private long addressTotalMinedBlockCount;

    private List<EthTokenDomain> tokens = new ArrayList<>();



}
