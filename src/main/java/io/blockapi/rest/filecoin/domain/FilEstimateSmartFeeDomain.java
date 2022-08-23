package io.blockapi.rest.filecoin.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class FilEstimateSmartFeeDomain {

    private long blockHeight;
    private BigDecimal maxFee = BigDecimal.ZERO;
    private BigDecimal baseFee = BigDecimal.ZERO;

    private java.sql.Timestamp createDt;

}
