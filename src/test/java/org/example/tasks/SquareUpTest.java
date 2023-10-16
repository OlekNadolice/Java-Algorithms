package org.example.tasks;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareUpTest {

    @Test
    public void squareUp() {
        var data1 = new int[] {0, 0, 1, 0, 2, 1, 3, 2, 1};
        var data2 = new int[] {0, 1, 2, 1};
        var data3 = new int[] {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1};


       assertArrayEquals(data1, SquareUp.squareUp(3));
        assertArrayEquals(data2, SquareUp.squareUp(2));
        assertArrayEquals(data3, SquareUp.squareUp(4));

    }
}