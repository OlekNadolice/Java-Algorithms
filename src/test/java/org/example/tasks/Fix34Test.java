package org.example.tasks;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Fix34Test {

    @Test
   public void fix34() {
        var data1 = new int[] {1,3,1,4};
        var data2 = new int[] {1,3,1,4,4,3,1};
        var data3 = new int[] {3,2,2,4};

        assertArrayEquals(Fix34.Fix34(data1), new int[] {1,3,4,1});
        assertArrayEquals(Fix34.Fix34(data2), new int[] {1,3,4,1,1,3,4});
        assertArrayEquals(Fix34.Fix34(data3), new int[] {3,4,2,2});
    }
}