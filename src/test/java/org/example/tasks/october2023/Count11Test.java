package org.example.tasks.october2023;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Count11Test {

    @Test
   public void count11() {

        var testedData1 = "11abc11";
        var testedData2 = "abc11x11x11";
        var testedData3 = "111";

        assertEquals(2, Count11.count11(testedData1));
        assertEquals(3, Count11.count11(testedData2));
        assertEquals(1, Count11.count11(testedData3));
    }
}