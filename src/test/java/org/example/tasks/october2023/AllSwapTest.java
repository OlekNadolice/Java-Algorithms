package org.example.tasks.october2023;

import org.example.tasks.october2023.AllSwap;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AllSwapTest {

    @Test
   public void allSwap() {
        var providedData1 = new String[] {"ab", "ac"};
        var providedData2 = new String[] {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        var providedData3 = new String[] {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};

        var expectedData1 = new String[] {"ac", "ab"};
        var expectedData2 = new String[] {"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"};
        var expectedData3 = new String[] {"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"};



        assertArrayEquals(expectedData1, AllSwap.allSwap(providedData1));
        assertArrayEquals(expectedData2, AllSwap.allSwap(providedData2));
        assertArrayEquals(expectedData3, AllSwap.allSwap(providedData3));
    }
}