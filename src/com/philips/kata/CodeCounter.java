package com.philips.kata;

import java.util.Arrays;
import java.util.function.Predicate;

public class CodeCounter {

    private boolean insideMultiLineComment;

    public long countLines(String code) {
        String[] lines = code.split("\\n");
        return Arrays.stream(lines)
                .map(String::trim)
                .filter(l -> !l.isEmpty())
                .filter(l -> !l.startsWith("//"))
                .filter(multiLineComments())
                .count();
    }

    private Predicate<String> multiLineComments() {

        return l -> {
            if (!insideMultiLineComment) {
                insideMultiLineComment = l.startsWith("/*");
            }
            return !insideMultiLineComment;
        };
    }
}
