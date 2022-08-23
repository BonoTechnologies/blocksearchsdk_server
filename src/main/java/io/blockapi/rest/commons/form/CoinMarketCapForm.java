package io.blockapi.rest.commons.form;

import lombok.Data;

@Data
public class CoinMarketCapForm {

    private long cmcId;
    private String slug;
    private String platformType;
    private String platformTokenAddress;
    private int rankSearchStart;
    private int rankSearchEnd;

    private String currencyCd;

}
