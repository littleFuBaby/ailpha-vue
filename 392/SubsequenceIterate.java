package com.ruoyi.grokking.algorithms.string;

public class SubsequenceIterate {

    /**
     * Subsequence judgement is with iteration
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {

        if (s.length() > t.length()) return false;

        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((index = t.indexOf(t.charAt(i), index) + 1) == -1) {
                return false;
            }
        }

        return true;

    }


}
