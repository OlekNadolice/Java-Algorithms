package org.example.tasks.october2023;

import org.example.tasks.october2023.WordCount;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class WordCountTest {

    @Test
  public   void wordCount() {
        var data1 = new HashMap<String ,Integer>();
        var data2 = new HashMap<String ,Integer>();
        var data3 = new HashMap<String ,Integer>();

        var arr1 = new String[] {"a", "b", "a", "c", "b"};
        var arr2 = new String[] {"c", "b", "a"};
        var arr3 = new String[] {"c", "c", "c", "c"};


        data1.put("a", 2);
        data1.put("b", 2);
        data1.put("c", 1);

        data2.put("a", 1);
        data2.put("b", 1);
        data2.put("c", 1);


        data3.put("c",4 );


        assertEquals(data1, WordCount.wordCount(arr1));
        assertEquals(data2, WordCount.wordCount(arr2));
        assertEquals(data3, WordCount.wordCount(arr3));
    }
}