package io.blockapi.rest.raven;

import com.google.common.collect.ImmutableMap;
import io.blockapi.rest.bitcoin.domain.AddressValidateDomain;
import io.blockapi.rest.bitcoin.domain.BlockMiningInfoDomain;
import io.blockapi.rest.commons.domain.PartnerCryptoSubscriptionDomain;
import io.blockapi.rest.commons.form.PartnerCryptoSubscriptionForm;
import io.blockapi.rest.raven.domain.*;
import io.blockapi.rest.raven.form.RvnAddressAssetTxForm;
import io.blockapi.rest.raven.form.RvnAddressTxForm;
import io.blockapi.rest.raven.form.RvnAssetForm;
import org.springframework.web.bind.annotation.ModelAttribute;
import tech.bono.gear.commons.entity.form.CommonForm;
import tech.bono.gear.commons.entity.form.PagingForm;
import tech.bono.gear.web.client.GearRestTemplate;
import tech.bono.gear.web.client.domain.GearRestResponse;
import tech.bono.gear.web.client.domain.GearRestResponseItems;

import java.util.Map;

public class RavenRestClient {

    private final GearRestTemplate gearRestTemplate;

    public RavenRestClient(GearRestTemplate gearRestTemplate) {
        this.gearRestTemplate = gearRestTemplate;
    }

    public GearRestResponseItems<RvnBlockDomain> getRvnBlockList(Map<String, String> headers, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/raven/blocks", headers, RvnBlockDomain.class, pagingForm);
    }


    public GearRestResponseItems<RvnBlockDomain> getRvnBlock(Map<String, String> headers, String blockHash) {
        return gearRestTemplate.get("/v1/raven/blocks/{blockHash}", headers, RvnBlockDomain.class, ImmutableMap.of("blockHash", blockHash));
    }


    public GearRestResponseItems<RvnTxDomain> getRvnBlockTxList(Map<String, String> headers, String blockHash, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/raven/blocks/{blockHash}/txs", headers, RvnTxDomain.class, ImmutableMap.of("blockHash", blockHash), pagingForm);
    }


    public GearRestResponseItems<RvnTxDomain> getRvnTxList(Map<String, String> headers, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/raven/txs", headers, RvnTxDomain.class, pagingForm);
    }


    public GearRestResponseItems<RvnTxDomain> getRvnTx(Map<String, String> headers, String txId) {
        return gearRestTemplate.get("/v1/raven/txs/{txId}", headers, RvnTxDomain.class, ImmutableMap.of("txId", txId));
    }


    public GearRestResponseItems<RvnAssetDomain> getRvnAssetList(Map<String, String> headers, RvnAssetForm rvnAssetForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/raven/assets", headers, RvnAssetDomain.class, rvnAssetForm, pagingForm);
    }

    public GearRestResponseItems<RvnAssetDomain> getRvnAsset(Map<String, String> headers, String assetNm) {
        return gearRestTemplate.get("/v1/raven/assets", headers, RvnAssetDomain.class, ImmutableMap.of("assetNm", assetNm));
    }

    public GearRestResponseItems<RvnAssetDomain> getRvnAssetRelationList(Map<String, String> headers, RvnAssetForm rvnAssetForm) {
        return gearRestTemplate.get("/v1/raven/assets/relationships", headers, RvnAssetDomain.class, rvnAssetForm);
    }


    public GearRestResponseItems<RvnTxDomain> getRvnAssetByNameTxList(Map<String, String> headers, RvnAddressAssetTxForm rvnAddressAssetTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/raven/assets/txs", headers, RvnTxDomain.class, rvnAddressAssetTxForm, pagingForm);
    }


    public GearRestResponseItems<RvnTxDomain> getRvnAssetTxList(Map<String, String> headers, long assetId, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/raven/assets/{assetId}/txs", headers, RvnTxDomain.class, ImmutableMap.of("assetId", assetId), pagingForm);
    }


    public GearRestResponseItems<RvnAddressInfoDomain> getRvnAddress(Map<String, String> headers, String address) {
        return gearRestTemplate.get("/v1/raven/address/{address}", headers, RvnAddressInfoDomain.class, ImmutableMap.of("address", address));
    }


    public GearRestResponseItems<RvnTxDomain> getRvnAddressTxList(Map<String, String> headers, String address, RvnAddressTxForm RvnAddressTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/raven/address/{address}/txs", headers, RvnTxDomain.class, ImmutableMap.of("address", address), RvnAddressTxForm, pagingForm);
    }

