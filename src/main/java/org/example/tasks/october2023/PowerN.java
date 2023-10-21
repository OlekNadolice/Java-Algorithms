package org.example.tasks.october2023;

public class PowerN {


/*

Given base and n that are both 1 or more, compute recursively (no loops)
the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
 */


    public static int powerN(int a, int b) {
        if(b == 1) return  a;



        return  a * powerN(a, b - 1);
    }
}
