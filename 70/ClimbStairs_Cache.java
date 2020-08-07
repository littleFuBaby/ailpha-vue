package com.ruoyi.grokking.algorithms.number;

public class ClimbStairs_Cache {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int f1 = 1, f2 = 2, f3 = 3;
        int i = 3;
        while (i <= n) {
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
            i++;
        }
        return f3;
    }

}
