package com.philips.kata;

public class CodeCounter {
    public int countLines(String code) {
        if (code.isEmpty()) {
            return 0;
        } else {
            return code.split("\\n").length;
        }
    }
}
