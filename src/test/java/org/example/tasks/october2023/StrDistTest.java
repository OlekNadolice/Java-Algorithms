package org.example.tasks.october2023;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StrDistTest {

    @Test
   public void strDist() {
        var expectedResult1 = 9;
        var expectedResult2 = 3;
        var expectedResult3 = 9;

        assertEquals(expectedResult1, StrDist.strDist("catcowcat", "cat"));
        assertEquals(expectedResult2, StrDist.strDist("catcowcat", "cow"));
        assertEquals(expectedResult3, StrDist.strDist("cccatcowcatxx", "cat"));
    }
}