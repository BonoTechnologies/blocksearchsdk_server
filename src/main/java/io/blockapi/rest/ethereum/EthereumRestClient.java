package io.blockapi.rest.ethereum;

import com.google.common.collect.ImmutableMap;
import io.blockapi.rest.ethereum.domain.*;
import io.blockapi.rest.ethereum.form.*;
import tech.bono.gear.commons.entity.form.CommonForm;
import tech.bono.gear.commons.entity.form.PagingForm;
import tech.bono.gear.web.client.GearRestTemplate;
import tech.bono.gear.web.client.domain.GearRestResponse;
import tech.bono.gear.web.client.domain.GearRestResponseItems;

import java.util.Map;

public class EthereumRestClient {

    private final GearRestTemplate gearRestTemplate;

    public EthereumRestClient(GearRestTemplate gearRestTemplate) {
        this.gearRestTemplate = gearRestTemplate;
    }


    public GearRestResponseItems<EthBlockDomain> getEthBlockList(Map<String, String> headers, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/ethereum/blocks", headers, EthBlockDomain.class, pagingForm);
    }


    public GearRestResponseItems<EthBlockDomain> getEthBlock(Map<String, String> headers, long blockNumber) {
        return gearRestTemplate.get("/v1/ethereum/blocks/{blockNumber}", headers, EthBlockDomain.class, ImmutableMap.of("blockNumber", blockNumber));
    }


    public GearRestResponseItems<EthTxDomain> getEthTxByBlockList(Map<String, String> headers, long blockNumber, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/ethereum/blocks/{blockNumber}/txs", headers, EthTxDomain.class, ImmutableMap.of("blockNumber", blockNumber), pagingForm);
    }


    public GearRestResponseItems<EthTxDomain> getEthTxList(Map<String, String> headers, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/ethereum/txs", headers, EthTxDomain.class, pagingForm);
    }


    public GearRestResponseItems<EthTxDomain> getEthTx(Map<String, String> headers, String txHash) {
        return gearRestTemplate.get("/v1/ethereum/txs/{txHash}", headers, EthTxDomain.class, ImmutableMap.of("txHash", txHash));
    }


    public GearRestResponseItems<EthTxReceiptLogDomain> getEthTxReceiptLogList(Map<String, String> headers, String txHash) {
        return gearRestTemplate.get("/v1/ethereum/txs/{txHash}/receipt-logs", headers, EthTxReceiptLogDomain.class, ImmutableMap.of("txHash", txHash));
    }


    public GearRestResponseItems<EthTokenTransferDomain> getEthTokenTransferByTxList(Map<String, String> headers, String txHash, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/ethereum/txs/{txHash}/token-transfers", headers, EthTokenTransferDomain.class, ImmutableMap.of("txHash", txHash), pagingForm);
    }


    public GearRestResponseItems<EthAddressDomain> getEthAddressList(Map<String, String> headers, EthAddressForm ethAddressForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/ethereum/address", headers, EthAddressDomain.class, ethAddressForm, pagingForm);
    }


    public GearRestResponseItems<EthAddressDomain> getEthAddress(Map<String, String> headers, String address, CommonForm commonForm) {
        return gearRestTemplate.get("/v1/ethereum/address/{address}", headers, EthAddressDomain.class, ImmutableMap.of("address", address), commonForm);
    }


    public GearRestResponseItems<EthTxDomain> getEthTxByAddressList(Map<String, String> headers, String address, EthAddressTxForm ethAddressTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/ethereum/address/{address}/txs", headers, EthTxDomain.class, ImmutableMap.of("address", address), ethAddressTxForm, pagingForm);
    }


    public GearRestResponseItems<EthTxDomain> getEthTxByAddress(Map<String, String> headers, String address, String txHash) {
        return gearRestTemplate.get("/v1/ethereum/address/{address}/txs/{txHash}", headers, EthTxDomain.class, ImmutableMap.of("address", address, "txHash", txHash));
    }


    public GearRestResponseItems<EthTxDomain> getEthTxByAddressNonce(Map<String, String> headers, String address, int txNonce) {
        return gearRestTemplate.get("/v1/ethereum/address/{address}/tx-nonce/{txNonce}", headers, EthTxDomain.class, ImmutableMap.of("address", address, "txNonce", txNonce));
    }


