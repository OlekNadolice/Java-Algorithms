package org.example.tasks.october2023;

public class RecursionAllStar {


/*
Given a string, compute recursively a new
string where all the adjacent chars are now separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"



 */

    public static String allStar(String str) {

        if(str.length() == 1) {
            return  str;
        }


        String temp = String.valueOf(str.charAt(0));
        String n = temp + "*";


        return  n  + allStar(str.substring(1));

    }


}
