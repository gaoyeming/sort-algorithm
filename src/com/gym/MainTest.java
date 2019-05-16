package com.gym;

import com.gym.sort.algorithm.SortAlgorithm;

import java.util.Arrays;

/**
 * @author yeming.gao
 * @Description: 十大算法测试
 * @date 2019/5/16 10:27
 */
public class MainTest {

    public static void main(String[] args) {
        int[] array = {3, 9, 6, 4, 2, 11, 34, 22, 1, 0, 1, 9, 4, 12, 12};
        System.out.println("冒泡排序结果：" + Arrays.toString(SortAlgorithm.bubbleSort(array)));
        System.out.println("选择排序结果：" + Arrays.toString(SortAlgorithm.selectionSort(array)));
    }
}
