package org.example.tasks.october2023;

public class Count11 {

/*    Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.

    count11("11abc11") → 2
    count11("abc11x11x11") → 3
    count11("111") → 1


 */

    public static String countStringRecursive(String str) {
        if(str.startsWith("1")) {
            str = str.substring(1);
            return countStringRecursive(str);
        }

        return str;

    }




    public static int count11(String str) {
        int count = 0;
      if(str.isEmpty()) return  count;

      if(!str.startsWith("1")) {
         str = str.substring(1);
      }




      if(str.startsWith("11")) {
          str = str.substring(2);
          str = countStringRecursive(str);
          count = 1;
      }





       return count + count11(str);

    }
}
