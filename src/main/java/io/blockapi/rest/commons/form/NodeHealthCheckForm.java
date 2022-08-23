package io.blockapi.rest.commons.form;

import lombok.Data;

@Data
public class NodeHealthCheckForm {

    private String nodeId;
    private String nodeEndPoint;
    private long latestBlockHeight;
    private String nodeDownYn;

}
