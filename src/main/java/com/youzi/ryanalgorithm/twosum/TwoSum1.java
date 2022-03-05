package com.youzi.ryanalgorithm.twosum;

import java.util.Arrays;

/**
 * @author Ryan
 * @create 2022-03-05 11:31 下午
 */
public class TwoSum1 {
    public static void main(String[] args) {
        int[] source = new int[]{2, 7, 10, 11};
        int target = 9;
        int[] result = forceIterator(source, target);
        System.out.println(Arrays.toString(result));

    }

    /**
     * 暴力迭代
     * 双重for循环 时间复杂度O（n²）
     * @param source
     * @param target
     * @return
     */
    public static int[] forceIterator(int[] source, int target) {
        for (int i = 0; i < source.length - 1; i++) {
            for (int j = i + 1; j < source.length; j++) {
                if (source[i] + source[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];

    }
}
