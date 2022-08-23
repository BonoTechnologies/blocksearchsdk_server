package io.blockapi.rest;

import io.blockapi.rest.bitcoin.BitcoinRestClient;
import io.blockapi.rest.bsc.BscRestClient;
import io.blockapi.rest.commons.CommonsRestClient;
import io.blockapi.rest.commons.SubscriptionRestClient;
import io.blockapi.rest.ethereum.EthereumRestClient;
import io.blockapi.rest.filecoin.FilecoinRestClient;
import io.blockapi.rest.raven.RavenRestClient;
import tech.bono.gear.web.client.GearRestTemplate;

public class BlockSearchRestClient {

    private final CommonsRestClient commonsRestClient;
    private final SubscriptionRestClient subscriptionRestClient;

    private final BitcoinRestClient  bitcoinRestClient;
    private final RavenRestClient    ravenRestClient;

    private final EthereumRestClient ethereumRestClient;
    private final BscRestClient bscRestClient;


    private final FilecoinRestClient filecoinRestClient;

    public BlockSearchRestClient(GearRestTemplate gearRestTemplate) {

        this.commonsRestClient = new CommonsRestClient(gearRestTemplate);
        this.subscriptionRestClient = new SubscriptionRestClient(gearRestTemplate);

        this.bitcoinRestClient  = new BitcoinRestClient(gearRestTemplate);
        this.ravenRestClient    = new RavenRestClient(gearRestTemplate);

        this.ethereumRestClient = new EthereumRestClient(gearRestTemplate);
        this.bscRestClient = new BscRestClient(gearRestTemplate);

        this.filecoinRestClient = new FilecoinRestClient(gearRestTemplate);
    }

    public CommonsRestClient commons(){
        return commonsRestClient;
    }

    public SubscriptionRestClient subscription(){
        return subscriptionRestClient;
    }

    public BitcoinRestClient bitcoin() {
        return bitcoinRestClient;
    }
    public RavenRestClient raven() {
        return ravenRestClient;
    }

    public EthereumRestClient ethereum() {
        return ethereumRestClient;
    }
    public BscRestClient bsc() {
        return bscRestClient;
    }

    public FilecoinRestClient filecoin(){
        return filecoinRestClient;
    }


}
