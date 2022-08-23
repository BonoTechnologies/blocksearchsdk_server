package io.blockapi.rest.bitcoin.domain;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Data;
import tech.bono.gear.commons.annotation.GearJsonFilter;
import tech.bono.gear.commons.annotation.GearJsonFilters;

import javax.persistence.Entity;

@Data
@Entity(name="BTC_BLOCK")
public class BtcMinerInfoDomain {
    private String minerAddress;

}
