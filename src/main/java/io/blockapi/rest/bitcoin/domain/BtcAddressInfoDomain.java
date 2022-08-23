package io.blockapi.rest.bitcoin.domain;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class BtcAddressInfoDomain {

    private String     btcAddress;

    private BigDecimal totalReceived = BigDecimal.ZERO;
    private String     totalReceivedDisplayValue = "0";

    private BigDecimal totalSent = BigDecimal.ZERO;
    private String     totalSentDisplayValue = "0";

    private BigDecimal finalBalance = BigDecimal.ZERO;
    private String     finalBalanceDisplayValue = "0";

    private long   txCount;
    private String blockHash;      // –> 지갑 생성,
    private long   blockHeight;   // –> 지갑 생성
    private long   blockTimestamp;

}
