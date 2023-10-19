package org.example.tasks.october2023;

public class Fix34 {

    /*

    Return an array that contains exactly the same
    numbers as the given array, but rearranged so that every 3
    is immediately followed by a 4. Do not move the 3's,
     but every other number may move. The array contains
     the same number of 3's and 4's, every 3 has a number
      after it that is not a 3, and a 3 appears
       in the array before any 4.

fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

     */

    public static int[] Fix34(int[] arr1) {

        for (int a = 0; a <= arr1.length - 1; a++) {
            if (arr1[a] == 3 && arr1[a + 1] != 4) {
                for (int b = 0; b <= arr1.length - 1; b++) {
                    if (arr1[b] == 4 && arr1[b - 1] != 3) {
                        var v1 = arr1[a + 1];
                        var v2 = arr1[b];

                        arr1[a + 1] = v2;
                        arr1[b] = v1;
                    }
                }
            }
        }


        return arr1;
    }

};







