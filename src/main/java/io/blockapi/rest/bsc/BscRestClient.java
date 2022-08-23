package io.blockapi.rest.bsc;

import com.google.common.collect.ImmutableMap;
import io.blockapi.rest.ethereum.domain.*;
import io.blockapi.rest.ethereum.form.EthAddressForm;
import io.blockapi.rest.ethereum.form.EthAddressTxForm;
import tech.bono.gear.commons.entity.form.CommonForm;
import tech.bono.gear.commons.entity.form.PagingForm;
import tech.bono.gear.web.client.GearRestTemplate;
import tech.bono.gear.web.client.domain.GearRestResponse;
import tech.bono.gear.web.client.domain.GearRestResponseItems;

import java.util.Map;

public class BscRestClient {

    private final GearRestTemplate gearRestTemplate;

    public BscRestClient(GearRestTemplate gearRestTemplate) {
        this.gearRestTemplate = gearRestTemplate;
    }

    public GearRestResponseItems<EthAddressDomain> getBscAddress(Map<String, String> headers, String address, CommonForm commonForm) {
        return gearRestTemplate.get("/v1/bsc/address/{address}", headers, EthAddressDomain.class, ImmutableMap.of("address", address), commonForm);
    }

    public GearRestResponseItems<EthTokenDomain> getBscTokenByAddressList(Map<String, String> headers, String address, CommonForm commonForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/bsc/address/{address}/tokens", headers, EthTokenDomain.class, ImmutableMap.of("address", address), commonForm, pagingForm);
    }

    public GearRestResponseItems<EthTokenDomain> getBscTokenByAddressContract(Map<String, String> headers, String address, String contractAddress, CommonForm commonForm) {
        return gearRestTemplate.get("/v1/bsc/address/{address}/tokens/{contractAddress}", headers, EthTokenDomain.class, ImmutableMap.of("address", address, "contractAddress", contractAddress), commonForm);
    }

    public GearRestResponseItems<EthTokenDomain> getBscTokenList(Map<String, String> headers, CommonForm commonForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/bsc/tokens", headers, EthTokenDomain.class, commonForm, pagingForm);
    }

    public GearRestResponseItems<EthTokenDomain> getBscToken(Map<String, String> headers, String contractAddress, CommonForm commonForm) {
        return gearRestTemplate.get("/v1/bsc/tokens/{contractAddress}", headers, EthTokenDomain.class, ImmutableMap.of("contractAddress", contractAddress), commonForm);
    }

}
