package io.blockapi.rest.filecoin;

import com.google.common.collect.ImmutableMap;
import io.blockapi.rest.commons.domain.NodeHealthCheckDomain;
import io.blockapi.rest.commons.form.NodeHealthCheckForm;
import io.blockapi.rest.filecoin.domain.*;
import io.blockapi.rest.filecoin.form.FilMessageForm;
import io.blockapi.rest.filecoin.form.FilMessageGasFeeForm;
import org.springframework.web.bind.annotation.ModelAttribute;
import tech.bono.gear.commons.entity.form.PagingForm;
import tech.bono.gear.web.client.GearRestTemplate;
import tech.bono.gear.web.client.domain.GearRestResponse;
import tech.bono.gear.web.client.domain.GearRestResponseItems;

import java.util.Map;

public class FilecoinRestClient {

    private final GearRestTemplate gearRestTemplate;

    public FilecoinRestClient(GearRestTemplate gearRestTemplate) {
        this.gearRestTemplate = gearRestTemplate;
    }

    /* FilTipsetRestController */

    public GearRestResponseItems<FilTipsetDomain> getFilTipsetList(Map<String, String> headers, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/filecoin/tipsets", headers, FilTipsetDomain.class, pagingForm);
    }

    public GearRestResponseItems<FilTipsetDomain> getFilTipset(Map<String, String> headers, long blockHeight) {
        return gearRestTemplate.get("/v1/filecoin/tipsets/{blockHeight}", headers, FilTipsetDomain.class, ImmutableMap.of("blockHeight", blockHeight));
    }

    public GearRestResponseItems<FilEstimateSmartFeeDomain> getFilEstimateSmartFee(Map<String, String> headers) {
        return gearRestTemplate.get("/v1/filecoin/estimate-smart-fee", headers, FilEstimateSmartFeeDomain.class);
    }

    public GearRestResponseItems<NodeHealthCheckDomain> getFilNodeHealthCheckList(Map<String, String> headers, NodeHealthCheckForm nodeHealthCheckForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/filecoin/nodes", headers, NodeHealthCheckDomain.class, nodeHealthCheckForm, pagingForm);
    }

    /* FilMessageRestController */
    public GearRestResponseItems<FilMessageDomain> getFilMessage(Map<String, String> headers, String messageId) {
        return gearRestTemplate.get("/v1/filecoin/messages/{messageId}", headers, FilMessageDomain.class, ImmutableMap.of("messageId", messageId));
    }

    /* FilAddressRestController */

    public GearRestResponseItems<FilAddressDomain> getFilAddress(Map<String, String> headers, String address) {
        return gearRestTemplate.get("/v1/filecoin/address/{address}", headers, FilAddressDomain.class, ImmutableMap.of("address", address));
    }

    public GearRestResponseItems<FilMessageDomain> getFilMessageByAddressList(Map<String, String> headers, String address, FilMessageForm filMessageForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/filecoin/address/{address}/messages", headers, FilMessageDomain.class, ImmutableMap.of("address", address), filMessageForm, pagingForm);
    }

    public GearRestResponseItems<FilMessageDomain> getFilMessageByAddress(Map<String, String> headers, String address, String messageId) {
        return gearRestTemplate.get("/v1/filecoin/address/{address}/messages/{messageId}", headers, FilMessageDomain.class, ImmutableMap.of("address", address, "messageId", messageId));
    }

    public GearRestResponseItems<FilMessageDomain> getFilMessageByAddressNonce(Map<String, String> headers, String address, int messageNonce) {
        return gearRestTemplate.get("/v1/filecoin/address/{address}/message-nonce/{messageNonce}", headers, FilMessageDomain.class, ImmutableMap.of("address", address, "messageNonce", messageNonce));
    }

    public GearRestResponseItems<FilMessageDomain> getFilAddressPendingMessageList(Map<String, String> headers, String address, FilMessageForm filMessageForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/filecoin/address/{address}/pending-messages", headers, FilMessageDomain.class, ImmutableMap.of("address", address), filMessageForm, pagingForm);
    }

    public GearRestResponseItems<FilMessageGasFeeDomain> getFilMessageDailyFeeByAddressList(Map<String, String> headers, String address, FilMessageGasFeeForm filMessageGasFeeForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/filecoin/address/{address}/daily-fee", headers, FilMessageGasFeeDomain.class, ImmutableMap.of("address", address), filMessageGasFeeForm, pagingForm);
    }

    /* FilRpcRestController */

    public GearRestResponse sendFilAddressRawTransactions(Map<String, String> headers, String address, FilMpoolPushDomain filMpoolPushDomain) {
        return gearRestTemplate.post("/v1/filecoin/address/{address}/send-raw-transactions", headers, ImmutableMap.of("address", address), filMpoolPushDomain);
    }

}
