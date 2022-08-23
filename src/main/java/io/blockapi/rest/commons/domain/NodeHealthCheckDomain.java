package io.blockapi.rest.commons.domain;

import lombok.Data;

@Data
public class NodeHealthCheckDomain {

    private String nodeId;
    private int platformCryptoId;
    private String platformCrypto;
    private String nodeEndPoint;
    private String nodeAuthToken;
    private long latestBlockHeight;
    private String nodeDownYn;
    private java.sql.Timestamp nodeDownDt;

    private java.sql.Timestamp createDt;
    private java.sql.Timestamp updateDt;

}
