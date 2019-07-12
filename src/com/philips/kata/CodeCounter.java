package com.philips.kata;

import java.util.Arrays;

public class CodeCounter {
    public long countLines(String code) {
        if (code.isEmpty()) {
            return 0;
        } else {
             String[] lines = code.split("\\n");
             return Arrays.stream(lines).map(String::trim).filter(l -> !l.isEmpty()).filter(l -> !l.startsWith("//")).count();
        }
    }
}
