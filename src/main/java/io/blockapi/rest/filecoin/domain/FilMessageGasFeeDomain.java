package io.blockapi.rest.filecoin.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FilMessageGasFeeDomain {
    private String blockYmd;
    private String methodName;
    private int methodCount;
    private BigDecimal rewardMinerFee = BigDecimal.ZERO;
    private BigDecimal rewardBurnFee = BigDecimal.ZERO;
    private BigDecimal totalFee = BigDecimal.ZERO;
}
