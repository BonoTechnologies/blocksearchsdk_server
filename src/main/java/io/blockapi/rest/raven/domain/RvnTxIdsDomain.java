package io.blockapi.rest.raven.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class RvnTxIdsDomain {

    private List<String> txIds;

}
