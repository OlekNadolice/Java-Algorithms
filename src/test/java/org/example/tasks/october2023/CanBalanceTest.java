package org.example.tasks.october2023;

import org.example.tasks.october2023.CanBalance;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CanBalanceTest {
    @Test
   public void countBalance() {
        var data1 = new int[] {1,1,1,2,1};
        var data2 = new int[] {2,1,1,2,1};
        var data3 = new int[] {10,10};

        assertTrue(CanBalance.countBalance(data1));
        assertFalse(CanBalance.countBalance(data2));
        assertTrue(CanBalance.countBalance(data3));
    }
}