package org.example.tasks;

import java.util.*;
import java.util.stream.Stream;

public class WordCount {


/*  The classic word-count algorithm: given an array of strings, return
 a Map<String, Integer> with a key for each different string,
 with the value the number of times that string appears in the array.

            wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
    wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
    wordCount(["c", "c", "c", "c"]) → {"c": 4}


 */

    public static Map<String, Integer> wordCount(String[] strings) {
        var map = new HashMap<String, Integer>();
        Set<String> words = new HashSet<>(List.of(strings));

        words.forEach(e -> {
            Integer num = Stream.of(strings).filter(word -> word.equals(e)).toList().size();
            map.put(e, num);
        });
        return map;
    }
}
