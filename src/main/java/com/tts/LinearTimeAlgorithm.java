package com.tts;

import java.math.BigInteger;

public class LinearTimeAlgorithm {

    public BigInteger sumOfArithmeticSerie_via_add_all(long n) {
        BigInteger sum = BigInteger.valueOf(0);
        for (long i = 1; i <=n; i++){
            sum = sum.add(BigInteger.valueOf(i));
        }
        return sum;
    }
}