    public GearRestResponseItems<RvnTxIdsDomain> getRvnAddressTxIdsList(Map<String, String> headers, String address, RvnAddressTxForm RvnAddressTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/raven/address/{address}/tx-ids", headers, RvnTxIdsDomain.class, ImmutableMap.of("address", address), RvnAddressTxForm, pagingForm);
    }

    public GearRestResponseItems<RvnTxDomain> getRvnAddressTx(Map<String, String> headers, String address, String txId, CommonForm commonForm) {
        return gearRestTemplate.get("/v1/raven/address/{address}/txs/{txId}", headers, RvnTxDomain.class, ImmutableMap.of("address", address, "txId", txId), commonForm);
    }

    public GearRestResponseItems<RvnAddressTxUnspentDomain> getRvnAddressTxUnspentList(Map<String, String> headers, String address) {
        return gearRestTemplate.get("/v1/raven/address/{address}/utxo", headers, RvnAddressTxUnspentDomain.class, ImmutableMap.of("address", address));
    }


    public GearRestResponseItems<RvnAssetDomain> getRvnAddressAssetList(Map<String, String> headers, String address, RvnAssetForm rvnAssetForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/raven/address/{address}/assets", headers, RvnAssetDomain.class, ImmutableMap.of("address", address), rvnAssetForm, pagingForm);
    }


    public GearRestResponseItems<RvnTxDomain> getRvnAddressAssetTxList(Map<String, String> headers, String address, RvnAddressAssetTxForm rvnAddressAssetTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/raven/address/{address}/assets/txs", headers, RvnTxDomain.class, ImmutableMap.of("address", address), rvnAddressAssetTxForm, pagingForm);
    }


    public GearRestResponseItems<RvnTxDomain> getRvnAddressAssetTx(Map<String, String> headers, String address, String txId, RvnAddressAssetTxForm rvnAddressAssetTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/raven/address/{address}/assets/txs/{txId}", headers, RvnTxDomain.class, ImmutableMap.of("address", address, "txId", txId), rvnAddressAssetTxForm, pagingForm);
    }


    public GearRestResponseItems<BlockMiningInfoDomain> getRvnMiningInfo(Map<String, String> headers) {
        return gearRestTemplate.get("/v1/raven/mining-info", headers, BlockMiningInfoDomain.class);
    }


    public GearRestResponseItems<AddressValidateDomain> getRvnAddressValidate(Map<String, String> headers, String address) {
        return gearRestTemplate.get("/v1/raven/address/{address}/validate", headers, AddressValidateDomain.class, ImmutableMap.of("address", address));
    }


    public GearRestResponse sendRvnAddressRawTransactions(Map<String, String> headers, String address, RvnSendDomain rvnSendDomain) {
        return gearRestTemplate.post("/v1/raven/address/{address}/send-raw-transactions", headers, ImmutableMap.of("address", address), rvnSendDomain);
    }


    public GearRestResponseItems<Map> getRvnEstimateSmartFee(Map<String, String> headers) {
        return gearRestTemplate.get("/v1/raven/estimate-fee", headers, Map.class);
    }

    //RvnPendingRestController

    public GearRestResponseItems<RvnTxDomain> getAddressRvnPendingTxList(Map<String, String> headers, String address, RvnAddressTxForm rvnAddressTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/raven/address/{address}/pending-txs", headers, RvnTxDomain.class, ImmutableMap.of("address", address), rvnAddressTxForm, pagingForm);
    }

    public GearRestResponseItems<RvnTxDomain> getRvnPendingTxDetail(Map<String, String> headers, String address, String txId) {
        return gearRestTemplate.get("/v1/raven/address/{address}/pending-txs/{txId}", headers, RvnTxDomain.class, ImmutableMap.of("address", address, "txId", txId));
    }

    public GearRestResponseItems<RvnTxDomain> getRvnAddressAssetPendingTxList(Map<String, String> headers, String address, RvnAddressAssetTxForm rvnAddressAssetTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/raven/address/{address}/assets/pending-txs", headers, RvnTxDomain.class, ImmutableMap.of("address", address), rvnAddressAssetTxForm, pagingForm);
    }

    public GearRestResponseItems<RvnTxDomain> getRvnAddressAssetPendingTx(Map<String, String> headers, String address, String txId,  RvnAddressAssetTxForm rvnAddressAssetTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/raven/address/{address}/assets/pending-txs/{txId}", headers, RvnTxDomain.class, ImmutableMap.of("address", address, "txId", txId), rvnAddressAssetTxForm, pagingForm);
    }

}
