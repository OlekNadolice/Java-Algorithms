package org.example.tasks.october2023;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CopyEvensTest {

    @Test
   public void copyEvens() {
        var expectedData1 = new int[] {2,4};
        var expectedData2 = new int[] {2,4,8};
        var expectedData3 = new int[] {6,2,4};

        var testingData1= new int [] {3, 2, 4, 5, 8};
        var testingData2= new int [] {3, 2, 4, 5, 8};
        var testingData3= new int [] {6, 1, 2, 4, 5, 8};


        assertArrayEquals(expectedData1, CopyEvens.copyEvens(testingData1,2 ));
        assertArrayEquals(expectedData2, CopyEvens.copyEvens(testingData2,3 ));
        assertArrayEquals(expectedData3, CopyEvens.copyEvens(testingData3,3 ));
    }
}