package com.directi.training.dip.exercise;

import java.util.Base64;

public class Base64Encoder {
    public static String encode(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }
}
