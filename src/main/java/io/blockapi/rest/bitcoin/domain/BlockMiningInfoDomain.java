package io.blockapi.rest.bitcoin.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BlockMiningInfoDomain {

    private long blocks;
    private long currentblockweight;
    private long currentblocktx;
    private BigDecimal difficulty = BigDecimal.ZERO;
    private BigDecimal networkhashps = BigDecimal.ZERO;
    private long hashespersec;
    private long pooledtx;
    private String chain;
    private String warnings;

}