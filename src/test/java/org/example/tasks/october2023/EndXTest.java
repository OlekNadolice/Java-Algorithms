package org.example.tasks.october2023;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EndXTest {

    @Test
   public void endX() {

        var expectedData1 = "rexx";
        var expectedData2 = "hixxxx";
        var expectedData3 = "hihixxx";

        assertEquals(expectedData1, EndX.endX("xxre"));
        assertEquals(expectedData2, EndX.endX("xxhixx"));
        assertEquals(expectedData3, EndX.endX("xhixhix"));
    }
}