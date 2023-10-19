package org.example.tasks.october2023;

import java.util.*;

public class SquareUp {

/*   Given n>=0, create an array length n*n with the following pattern, shown here for n=3 :
 {0, 0, 1,    0, 2, 1,    3, 2, 1}
 (spaces added to show the 3 groups).

    squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
    squareUp(2) → [0, 1, 2, 1]
    squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

    */


    public static int[] squareUp(int n) {
        int[] nums = new int[n * n];
        int totalIndex = 0;


        for (int b = 0; b <= n - 1; b++) {
            int[] temp = new int[n];
            int numberToPopulate = b + 1;
            int currentNum = 1;
            int index = 0;

            while (currentNum <= numberToPopulate) {
                temp[index] = currentNum;
                currentNum ++;
                index ++;
            }

            for(int c = n - 1; c >= 0; c--) {
                nums[totalIndex] = temp[c];
                totalIndex ++;

            }

        }




        return  nums;


    }}






