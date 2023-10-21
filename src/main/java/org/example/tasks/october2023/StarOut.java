package org.example.tasks.october2023;

public class StarOut {

    /*

    Return a version of the given string, where for every star (*)
     in the string the star and the chars immediately to its left
      and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

  starOut("ab*cd") → "ad"
   starOut("ab**cd") → "ad"
   starOut("sm*eilly") → "silly"
     */


    public static String starOut(String str) {
        StringBuilder s = new StringBuilder();

        for (int a = 0; a < str.length(); a++) {
            if (str.charAt(a) != '*' &&
                    (a == 0 || str.charAt(a - 1) != '*') &&
                    (a == str.length() - 1 || str.charAt(a + 1) != '*')) {
                s.append(str.charAt(a));
            }
        }

        return s.toString();


        }





}
