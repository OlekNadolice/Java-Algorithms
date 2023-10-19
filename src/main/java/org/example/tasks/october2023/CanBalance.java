package org.example.tasks.october2023;


import static java.lang.Math.floor;

public class CanBalance {
 /*   Given a non-empty array,
 return true if there is a place to split the array so
  that the sum of the numbers on one side is equal to
  the sum of the numbers on the other side.

    canBalance([1, 1, 1, 2, 1]) → true
    canBalance([2, 1, 1, 2, 1]) → false
    canBalance([10, 10]) → true

  */


    public static boolean countBalance(int[] arr) {
        int middleIndex = arr.length / 2;
        int leftSum = 0;
        int rightSum = 0;

        for (int a = 0; a <= arr.length - 1; a++) {
            if (a == middleIndex) continue;

            if (a < middleIndex) {
                leftSum += arr[a];
            } else {
                rightSum += arr[a];
            }


        }
        ;

        if (leftSum + arr[middleIndex] == rightSum) {
            return true;
        }

        return rightSum + arr[middleIndex] == leftSum;


    }


}
