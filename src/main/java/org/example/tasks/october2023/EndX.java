package org.example.tasks.october2023;

public class EndX {


/*

Given a string, compute recursively a new string where all the lowercase 'x'
 chars have been moved to the end of the string.

endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"

 */

    public static String endX(String str) {
        String  firstLetter = "";

        if(str.isEmpty()) {
            return "";
        }


             firstLetter = String.valueOf(str.charAt(0));


            if (firstLetter.equals("x")) {
                return endX(str.substring(1)) + firstLetter;
            }

            return firstLetter + endX(str.substring(1));

        }
}
