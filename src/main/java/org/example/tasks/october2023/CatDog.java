package org.example.tasks.october2023;

public class CatDog {

/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */

    public static boolean catDog(String str) {
        int numberOfDogs = 0;
        int numberOfCats = 0;
         boolean isRunning = true;

    while (isRunning) {

        if(str.length() == 1) {
            isRunning = false;
        }


        if(str.startsWith("dog")) {
            numberOfDogs++;
            str = str.substring(1);
        }

       else if (str.startsWith("cat")) {
            numberOfCats++;
            str= str.substring(1);
        } else {
           str = str.substring(1);
        }
    }



        return  numberOfDogs == numberOfCats;

    }

}
