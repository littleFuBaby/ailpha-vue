package com.ruoyi.grokking.algorithms.string;

public class ReplaceSpaceAll {

    public String replaceSpace(String s) {
        if (s == null) return null;
        return s.replaceAll(" ", "%20");
    }
}
