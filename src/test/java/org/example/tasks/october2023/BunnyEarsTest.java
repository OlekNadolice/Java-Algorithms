package org.example.tasks.october2023;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BunnyEarsTest {

    @Test
  public  void bunnyEars() {

        assertEquals(0, BunnyEars.bunnyEars(0));
        assertEquals(2, BunnyEars.bunnyEars(1));
        assertEquals(4, BunnyEars.bunnyEars(2));
    }
}