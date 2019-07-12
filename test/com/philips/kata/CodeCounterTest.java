package com.philips.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CodeCounterTest {
    @Test
    public void emptyFileHasZeroLinesOfCode() {
        CodeCounter counter = new CodeCounter();
        assertEquals(0, counter.countLines(""));
    }
}
