package io.blockapi.rest.commons.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class CryptoExchangeRateDomain {

    @JsonIgnore
    private BigDecimal priceBtc;
    @JsonIgnore private CryptoExchangeRatePriceDomain priceUsd;
    @JsonIgnore private CryptoExchangeRatePriceDomain priceKrw;
    @JsonIgnore private CryptoExchangeRatePriceDomain priceCny;

    private long cmcId;
    private int  rank;
    private long lastUpdated;

    private Map<String, CryptoExchangeRatePriceDomain> priceQuotes = new LinkedHashMap<>();

    public void setPriceQuotes(String currency, CryptoExchangeRatePriceDomain cryptoExchangeRatePriceDomain) {
        priceQuotes.put(currency, cryptoExchangeRatePriceDomain);
    }

}
