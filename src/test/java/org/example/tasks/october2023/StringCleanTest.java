package org.example.tasks.october2023;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCleanTest {

    @Test
   public void stringClean() {
        var expectedData1 = "yza";
        var expectedData2 = "abcd";
        var expectedData3 = "Helo";

        assertEquals(expectedData1, StringClean.stringClean("yyzzza"));
        assertEquals(expectedData2, StringClean.stringClean("abbbcdd"));
        assertEquals(expectedData3, StringClean.stringClean("Hello"));
    }
}