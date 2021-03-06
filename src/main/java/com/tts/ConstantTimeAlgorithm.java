package com.tts;

import java.math.BigInteger;

public class ConstantTimeAlgorithm {

    public BigInteger sumOfArithmeticSeries_via_formula(long n) {
        return BigInteger.valueOf(n).multiply(BigInteger.valueOf(n + 1)).divide(BigInteger.valueOf(2));
    }
}
