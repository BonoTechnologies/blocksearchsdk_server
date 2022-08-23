package io.blockapi.rest.bitcoin;

import com.google.common.collect.ImmutableMap;
import io.blockapi.rest.bitcoin.domain.*;
import io.blockapi.rest.bitcoin.form.BtcAddressTxForm;
import io.blockapi.rest.bitcoin.domain.BtcPendingTxDomain;
import io.blockapi.rest.commons.domain.PartnerCryptoSubscriptionDomain;
import io.blockapi.rest.commons.domain.WebhookBtcTxDomain;
import io.blockapi.rest.bitcoin.form.BtcAddressPendingTxForm;
import io.blockapi.rest.commons.form.PartnerCryptoSubscriptionForm;
import io.blockapi.rest.commons.form.WebhookBtcTxForm;
import tech.bono.gear.commons.entity.form.CommonForm;
import tech.bono.gear.commons.entity.form.PagingForm;
import tech.bono.gear.web.client.GearRestTemplate;
import tech.bono.gear.web.client.domain.GearRestResponse;
import tech.bono.gear.web.client.domain.GearRestResponseItems;

import java.util.Map;

/**
 * The interface Bitcoin rest client.
 */
public class BitcoinRestClient {

    private final GearRestTemplate gearRestTemplate;

    public BitcoinRestClient(GearRestTemplate gearRestTemplate) {
        this.gearRestTemplate = gearRestTemplate;
    }

    // BtcBlockRestController

    public GearRestResponseItems<BtcBlockDomain> getBtcBlockList(Map<String, String> headers, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/bitcoin/blocks", headers, BtcBlockDomain.class, pagingForm);
    }


    public GearRestResponseItems<BtcBlockDomain> getBtcBlock(Map<String, String> headers, String blockHash) {
        return gearRestTemplate.get("/v1/bitcoin/blocks/{blockHash}", headers, BtcBlockDomain.class, ImmutableMap.of("blockHash", blockHash));
    }


    public GearRestResponseItems<BtcTxDomain> getBtcBlockTxList(Map<String, String> headers, String blockHash, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/bitcoin/blocks/{blockHash}/txs", headers, BtcTxDomain.class, ImmutableMap.of("blockHash", blockHash), pagingForm);
    }


    public GearRestResponseItems<BtcTxDomain> getBtcTxList(Map<String, String> headers, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/bitcoin/txs", headers, BtcTxDomain.class, pagingForm);
    }


    public GearRestResponseItems<BtcTxDomain> getBtcTx(Map<String, String> headers, String txId) {
        return gearRestTemplate.get("/v1/bitcoin/txs/{txId}", headers, BtcTxDomain.class, ImmutableMap.of("txId", txId));
    }

    // BtcAddressRestController


    public GearRestResponseItems<BtcAddressInfoDomain> getBtcAddress(Map<String, String> headers, String address) {
        return gearRestTemplate.get("/v1/bitcoin/address/{address}", headers, BtcAddressInfoDomain.class, ImmutableMap.of("address", address));
    }


    public GearRestResponseItems<BtcTxDomain> getBtcAddressTxList(Map<String, String> headers, String address, BtcAddressTxForm btcAddressTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/bitcoin/address/{address}/txs", headers, BtcTxDomain.class, ImmutableMap.of("address", address), btcAddressTxForm, pagingForm);
    }

    public GearRestResponseItems<BtcTxIdsDomain> getBtcAddressTxIdsList(Map<String, String> headers, String address, BtcAddressTxForm btcAddressTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/bitcoin/address/{address}/tx-ids", headers, BtcTxIdsDomain.class, ImmutableMap.of("address", address), btcAddressTxForm, pagingForm);
    }

    public GearRestResponseItems<BtcTxDomain> getBtcAddressTx(Map<String, String> headers, String address, String txId, CommonForm commonForm) {
        return gearRestTemplate.get("/v1/bitcoin/address/{address}/txs/{txId}", headers, BtcTxDomain.class, ImmutableMap.of("address", address, "txId", txId), commonForm);
    }


    public GearRestResponseItems<BtcAddressTxUnspentDomain> getBtcAddressTxUnspentList(Map<String, String> headers, String address) {
        return gearRestTemplate.get("/v1/bitcoin/address/{address}/utxo", headers, BtcAddressTxUnspentDomain.class, ImmutableMap.of("address", address));
    }

    // BtcRpcRestController

    public GearRestResponseItems<BlockMiningInfoDomain> getBtcMiningInfo(Map<String, String> headers) {
        return gearRestTemplate.get("/v1/bitcoin/mining-info", headers, BlockMiningInfoDomain.class);
    }


    public GearRestResponseItems<AddressValidateDomain> getBtcAddressValidate(Map<String, String> headers, String address) {
        return gearRestTemplate.get("/v1/bitcoin/address/{address}/validate", headers, AddressValidateDomain.class, ImmutableMap.of("address", address));
    }


    public GearRestResponse sendBtcAddressRawTransactions(Map<String, String> headers, String address, SendToAddressDomain sendToAddressDomain) {
        return gearRestTemplate.post("/v1/bitcoin/address/{address}/send-raw-transactions", headers, ImmutableMap.of("address", address), sendToAddressDomain);
    }


    public GearRestResponseItems<Map> getBtcEstimateSmartFee(Map<String, String> headers) {
        return gearRestTemplate.get("/v1/bitcoin/estimate-fee", headers, Map.class);
    }

    public GearRestResponseItems<Map> getBtcEstimateRawFee(Map<String, String> headers) {
        return gearRestTemplate.get("/v1/bitcoin/estimate-raw-fee", headers, Map.class);
    }

    //BtcPendingRestController

    public GearRestResponseItems<BtcTxDomain> getBtcAddressPendingTxList(Map<String, String> headers, String address, BtcAddressTxForm btcAddressTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/bitcoin/address/{address}/pending-txs", headers, BtcTxDomain.class, ImmutableMap.of("address", address), btcAddressTxForm, pagingForm);
    }

    public GearRestResponseItems<BtcTxDomain> getBtcPendingTx(Map<String, String> headers, String txId) {
        return gearRestTemplate.get("/v1/bitcoin/pending-txs/{txId}", headers, BtcTxDomain.class, ImmutableMap.of("txId", txId));
    }

}
