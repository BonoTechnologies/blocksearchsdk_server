package io.blockapi.rest.commons.domain;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CoinMarketCapDomain {

    private long cmcId;
    private String cmcName;
    private int cmcRank;
    private String symbol;
    private String slug;
    private String activeYn;
    private long dateAdded;
    private long lastUpdated;
    private String circulatingSupply;
    private String totalSupply;
    private String maxSupply;
    private int numMarketPairs;

    private String platformType;
    private String platformDesc;
    private String platformCategory;
    private String platformTags;
    private Map<String, List<String>> platformUrlsInfo;
    private String platformTokenAddress;

    private CoinMarketCapQuoteDomain btcQuote;
    private CoinMarketCapQuoteDomain ethQuote;
    private CoinMarketCapQuoteDomain usdQuote;
    private CoinMarketCapQuoteDomain krwQuote;
    private CoinMarketCapQuoteDomain cnyQuote;

    private java.sql.Timestamp createDt;
    private java.sql.Timestamp updateDt;

}

