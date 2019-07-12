package com.philips.kata;

import java.util.Arrays;

public class CodeCounter {
    public long countLines(String code) {
        if (code.isEmpty()) {
            return 0;
        } else {
             String[] lines = code.split("\\n");
             return Arrays.stream(lines).filter(l -> !l.isEmpty()).count();
        }
    }
}
