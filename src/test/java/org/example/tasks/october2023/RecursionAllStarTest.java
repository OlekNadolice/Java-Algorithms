package org.example.tasks.october2023;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecursionAllStarTest {

    @Test
  public  void allStar() {

        var testData1 = "hello";
        var testData2 = "abc";
        var testData3 = "ab";

        var expectedData1 = "h*e*l*l*o";
        var expectedData2 = "a*b*c";
        var expectedData3 = "a*b";



        assertEquals(expectedData1, RecursionAllStar.allStar(testData1));
        assertEquals(expectedData2, RecursionAllStar.allStar(testData2));
        assertEquals(expectedData3, RecursionAllStar.allStar(testData3));



    }
}