package com.ruoyi.grokking.algorithms.string;

public class ReplaceSpace {

    public String replaceSpace(String s) {
        if (s == null) return null;
        return s.replace(" ", "%20");
    }
}
