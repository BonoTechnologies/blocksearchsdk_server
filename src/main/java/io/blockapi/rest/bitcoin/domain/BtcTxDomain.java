package io.blockapi.rest.bitcoin.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class BtcTxDomain {

    private String txId;
    private String txHash;
    private int txIndex;

    private long blockHeight;
    private String blockHash;
    private long blockTimestamp;

    private int txVersion;
    private int txSize;
    private int txVsize;
    private int txWeight;
    private int txLocktime;
    private int txInputCount;
    private int txOutputCount;

    private BigDecimal txInputVal = BigDecimal.ZERO;
    private String     txInputValDisplayValue = "0";

    private BigDecimal txOutputVal = BigDecimal.ZERO;
    private String     txOutputValDisplayValue = "0";

    private BigDecimal txFees = BigDecimal.ZERO;
    private String     txFeesDisplayValue = "0";

    private List<BtcTxInputDomain> inputs  = new ArrayList<>();
    private List<BtcTxOutputDomain> outputs = new ArrayList<>();

    private BtcAddressTxDomain txByAddress;

    private long blockConfirmation;

}
