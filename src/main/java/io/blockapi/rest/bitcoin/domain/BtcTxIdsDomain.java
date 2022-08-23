package io.blockapi.rest.bitcoin.domain;

import lombok.Data;

import java.util.List;

@Data
public class BtcTxIdsDomain {

    private List<String> txIds;

}
