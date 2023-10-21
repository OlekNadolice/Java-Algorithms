package org.example.tasks.october2023;

import org.junit.Test;

import static org.junit.Assert.*;

public class StarOutTest {

    @Test
    public void starOut() {

        assertEquals("ad", StarOut.starOut("ab*cd"));
//        assertEquals("ad", StarOut.starOut("ab**cd"));
//        assertEquals("silly", StarOut.starOut("sm*eilly"));


    }
}