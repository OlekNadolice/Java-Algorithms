package org.example.tasks;



import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class MaxSpanTest {



    @Test
   public void findMaxSpan() {
        int[] data1 = new int[] {1,2,1,1,3};
        int[] data2 = new int[] {1,4,2,1,4,1,4};
        int[] data3 = new int[] {1,4,2,1,4,4,4};

        assertEquals(4, MaxSpan.findMaxSpan(data1));
        assertEquals(6, MaxSpan.findMaxSpan(data2));
        assertEquals(6, MaxSpan.findMaxSpan(data3));
     }


     @Test
     public  void shouldReturnOneWhenArrayContainsOnlyOneValue() {
        int[] data1 = new int[] {1};
        assertEquals(1, MaxSpan.findMaxSpan(data1));
     }

     @Test
     public  void shouldReturnZeroWhenArrayIsEmpty() {
         int[] data1 = new int[] {};
         assertEquals(0, MaxSpan.findMaxSpan(data1));
     }
}