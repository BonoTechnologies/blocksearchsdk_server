package io.blockapi.rest.commons;

import com.google.common.collect.ImmutableMap;
import io.blockapi.rest.commons.domain.CoinMarketCapDomain;
import io.blockapi.rest.commons.form.CoinMarketCapForm;
import tech.bono.gear.commons.entity.form.PagingForm;
import tech.bono.gear.web.client.GearRestTemplate;
import tech.bono.gear.web.client.domain.GearRestResponseItems;

import java.util.Map;

public class CommonsRestClient {

    private final GearRestTemplate gearRestTemplate;

    public CommonsRestClient(GearRestTemplate gearRestTemplate) {
        this.gearRestTemplate = gearRestTemplate;
    }

    public GearRestResponseItems<CoinMarketCapDomain> getCoinMarketcapList(Map<String, String> headers, CoinMarketCapForm coinMarketCapForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/commons/coin-market-cap", headers, CoinMarketCapDomain.class, coinMarketCapForm, pagingForm);
    }

    public GearRestResponseItems<CoinMarketCapDomain> getCoinMarketcap(Map<String, String> headers, String slug) {
        return gearRestTemplate.get("/v1/commons/coin-market-cap/{slug}", headers, CoinMarketCapDomain.class, ImmutableMap.of("slug", slug));
    }

    public GearRestResponseItems<CoinMarketCapDomain> getCoinMarketcapByContractAddress(Map<String, String> headers, String platformType, String contractAddress) {
        return gearRestTemplate.get("/v1/commons/coin-market-cap/platform/{platformType}/contract-address/{contractAddress}", headers, CoinMarketCapDomain.class, ImmutableMap.of("platformType", platformType, "contractAddress", contractAddress));
    }

}
