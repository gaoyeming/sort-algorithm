package com.gym;

import com.gym.sort.algorithm.SortAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yeming.gao
 * @Description: 十大算法测试
 * @date 2019/5/16 10:27
 */
public class MainTest {

    public static void main(String[] args) {
        List<List<Integer>> arrayList = new ArrayList<>(5);
        for(int i=0;i<5;i++){
            arrayList.add(new ArrayList<>());
        }

        arrayList.get(1).add(1);


        long startTime = System.nanoTime();
        int[] array = { 8, 0,  2, 18, 1, 7,  5, 13, 25, 6, 9, 3, 10, 29, 21, 11, 17, 23, 12, 14, 15, 16, 19, 4,
                20, 34, 22, 32, 24, 27, 28, 30, 33, 26,  31};
        System.out.print("冒泡排序结果：" + Arrays.toString(SortAlgorithm.bubbleSort(array)));
        long endTimeBubble = System.nanoTime();
        System.out.println(";耗时：" + (endTimeBubble - startTime));

        array = new int[] { 8, 0,  2, 18, 1, 7,  5, 13, 25, 6, 9, 3, 10, 29, 21, 11, 17, 23, 12, 14, 15, 16, 19, 4,
                20, 34, 22, 32, 24, 27, 28, 30, 33, 26,  31};
        System.out.print("选择排序结果：" + Arrays.toString(SortAlgorithm.selectionSort(array)));
        long endTimeSelection = System.nanoTime();
        System.out.println(";耗时：" + (endTimeSelection - endTimeBubble));

        array = new int[] { 8, 0,  2, 18, 1, 7,  5, 13, 25, 6, 9, 3, 10, 29, 21, 11, 17, 23, 12, 14, 15, 16, 19, 4,
                20, 34, 22, 32, 24, 27, 28, 30, 33, 26,  31};
        System.out.print("插入排序结果：" + Arrays.toString(SortAlgorithm.insertionSort(array)));
        long endTimeInsertion = System.nanoTime();
        System.out.println(";耗时：" + (endTimeInsertion - endTimeSelection));

        array = new int[] { 8, 0,  2, 18, 1, 7,  5, 13, 25, 6, 9, 3, 10, 29, 21, 11, 17, 23, 12, 14, 15, 16, 19, 4,
                20, 34, 22, 32, 24, 27, 28, 30, 33, 26,  31};
        System.out.print("希尔排序结果：" + Arrays.toString(SortAlgorithm.shellSort(array)));
        long endTimeShell = System.nanoTime();
        System.out.println(";耗时：" + (endTimeShell - endTimeInsertion));

        array = new int[] { 8, 0,  2, 18, 1, 7,  5, 13, 25, 6, 9, 3, 10, 29, 21, 11, 17, 23, 12, 14, 15, 16, 19, 4,
                20, 34, 22, 32, 24, 27, 28, 30, 33, 26,  31};
        System.out.print("归并排序结果：" + Arrays.toString(SortAlgorithm.mergeSort(array)));
        long endTimeMerge = System.nanoTime();
        System.out.println(";耗时：" + (endTimeMerge - endTimeShell));

        array = new int[] { 8, 0,  2, 18, 1, 7,  5, 13, 25, 6, 9, 3, 10, 29, 21, 11, 17, 23, 12, 14, 15, 16, 19, 4,
                20, 34, 22, 32, 24, 27, 28, 30, 33, 26,  31};
        System.out.print("快速排序结果：" + Arrays.toString(SortAlgorithm.quickSort(array, 0, array.length - 1)));
        long endTimeQuick = System.nanoTime();
        System.out.println(";耗时：" + (endTimeQuick - endTimeMerge));

        array = new int[] { 8, 0,  2, 18, 1, 7,  5, 13, 25, 6, 9, 3, 10, 29, 21, 11, 17, 23, 12, 14, 15, 16, 19, 4,
                20, 34, 22, 32, 24, 27, 28, 30, 33, 26,  31};
        System.out.print("堆 排序结 果：" + Arrays.toString(SortAlgorithm.heapSort(array)));
        long endTimeHeap = System.nanoTime();
        System.out.println(";耗时：" + (endTimeHeap - endTimeQuick));

        array = new int[] { 8, 0,  2, 18, 1, 7,  5, 13, 25, 6, 9, 3, 10, 29, 21, 11, 17, 23, 12, 14, 15, 16, 19, 4,
                20, 34, 22, 32, 24, 27, 28, 30, 33, 26,  31};
        System.out.print("计数排序结果：" + Arrays.toString(SortAlgorithm.countingSort(array)));
        long endTimeCounting = System.nanoTime();
        System.out.println(";耗时：" + (endTimeCounting - endTimeHeap));

        array = new int[] { 8, 0,  2, 18, 1, 7,  5, 13, 25, 6, 9, 3, 10, 29, 21, 11, 17, 23, 12, 14, 15, 16, 19, 4,
                20, 34, 22, 32, 24, 27, 28, 30, 33, 26,  31};
        System.out.print("桶 排序结 果：");
        for(int [] sortedArr:SortAlgorithm.bucketSort(array,5)){
            System.out.print(Arrays.toString(sortedArr));
        }
        long endTimeBucket = System.nanoTime();
        System.out.println(";耗时：" + (endTimeBucket - endTimeCounting));

        array = new int[] { 8, 0,  2, 18, 1, 7,  5, 13, 25, 6, 9, 3, 10, 29, 21, 11, 17, 23, 12, 14, 15, 16, 19, 4,
                20, 34, 22, 32, 24, 27, 28, 30, 33, 26,  31};
        System.out.print("基数排序结果：" + Arrays.toString(SortAlgorithm.radixSort(array)));
        long endTimeRadix = System.nanoTime();
        System.out.println(";耗时：" + (endTimeRadix - endTimeCounting));

    }
}
