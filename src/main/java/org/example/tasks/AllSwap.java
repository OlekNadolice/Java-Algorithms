package org.example.tasks;

public class AllSwap {


/*


We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
 Loop over and then return the given array of non-empty strings as follows: if a string matches
  an earlier string in the array, swap the 2 strings in the array. When a position in the array
   has been swapped, it no longer matches anything. Using a map, this can be solved making just
    one pass over the array. More difficult than it looks.

allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]

*/


    public static String[] allSwap(String[] arr) {
        SwapperValue[] swappers = new SwapperValue[arr.length];

        for (int i = 0; i <= swappers.length - 1; i++) {
            swappers[i] = new SwapperValue(arr[i]);
        }

        for (int j = 0; j <= swappers.length - 2; j++) {
            if (!swappers[j].canSwapp) continue;


            for (int c = j + 1; c <= swappers.length - 1; c++) {
                boolean firstNotEmpty = !swappers[j].value.isEmpty();
                boolean secondNotEmpty = !swappers[c].value.isEmpty();
                String firstLetterA = String.valueOf(swappers[j].getValue().charAt(0));
                String firstLetterB = String.valueOf(swappers[c].getValue().charAt(0));

                if (firstLetterA.equals(firstLetterB) && swappers[c].getCanSwapp() && firstNotEmpty && secondNotEmpty) {
                    swappers[j].blockedSwapping();
                    swappers[c].blockedSwapping();

                    var temp = swappers[j];
                    var cur = swappers[c];

                    swappers[j] = cur;
                    swappers[c] = temp;
                    break;
                }
            }


        }


        String[] values = new String[swappers.length];

        for (int g = 0; g <= values.length - 1; g++) {
            values[g] = swappers[g].value;
        }

        return values;


    }


    private static class SwapperValue {
        private final String value;

        private boolean canSwapp = true;

        public SwapperValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public boolean getCanSwapp() {
            return canSwapp;
        }

        public void blockedSwapping() {
            if (canSwapp) {
                canSwapp = false;
            }
        }


    }

}
