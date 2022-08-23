package io.blockapi.rest.ethereum.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.blockapi.rest.commons.domain.CryptoExchangeRateDomain;
import lombok.Data;

import java.math.BigInteger;

@Data
public class EthTokenDomain {

    private long tokenId;
    private String contractAddress;
    private String tokenName;
    private String tokenSymbol;
    private String tokenOwnerAddress;
    private String tokenTotalSupply;
    private int  tokenDecimals;

    private String symbolImgUrl;

    @JsonFormat(shape= JsonFormat.Shape.STRING)
    private BigInteger tokenBalance = BigInteger.ZERO;
    private String tokenDisplayBalance = "0";

    private long indexedBlockNumber;
    private long blockTimestamp;

    private long tokenHolderCount;
    private long tokenTransferCount;

    private CryptoExchangeRateDomain exchangeRate;

}
