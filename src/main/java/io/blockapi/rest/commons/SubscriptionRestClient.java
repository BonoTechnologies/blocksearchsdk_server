package io.blockapi.rest.commons;

import com.google.common.collect.ImmutableMap;
import io.blockapi.rest.commons.domain.PartnerCryptoSubscriptionDomain;
import io.blockapi.rest.commons.domain.WebhookBtcTxDomain;
import io.blockapi.rest.commons.domain.WebhookEthTxDomain;
import io.blockapi.rest.commons.domain.WebhookFilMessageDomain;
import io.blockapi.rest.commons.enums.PlatformCryptoTypes;
import io.blockapi.rest.commons.form.PartnerCryptoSubscriptionForm;
import io.blockapi.rest.commons.form.WebhookBtcTxForm;
import io.blockapi.rest.commons.form.WebhookEthTxForm;
import io.blockapi.rest.commons.form.WebhookFilMessageForm;
import tech.bono.gear.commons.entity.form.PagingForm;
import tech.bono.gear.web.client.GearRestTemplate;
import tech.bono.gear.web.client.domain.GearRestResponse;
import tech.bono.gear.web.client.domain.GearRestResponseItems;

import java.util.Map;

public class SubscriptionRestClient {

    private final GearRestTemplate gearRestTemplate;

    public SubscriptionRestClient(GearRestTemplate gearRestTemplate) {
        this.gearRestTemplate = gearRestTemplate;
    }

    public GearRestResponseItems<WebhookBtcTxDomain> getWebhookBtcTxList(Map<String, String> headers, WebhookBtcTxForm webhookBtcTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/bitcoin/address/webhook-histories", headers, WebhookBtcTxDomain.class, webhookBtcTxForm, pagingForm);
    }

    public GearRestResponseItems<WebhookEthTxDomain> getWebhookEthTxList(Map<String, String> headers, WebhookEthTxForm webhookEthTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/ethereum/address/webhook-histories", headers, WebhookEthTxDomain.class, webhookEthTxForm, pagingForm);
    }

    public GearRestResponseItems<WebhookEthTxDomain> getWebhookBscTxList(Map<String, String> headers, WebhookEthTxForm webhookEthTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/bsc/address/webhook-histories", headers, WebhookEthTxDomain.class, webhookEthTxForm, pagingForm);
    }

    public GearRestResponseItems<WebhookFilMessageDomain> getWebhookFilMessageList(Map<String, String> headers, WebhookFilMessageForm webhookFilMessageForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/filecoin/address/webhook-histories", headers, WebhookFilMessageDomain.class, webhookFilMessageForm, pagingForm);
    }

    // subscribe

    public GearRestResponseItems<PartnerCryptoSubscriptionDomain> getPartnerCryptoSubscriptionList(Map<String, String> headers, PlatformCryptoTypes platformCryptoTypes,PartnerCryptoSubscriptionForm partnerCryptoSubscriptionForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/{platformCryptoType}/address/subscribe", headers, PartnerCryptoSubscriptionDomain.class, ImmutableMap.of("platformCryptoType", platformCryptoTypes.getPathName()), partnerCryptoSubscriptionForm, pagingForm);
    }

    public GearRestResponseItems<PartnerCryptoSubscriptionDomain> getPartnerCryptoSubscription(Map<String, String> headers, PlatformCryptoTypes platformCryptoTypes, String address) {
        return gearRestTemplate.get("/v1/{platformCryptoType}/address/{address}/subscribe", headers, PartnerCryptoSubscriptionDomain.class, ImmutableMap.of("platformCryptoType", platformCryptoTypes.getPathName(), "address", address));
    }

    public GearRestResponse insertPartnerCryptoSubscription(Map<String, String> headers, PlatformCryptoTypes platformCryptoTypes, String address, PartnerCryptoSubscriptionDomain partnerCryptoSubscriptionDomain) {
        return gearRestTemplate.post("/v1/{platformCryptoType}/address/{address}/subscribe", headers, ImmutableMap.of("platformCryptoType", platformCryptoTypes.getPathName(), "address", address), partnerCryptoSubscriptionDomain);
    }

    public GearRestResponse insertPartnerCryptoUnSubscription(Map<String, String> headers, PlatformCryptoTypes platformCryptoTypes, String address, PartnerCryptoSubscriptionDomain partnerCryptoSubscriptionDomain) {
        return gearRestTemplate.post("/v1/{platformCryptoType}/address/{address}/unsubscribe", headers, ImmutableMap.of("platformCryptoType", platformCryptoTypes.getPathName(), "address", address), partnerCryptoSubscriptionDomain);
    }

}
