package com.philips.kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeCounterTest {

    private CodeCounter counter = new CodeCounter();

    @Test
    public void emptyFileHasZeroLinesOfCode() {
        assertLinesOfCode(0, "");
    }

    @Test
    public void singleLineOfCode() {
        assertLinesOfCode(1, "private int x = 0;");
    }

    @Test
    public void twoLinesOfCode() {
        assertLinesOfCode(2,
                "private int x = 0;\n" +
                "private int y = 1;");
    }

    @Test
    public void twoLinesOfCodeEmptyLineIgnored() {
        assertLinesOfCode(2,
                "private int x = 0;\n" +
                        "\n" +
                        "private int y = 1;");
    }

    @Test
    public void singleCommentLineReturnsZero() {
        assertLinesOfCode(0, "//hi");
    }

    @Test
    public void singleCommentLineStartingWithSpacesReturnsZero() {
        assertLinesOfCode(0, "    //hi");
    }

    @Test
    public void multiLineCommentReturnsZero() {
        assertLinesOfCode(0, "/*");
    }

    @Test
    public void multiLineCommentFollowedByCodeReturnsZero() {
        assertLinesOfCode(0, "/*" +
                "private int x = 0;");
    }

    @Test
    public void multiLineCommentFollowedByLineOfCodeReturnsZero() {
        assertLinesOfCode(0, "/*\n" +
                "private int x = 0;");
    }

    private void assertLinesOfCode(int expectedLinesOfCode, String code) {
        assertEquals(expectedLinesOfCode, counter.countLines(code));
    }
}