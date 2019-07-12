package com.philips.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

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
}
