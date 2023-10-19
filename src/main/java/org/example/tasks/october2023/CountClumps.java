package org.example.tasks.october2023;

public class CountClumps {

/*   Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
 Return the number of clumps in the given array.

   countClumps([1, 2, 2, 3, 4, 4]) → 2
    countClumps([1, 1, 2, 1, 1]) → 2
    countClumps([1, 1, 1, 1, 1]) → 1

*/


    public static int countClumps(int[] arr) {
        int count = 0;
        if (arr.length == 0) return count;


        for (int a = 0; a <= arr.length - 2; ) {
            if (arr[a] != arr[a + 1]) {
                a = a + 1;
            } else {
                count = count + 1;
                int indexToStart = a + 1;
                boolean shouldAssignIndex = true;
                for(int b = a + 1; b <= arr.length - 1 ; b++) {
                    if(arr[a] != arr[b]) {
                        a = b;
                        shouldAssignIndex = false;
                        break;
                    } else {
                        indexToStart = b;
                    }
                }

                if(shouldAssignIndex) {
                    a = indexToStart;
                }



            }

        }


        return count;
    }


}
