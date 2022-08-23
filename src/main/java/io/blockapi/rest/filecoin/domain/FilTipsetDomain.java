package io.blockapi.rest.filecoin.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FilTipsetDomain {

    private long blockHeight;
    private long blockTimestamp;
    private int blockCnt;
    private int messageCnt;

    private List<FilBlockDomain> blocks = new ArrayList<>();

}
