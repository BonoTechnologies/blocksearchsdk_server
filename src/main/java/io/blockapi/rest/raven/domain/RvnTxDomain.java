package io.blockapi.rest.raven.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class RvnTxDomain {

    private String txId;
    private int txIndex;

    private long blockHeight;
    private String blockHash;
    private long blockTimestamp;

    private int txVersion;
    private int txSize;
    private int txLocktime;
    private int txInputCount;
    private int txOutputCount;

    private BigDecimal txInputVal = BigDecimal.ZERO;
    private String     txInputValDisplayValue = "0";

    private BigDecimal txOutputVal = BigDecimal.ZERO;
    private String     txOutputValDisplayValue = "0";

    private BigDecimal txFees = BigDecimal.ZERO;
    private String     txFeesDisplayValue = "0";

    private List<RvnTxInputDomain> inputs   = new ArrayList<>();
    private List<RvnTxOutputDomain> outputs = new ArrayList<>();

    private RvnAddressTxDomain txByAddress;

    private long blockConfirmation;

}
