package com.youzi.ryanalgorithm.twosum;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Ryan
 * @create 2022-03-05 11:59 下午
 */
public class TwoSum2 {


    public static void main(String[] args) {
        int[] source = new int[]{2, 7, 10, 11};
        int target = 9;
        int[] result = useHash(source, target);
        System.out.println(Arrays.toString(result));

    }

    /**
     * 借助hash结构
     * 首先遍历数组 塞到map中，key是数组元素，value是元素角标
     * 然后遍历数组 判断map中是否包含差值key
     * 整体时间复杂度 O（n）
     * @param source
     * @param target
     * @return
     */
    public static int[] useHash(int[] source, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < source.length; i++) {
            map.put(source[i], i);
        }

        for (int i = 0; i < source.length; i++) {
            int diff = target - source[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                result[0] = i;
                result[1] = map.get(diff);
                break;
            }
        }
        return result;
    }
}
