package com.ruoyi.grokking.algorithms.array;

public class MaxAreaDoubleCircle {

    /**
     * double circle to calculate max area from array
     * @param height
     * @return
     */
    public int maxArea(int[] height) {

        int maxArea = 0;

        // double circle
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                int area = (j - i) * (height[j] > height[i] ? height[i] : height[j]);
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }

        return maxArea;
    }

}
