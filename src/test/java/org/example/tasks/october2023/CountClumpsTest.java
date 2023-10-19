package org.example.tasks.october2023;

import org.example.tasks.october2023.CountClumps;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class CountClumpsTest {

    @Test
  public  void countClumps() {

        var data1 = new int[] {1,2,2,3,4,4};
        var data2 = new int[] {1,1,2,1,1};
        var data3 = new int[] {1,1,1,1,1};


        assertEquals(2, CountClumps.countClumps(data1));
        assertEquals(2, CountClumps.countClumps(data2));
        assertEquals(1, CountClumps.countClumps(data3));
    }
}