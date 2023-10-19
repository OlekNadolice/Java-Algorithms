package org.example.tasks.october2023;

import org.example.tasks.october2023.WordAppend;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordAppendTest {

    @Test
    public void appendWord() {
        var data1 = new String[] {"a", "b", "a"};
        var data2 = new String[] {"a", "b", "a", "c", "a", "d", "a"};
        var data3 = new String[] {"a", "", "a"};


       assertEquals("a", WordAppend.appendWord(data1));
        assertEquals("aa", WordAppend.appendWord(data2));
        assertEquals("a", WordAppend.appendWord(data3));
    }
}