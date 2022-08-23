package io.blockapi.rest.commons.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CoinMarketCapQuoteDomain {

    private BigDecimal price = BigDecimal.ZERO;
    private BigDecimal dayVolume = BigDecimal.ZERO;
    private BigDecimal marketCap = BigDecimal.ZERO;
    private BigDecimal percentChange1h = BigDecimal.ZERO;
    private BigDecimal percentChange24h = BigDecimal.ZERO;
    private BigDecimal percentChange7d = BigDecimal.ZERO;

}
