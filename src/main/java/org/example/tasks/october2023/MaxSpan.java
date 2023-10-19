package org.example.tasks.october2023;

import java.util.ArrayList;
import java.util.List;

public class MaxSpan {

  /*  Consider the leftmost and righmost appearances of some
   value in an array. We'll say that the "span" is the number of
   elements between the two inclusive. A single value has a span of 1.
    Returns the largest span found in the given array.
     (Efficiency is not a priority.)

    maxSpan([1, 2, 1, 1, 3]) → 4
    maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
    maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6 */


    public static int findMaxSpan(int[] arr) {
        int maxSpan = 1;
        List<Integer> usedNumber = new ArrayList<>();

        if (arr.length == 0) {
            return  0;
        }

        if (arr.length == 1) {
            return 1;
        }

        for (int a = 0; a <= arr.length - 1; a++) {
            if (usedNumber.contains(arr[a])) {
                continue;
            }
            int firstIndex = a;
            int occuringNumber = 0;
            int lastIndex = 0;


            for (int b = 0; b <= arr.length - 1; b++) {
                if (arr[a] == arr[b]) {
                    occuringNumber++;
                    lastIndex = b;
                }
            }
            usedNumber.add(arr[a]);

            if (occuringNumber == 1) {
                continue;
            }

            var result = lastIndex - firstIndex + 1;

            if (result > maxSpan) {
                maxSpan = result;
            }


        }


        return maxSpan;
    }


}
