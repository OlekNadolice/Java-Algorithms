package org.example.tasks.october2023;

public class CopyEvens {

/*
Given an array of positive ints, return a new array of length "count" containing
 the first even numbers from the original array.
 The original array will contain at least "count" even numbers.

copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]


 */

    public static int[] copyEvens(int[] nums, int count) {
        int[] numerki = new int[count];
        int included = 0;


        for(int a:nums) {
            if(included == count) break;
            if(a % 2 == 0) {
                numerki[included] = a;
                included ++ ;
            }
        }




        return  numerki;

    };



}
