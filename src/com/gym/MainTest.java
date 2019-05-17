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
        long startTime = System.nanoTime();
        int[] array = {8, 0, 2, 18, 1, 7, 5, 13, 6, 9, 3, 10, 11, 17, 12, 14, 15, 16, 19, 4, 20};
        System.out.print("冒泡排序结果：" + Arrays.toString(SortAlgorithm.bubbleSort(array)));
        long endTimeBubble = System.nanoTime();
        System.out.println(";耗时：" + (endTimeBubble - startTime));

        array = new int[]{8, 0, 2, 18, 1, 7, 5, 13, 6, 9, 3, 10, 11, 17, 12, 14, 15, 16, 19, 4, 20};
        System.out.print("选择排序结果：" + Arrays.toString(SortAlgorithm.selectionSort(array)));
        long endTimeSelection = System.nanoTime();
        System.out.println(";耗时：" + (endTimeSelection - endTimeBubble));

        array = new int[]{8, 0, 2, 18, 1, 7, 5, 13, 6, 9, 3, 10, 11, 17, 12, 14, 15, 16, 19, 4, 20};
        System.out.print("插入排序结果：" + Arrays.toString(SortAlgorithm.insertionSort(array)));
        long endTimeInsertion = System.nanoTime();
        System.out.println(";耗时：" + (endTimeInsertion - endTimeSelection));

        array = new int[]{8, 0, 2, 18, 1, 7, 5, 13, 6, 9, 3, 10, 11, 17, 12, 14, 15, 16, 19, 4, 20};
        System.out.print("希尔排序结果：" + Arrays.toString(SortAlgorithm.shellSort(array)));
        long endTimeShell = System.nanoTime();
        System.out.println(";耗时：" + (endTimeShell - endTimeInsertion));

        array = new int[]{8, 0, 2, 18, 1, 7, 5, 13, 6, 9, 3, 10, 11, 17, 12, 14, 15, 16, 19, 4, 20};
        System.out.print("归并排序结果：" + Arrays.toString(SortAlgorithm.mergeSort(array)));
        long endTimeMerge = System.nanoTime();
        System.out.println(";耗时：" + (endTimeMerge - endTimeShell));

        array = new int[]{8, 0, 2, 18, 1, 7, 5, 13, 6, 9, 3, 10, 11, 17, 12, 14, 15, 16, 19, 4, 20};
        System.out.print("快速排序结果：" + Arrays.toString(SortAlgorithm.quickSort(array, 0, array.length - 1)));
        long endTimeQuick = System.nanoTime();
        System.out.println(";耗时：" + (endTimeQuick - endTimeMerge));

    }
}
