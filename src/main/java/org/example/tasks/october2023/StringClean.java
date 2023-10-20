package org.example.tasks.october2023;

public class StringClean {



/*   Given a string, return recursively a "cleaned" string where adjacent chars
 that are the same have been reduced to a single char. So "yyzzza" yields "yza".

    stringClean("yyzzza") → "yza"
    stringClean("abbbcdd") → "abcd"
    stringClean("Hello") → "Helo"
 */



    public static String stringClean(String str) {

        if(str.length() == 1) return  str;

        String firstLetter = String.valueOf(str.charAt(0));
        String secondLetter = String.valueOf(str.charAt(1));

        str = str.substring(1);

        String result = firstLetter.equals(secondLetter) ? "" : firstLetter;


        return result + stringClean(str);

    }

}
