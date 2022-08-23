package io.blockapi.rest.commons.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CryptoExchangeRatePriceDomain {

    private BigDecimal price;
    private BigDecimal dailyVolume;
    private BigDecimal marketCap;

}
