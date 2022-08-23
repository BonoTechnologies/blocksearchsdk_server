package io.blockapi.rest.filecoin.form;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tech.bono.gear.commons.entity.form.CommonForm;

@Data
public class FilMessageGasFeeForm {

    private String searchStartYmd;
    private String searchEndYmd;

}
