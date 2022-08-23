package io.blockapi.rest.filecoin.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class FilAddressDomain {

    private String address;

    @JsonFormat(shape= JsonFormat.Shape.STRING)
    private BigDecimal balance = BigDecimal.ZERO;
    private String     displayBalance = "0";

}
