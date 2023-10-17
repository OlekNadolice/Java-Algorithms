package org.example.tasks;

public class WordAppend {



/*  Loop over the given array of strings to build a result string like
 this: when a string appears the 2nd, 4th, 6th, etc. time in the array,
  append the string to the result. Return the empty string if no string
   appears a 2nd time.

    wordAppend(["a", "b", "a"]) → "a"
    wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
    wordAppend(["a", "", "a"]) → "a"


 */


    public static String appendWord(String[] arr) {
        StringBuilder word = new StringBuilder();

        for (int a = 0; a <= arr.length - 2; a++) {
            int amount = 1;
            for (int b = a + 1; b <= arr.length - 1; b++) {
                if(word.toString().contains(arr[a])) {
                    continue;
                }
                if (arr[a].equals(arr[b])) {
                    amount++;
                }
            }

            if (amount > 1) {
                int lettersToAdd = amount / 2;
                word.append(String.valueOf(arr[a]).repeat(lettersToAdd));


            }
        }


        return word.toString();
    }
}
