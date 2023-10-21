package org.example.tasks.october2023;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PowerNTest {

    @Test
   public void powerN() {


        assertEquals(3, PowerN.powerN(3,1));
        assertEquals(9, PowerN.powerN(3,2));
        assertEquals(27, PowerN.powerN(3,3));
    }
}