    public GearRestResponseItems<EthTokenDomain> getEthTokenByAddressList(Map<String, String> headers, String address, CommonForm commonForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/ethereum/address/{address}/tokens", headers, EthTokenDomain.class, ImmutableMap.of("address", address), commonForm, pagingForm);
    }


    public GearRestResponseItems<EthTokenDomain> getEthTokenByAddressContract(Map<String, String> headers, String address, String contractAddress, CommonForm commonForm) {
        return gearRestTemplate.get("/v1/ethereum/address/{address}/tokens/{contractAddress}", headers, EthTokenDomain.class, ImmutableMap.of("address", address, "contractAddress", contractAddress), commonForm);
    }


    public GearRestResponseItems<EthTokenTransferDomain> getEthTokenTransferByAddressList(Map<String, String> headers, String address, String contractAddress, EthAddressTxForm ethAddressTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/ethereum/address/{address}/tokens/{contractAddress}/transfers", headers, EthTokenTransferDomain.class, ImmutableMap.of("address", address, "contractAddress", contractAddress), ethAddressTxForm, pagingForm);
    }


    public GearRestResponseItems<EthTokenTransferDomain> getEthTransferByAddressList(Map<String, String> headers, String address, EthAddressTxForm ethAddressTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/ethereum/address/{address}/token-transfers", headers, EthTokenTransferDomain.class, ImmutableMap.of("address", address), ethAddressTxForm, pagingForm);
    }


    public GearRestResponseItems<EthTokenDomain> getEthToken(Map<String, String> headers, String contractAddress, CommonForm commonForm) {
        return gearRestTemplate.get("/v1/ethereum/tokens/{contractAddress}", headers, EthTokenDomain.class, ImmutableMap.of("contractAddress", contractAddress), commonForm);
    }


    public GearRestResponseItems<EthTokenHolderDomain> getEthTokenHolderList(Map<String, String> headers, String contractAddress, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/ethereum/tokens/{contractAddress}/holders", headers, EthTokenHolderDomain.class, ImmutableMap.of("contractAddress", contractAddress), pagingForm);
    }

    public GearRestResponseItems<EthTokenTransferDomain> getEthTokenTransferList(Map<String, String> headers, String contractAddress, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/ethereum/tokens/{contractAddress}/transfers", headers, EthTokenTransferDomain.class, ImmutableMap.of("contractAddress", contractAddress), pagingForm);
    }

    public GearRestResponse sendEthAddressRawTransactions(Map<String, String> headers, String address, EthSendRawTxDomain ethSendRawTxDomain) {
        return gearRestTemplate.post("/v1/ethereum/address/{address}/send-raw-transactions", headers, ImmutableMap.of("address", address), ethSendRawTxDomain);
    }

    // EthPendingRestController

    public GearRestResponseItems<EthTxDomain> getEthAddressPendingTxList(Map<String, String> headers, String address, EthAddressTxForm ethAddressTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/ethereum/address/{address}/pending-txs", headers, EthTxDomain.class, ImmutableMap.of("address", address), ethAddressTxForm, pagingForm);
    }

    public GearRestResponseItems<EthTokenTransferDomain> getEthAddressPendingTokenTransferList(Map<String, String> headers, String address, String contractAddress, EthAddressTxForm ethAddressTxForm, PagingForm pagingForm) {
        return gearRestTemplate.get("/v1/ethereum/address/{address}/pending-txs/tokens/{contractAddress}", headers, EthTokenTransferDomain.class, ImmutableMap.of("address", address, "contractAddress", contractAddress), ethAddressTxForm, pagingForm);
    }

    public GearRestResponseItems<EthTxDomain> getEthPendingTx(Map<String, String> headers, String txId) {
        return gearRestTemplate.get("/v1/ethereum/pending-txs/{txId}", headers, EthTxDomain.class, ImmutableMap.of("txId", txId));
    }

    public GearRestResponseItems<EthTxDomain> getEthRbfAvailableTxByAddress(Map<String, String> headers, String address) {
        return gearRestTemplate.get("/v1/ethereum/address/{address}/pending-txs/rbf-available", headers, EthTxDomain.class, ImmutableMap.of("address", address));
    }

    public GearRestResponseItems<EIP1559AdditionalDomain> getEthEstimateDefaultMaxFee(Map<String, String> headers) {
        return gearRestTemplate.get("/v1/ethereum/estimate-default-max-fee", headers, EIP1559AdditionalDomain.class);
    }

}
