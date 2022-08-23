package io.blockapi.rest.commons.enums;

import lombok.Getter;

public enum PlatformCryptoTypes {

    BITCOIN             ("bitcoin"),
    ETHEREUM            ("ethereum"),
    RAVENCOIN           ("raven"),
    FILECOIN            ("filecoin"),
    BINANCE_SMART_CHAIN ("bsc")

    ;

    @Getter private final String pathName;

    PlatformCryptoTypes(String pathName) {
        this.pathName = pathName;
    }

}
