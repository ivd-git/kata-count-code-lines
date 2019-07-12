package com.philips.kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeCounterTest {
    @Test
    public void emptyFileHasZeroLinesOfCode() {
        CodeCounter counter = new CodeCounter();
        assertEquals(0, counter.countLines(""));
    }

    @Test
    public void singleLineOfCode() {
        CodeCounter counter = new CodeCounter();
        assertEquals(1, counter.countLines("private int x = 0;"));
    }

    @Test
    public void twoLineOfCode() {
        CodeCounter counter = new CodeCounter();
        assertEquals(2, counter.countLines(
                "private int x = 0;\n" +
                        "private int y = 1;"));
    }
}
