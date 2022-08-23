package io.blockapi.rest.filecoin.domain;

import lombok.Data;

import java.math.BigInteger;

@Data
public class FilMpoolPushDomain {

    private int    version;
    private int    method;
    private String params = "";

    private String from;
    private String to;
    private String value = "0";
    private BigInteger nonce = BigInteger.ZERO;

    private String gasFeeCap;
    private long   gasLimit;
    private String gasPremium;

    // Signature
    private  int   signatureType;
    private String signatureData;

}
