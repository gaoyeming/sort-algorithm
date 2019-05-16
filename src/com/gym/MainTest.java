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
        int[] array = {34, 3, 9, 6, 4, 2, 11, 22, 1, 0, 1, 9, 4, 12, 12,34, 103, 9, 6, 4, 0, 11, 22, 1, 0, 1, 9, 4, 12, 12};
        System.out.print("冒泡排序结果：" + Arrays.toString(SortAlgorithm.bubbleSort(array)));
        long endTimeBubble = System.nanoTime();
        System.out.println(";耗时："+(endTimeBubble-startTime));

        array = new int[]{34, 3, 9, 6, 4, 2, 11, 22, 1, 0, 1, 9, 4, 12, 12, 34, 103, 9, 6, 4, 0, 11, 22, 1, 0, 1, 9, 4, 12, 12};
        System.out.print("选择排序结果：" + Arrays.toString(SortAlgorithm.selectionSort(array)));
        long endTimeSelection = System.nanoTime();
        System.out.println(";耗时："+(endTimeSelection-endTimeBubble));

        array = new int[]{34, 3, 9, 6, 4, 2, 11, 22, 1, 0, 1, 9, 4, 12, 12, 34, 103, 9, 6, 4, 0, 11, 22, 1, 0, 1, 9, 4, 12, 12};
        System.out.print("插入排序结果：" + Arrays.toString(SortAlgorithm.insertionSort(array)));
        long endTimeInsertion = System.nanoTime();
        System.out.println(";耗时："+(endTimeInsertion-endTimeSelection));

        array = new int[]{34, 3, 9, 6, 4, 2, 11, 22, 1, 0, 1, 9, 4, 12, 12, 34, 103, 9, 6, 4, 0, 11, 22, 1, 0, 1, 9, 4, 12, 12};
        System.out.print("希尔排序结果：" + Arrays.toString(SortAlgorithm.shellSort(array)));
        long endTimeShell = System.nanoTime();
        System.out.println(";耗时："+(endTimeShell-endTimeInsertion));

        array = new int[]{34, 3, 9, 6, 4, 2, 11, 22, 1, 0, 1, 9, 4, 12, 12, 34, 103, 9, 6, 4, 0, 11, 22, 1, 0, 1, 9, 4, 12, 12};
        System.out.print("希尔排序结果：" + Arrays.toString(SortAlgorithm.mergeSort(array)));
        long endTimeMerge = System.nanoTime();
        System.out.println(";耗时："+(endTimeMerge-endTimeShell));

    }
}
