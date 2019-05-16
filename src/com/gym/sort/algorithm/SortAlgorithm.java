package com.gym.sort.algorithm;

/**
 * @author yeming.gao
 * @Description: 十大排序算法
 * @date 2019/5/16 10:11
 */
public class SortAlgorithm {

    /**
     * 冒泡排序
     *
     * @param array 需要排序的int数组
     * @return 排序后的数组
     */
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }

    /**
     * 选择排序
     *
     * @param array 需要排序的int数组
     * @return 排序后的数组
     */
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                int tmp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = tmp;
            }


        }
        return array;
    }


}
