package io.blockapi.rest.ethereum.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EIP1559AdditionalDomain {
    private BigDecimal baseFeePerGas;
    private BigDecimal maxFeePerGas;
    private BigDecimal maxPriorityFeePerGas;
}
