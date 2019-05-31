# 十大排序算法
1、冒泡排序
2、选择排序
3、插入排序
4、希尔排序
5、归并排序
6、快速排序
7、堆排序
8、计数排序
9、桶排序
10、基数排序

**一、排序算法说明**

1，排序的定义

对一序列对象根据某个关键字进行排序



2、术语说明

***稳定：**如果a原本在b前面，而a=b，排序之后a仍然在b的前面；

***不稳定：**如果a原本在b的前面，而a=b，排序之后a可能会出现在b的前面；

***内排序：**所有排序操作都在内存中完成；

***外排序：**由于数据太大，因此把数据放在磁盘中，而排序通过磁盘和内存的数据传输才能进行；

***时间复杂度：**一个算法执行所耗费的时间。

***空间复杂度：**运行完一个程序所需内存的大小。



3、算法总结

![algorithm_summary](images\algorithm_summary.jpg)

图片名词解释：

*n：数据规模

*k：”桶“的个数

*In-place：占用常数内存，不占用额外内存

*Out-place：占用额外内存



4、算法分类

![algorithm_class](images\algorithm_class.jpg)



5、比较和非比较的区别

常见的快速排序、归并排序、堆排序、冒泡排序等属于比较排序。在排序的最终结果里，元素之间的次序依赖于它们之间的比较。每个数都必须和其他数进行比较，才能确定自己的位置。



在冒泡排序之类的排序中，问题规模为n，又因为需要比较n次，所以平均的时间复杂度为O(n^2)。在归并排序、快速排序之类的排序中，问题规模通过分治法消减为logN次，所以时间复杂度平均为O(nlogn)。比较排序的优势是，适用于各种规模的数据，也不在乎数据的分布，都能进行排序。可以说，比较排序适用于一切需要排序的情况。



计数排序，基数排序，桶排序则属于非比较排序。非比较排序是通过确定每个元素之前，应该有多少个元素来排序。针对数组arr，计算arr[i]之前有多少个元素，则唯一确定了arr[i]在排序后数组中的位置。非比较排序只要确定每个元素之前的已有的元素个数即可，所有一次遍历即可解决。算法时间复杂度O(n).

非比较排序时间复杂度低，但由于非比较排序需要占用空间来确定唯一位置。所以对数据规模和数据分布有一定的要求。

\----------------------------------------------------------------------------------------------------------------------



<font color="red">**1，冒泡排序（Bubble Sort）**</font>

冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把它们交换过来。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢”浮“到数列的顶端。



***1.1、算法描述***

​        *比较相邻的元素。如果第一个比第二个大，就交换他们两个；

​        *对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；

​         *针对所有的元素重复以上的步骤，除了最后一个；

​          *重复以上步骤，直到排序完成



***1.2、动图演示***

![sort_bubble](images\sort_bubble.gif)



***1.3、代码实现***

/**

\* 冒泡排序

*

\* @param arry 需要排序的int数组

\* @return 排序后的数组

*/

public static int[] bubbleSort(int[] arry) {

​    for (int i = 0; i < arry.length; i++) {

​        for (int j = i + 1; j < arry.length; j++) {

​            if (arry[j] < arry[i]) {

​                int tmp = arry[j];

​                arry[j] = arry[i];

​                arry[i] = tmp;

​            }

​        }

​    }

​    return arry;

}



***1.4、算法分析***

最佳情况：T(n)=O(n) 最差情况：T(n)=O(n^2)平均情况：T(n)=O(n^2)





<font color="red">**2、选择排序（Selection Sort）**</font>

表现最稳定的排序算法之一，因为什么数据进去都是O(n^2）的时间复杂度，所以用到它的时候，数据规模越小越好。唯一的好处可能就是不占用额外的内存空间，理论上讲，选择排序可能也是平时排序一般人想到最多的排序方法。

选择排序（Selection-sort）是一种简单直观的排序算法。它的工作原理：首先在未排序列中找到最小或者最大的元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小或者最大元素，然后存放到已排序的序列的末尾。一次类推，直到所有元素均排序完毕。



***2.1、算法描述***

n个记录的直接选择排序可经过n-1趟直接选择排序得到有序的结果。具体算法描述如下：

​      *初始状态，无序区为R[1...n]，有序区为空

​      *第一趟排序（i=1,2,3...n-1）开始时，当前有序区和无序区分别为R[1...i-1]和R[i...n]。该趟排序从当前无序区中选出关键字最小的记录R[k]，将它与无序区的第一个记录R交换，使得R[1...i]和R[i+1...n]分别变为记录个数增加1个的新有序区和记录个数减少一个的新无序区

​       *n-1趟结束，数组有序化了。



***2.2、动态演示***

![sort_selection](images\sort_selection.gif)



***2.3、代码实现***

/**

\* 选择排序

*

\* @param array 需要排序的int数组

\* @return 排序后的数组

*/

public static int[] selectionSort(int[] array) {

​    for (int i = 0; i < array.length; i++) {

​        int minIndex = i;

​        for (int j = i; j < array.length; j++) {

​            if (array[j] < array[minIndex]) {

​                minIndex = j;

​            }

​            int tmp = array[minIndex];

​            array[minIndex] = array[i];

​            array[i] = tmp;

​        }

​    }

​    return array;

}



***2.4、算法分析***

最佳情况：T(n)=O(n^2)最差情况T(n)=O(n^2)平均情况T(n)=O(n^2)





<font color="red">**3、插入排序（Insertion Sort）**</font>

插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。插入排序在实现上，通常采用in-place排序（即只需用到O(1)的额为空间排序），因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。



***3.1、算法描述***

一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：

​       *从第一个元素开始，该元素可以认为已经被排序；

​       *取出下一个元素，在已经排序的元素序列中从后向前扫描；

​       *如果该元素（已排序）大于新元素，将该元素移到下一位置；

​       *重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；

​       *将新元素插入到该位置后；

​       *重复步骤2~5



***3.2、动图演示***

![sort_insertion](images\sort_insertion.gif)



***3.3、代码实现***

/**

\* 插入排序

*

\* @param array 需要排序的int数组

\* @return 排序后的数组

*/

public static int[] insertionSort(int[] array) {

​    for (int i = 1; i < array.length; i++) {

​        int current = array[i];

​        int preIndex = i - 1;

​        while (preIndex >= 0 && current < array[preIndex] ) {

​            array[preIndex + 1] = array[preIndex];

​            preIndex--;

​        }

​        array[preIndex + 1] = current;

​    }



​    return array;

}



***3.4、算法分析***

最佳情况：T(n)=O(n)最坏情况T(n)=O(n^2)平均情况T(n)=O(n^2)



<font color="red">**4、希尔排序（Shell Sort）**</font>

希尔排序是希尔（Donald Shell）于1959年提出的一种排序算法。希尔排序也是一种插入排序，它是简单插入排序经过改进之后的一个更高效的版本，也称为缩小增量排序，同时该算法是冲破O(n^2)的第一批算法之一。它与插入排序的不同指出在于，它会优先比较距离较远的元素。希尔排序又叫缩小增量排序。



希尔排序是把记录按下表的一定增量分组，对每组使用直接插入排序算法排序；随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时，整个文件恰被分成一组，算法便终止



***4.1、算法描述***

我们来看下希尔排序的基本步骤，在此我们选择增量gap=length/2，缩小增量继续以gap = gap/2的方式，这种增量选择我们可以用一个序列来表示，{n/2,(n/2)/2......1}，称为增量序列。希尔排序的增量序列的选择与证明是个数学难题，我们选择的这个增量序列是比较常用的，也是希尔建议的增量，称为希尔增量，但起始这个增量序列不是最优的。此处我们做示例使用希尔增量。

先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，具体算法描述：

​    *选择一个增量序列t1, t2, ..., tk,其中ti>tj,tk=1;

​    *按增量序列个数k，对序列进行k趟排序

​    *每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m的子序列，分别对各字表进行直接插入排序。仅增量因子为1时，整个序列作为一个表来处理，表长度即为整个序列的长度



***4.2、过程演示***

![sort_shell](images\sort_shell.jpg)



***4.3、代码实现***

/**

\* 希尔排序

*

\* @param array 需要排序的int数组

\* @return 排序后的数组

*/

public static int[] shellSort(int[] array) {

​    int length = array.length;

​    int gap = length / 2;

​    while (gap > 0) {

​        for (int i = gap; i < length; i++) {

​            int current = array[i];

​            int preIndex = i - gap;

​            while (current < array[preIndex] && preIndex > 0) {

​                array[preIndex + gap] = array[preIndex];

​                preIndex -= gap;

​            }

​            array[preIndex + gap] = current;

​        }

​        gap /= 2;

​    }

​    return array;

}



***4.4、算法分析***

最佳情况：T(n) = O(nlog2 n)  最坏情况：T(n) = O(nlog2 n)  平均情况：T(n) =O(nlog2n)　



<font color="red">**5、归并排序（Merge Sort）**</font>

和选择排序一样，归并排序的性能不受输入数据的影响，但表现比选择排序好的多，因为始终都是O(nlog n)的时间复杂度。代价是需要额外的内存空间。

归并排序是建立在归并操作上的一种有效的排序算法。该算法是采用分治法的一个非常典型的应用。归并排序是一种稳定的排序方法。将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为2-路归并。



***5.1、算法描述***

​    *把长度为n的输入序列分成两个长度为n/2的子序列；

​    *对这两个子序列分别采用归并排序；

​    *将两个排序好的子序列合并成一个最终的排序序列



***5.2、动图演示***

![sort_merge](images\sort_merge.gif)



***5.4、算法分析***

最佳情况：T(n) = O(n)  最差情况：T(n) = O(nlogn)  平均情况：T(n) = O(nlogn)





<font color="red">**6，快速排序（Quick Sort）**</font>

快速排序的基本思想：通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，则可分别对两部分记录继续进行排序，以达到整个序列有序。



***6.1、算法描述***

快速排序使用分治法来把一个串（list）分为两个子串（sub-list）。具体算法描述如下：

​    *从数列中挑出一个元素，称为“基准”（pivot）;

​    *重新排序数列，所有元素比基准值小的摆放在基准的前面，所有元素比基准值大的摆放在基准的后面（相同的数可以放到任意一边）。在这个区分退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。

​    *递归（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序



***6.2、动图演示***

![sort_quick](images\sort_quick.gif)



***6.3、代码实现***

/**

\* 快速排序

*

\* @param array      需要排序的int数组

\* @param startIndex 开始的索引位置

\* @param endIndex   结束的索引位置

\* @return 排序后的数组

*/

public static int[] quickSort(int[] array, int startIndex, int endIndex) {

​    if (array.length < 1 || startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {

​        return null;

​    }

​    int pivotIndex = partition(array, startIndex, endIndex);

​    if (pivotIndex > startIndex) {

​        quickSort(array, startIndex, pivotIndex - 1);

​    }

​    if (pivotIndex < endIndex) {

​        quickSort(array, pivotIndex + 1, endIndex);

​    }

​    return array;

}



/**

\* 快速排序算法——partition

*

\* @param array      分区的数组

\* @param startIndex 开始的索引位置

\* @param endIndex   结束的索引位置

\* @return 返回分区过后的数组

*/

private static int partition(int[] array, int startIndex, int endIndex) {

​    //随机获取一个基准（需要保证在数组内）

​    int pivotIndex = (int) (startIndex + Math.random() * (endIndex - startIndex + 1));

​    int i = startIndex;

​    while (i <= endIndex) {

​        if (i <= pivotIndex) {

​            if (array[i] > array[pivotIndex]) {

​                swap(array, i, pivotIndex);

​                pivotIndex = i;

​            }

​        } else {

​            if (array[i] < array[pivotIndex]) {

​                swap(array, i, pivotIndex);

​                int tmp = pivotIndex;

​                pivotIndex = i;

​                i = tmp;

​            }

​        }

​        i++;

​    }



​    return pivotIndex;

}



/**

\* 交换数组内两个元素

*

\* @param array 源元素数组

\* @param i     交换位置i

\* @param j     交换位置j

*/

private static void swap(int[] array, int i, int j) {

​    int temp = array[i];

​    array[i] = array[j];

​    array[j] = temp;

}



***6.4、算法分析***

最佳情况：T(n) = O(nlogn)   最差情况：T(n) = O(n2)   平均情况：T(n) = O(nlogn)　





<font color="red">**7、堆排序（Heap Sort）**</font>

首先了解二叉树：![binary_tree](images\binary_tree.png)



上图就是一个完全二叉树，其特点在于：

​    1，从作为第一层根开始，除了最后一层之外，第N层的元素个数都必须是2的N-1次方；第一层一个，第二层两个，第三层四个，以此类推

​    2，而最后一行的元素，都是紧贴在左边，换句话说，每一行的元素都是从最左边开始安放，两个元素之间不能有空闲；具备了这两个特点的树，就是一颗完全二叉树。



**那么，完全二叉树与堆有什么关系呢？**

我们假设有一颗完全二叉树，在满足作为二叉树的基础上，对于任意一个拥有父节点的子节点，其数值均不小于父节点的值；这样层层递推，就是根节点的值最小，这样的数称为**小根堆**



同理，又有一颗完全二叉树，对于任意一个子节点来说，均不大于其父节点的值，如此递推，就是根节点的值是最大的，这样的数称为大跟堆。

![binary_tree_distinct](images\binary_tree_distinct.png)

如上图，左边就是大根堆；右边则是小根堆，这里必须要注意一点，只要求子节点与父节点的关系，两个节点的大小关系与其左右位置没有任何关系。

**备注：**一般升序采用大顶堆，降序采用小顶堆



堆排序是指利用这种数据结构所设计得一种排序算法。堆积是一个近似完全二叉树得结构，并同时满足堆积得性质：即子结点得键值或索引总小于（或大于）它得父节点。



***7.1、算法描述***

​    *将初始待排序关键字序列（R1, R2, ... Rn）构建成大顶堆，此堆为初始的无序区；

​    *将堆顶元素R[1]与最后一个元素R[n]交换，此时得到新的无序区（R1, R2, ... Rn-1）和新的有序区（Rn），且满足R[1, 2, ... n-1]<=R[n]；

​    *由于交换后新的堆顶R[1]可能违反堆的性质，因此需要对当前无序区（R1, R2, ... Rn-1）调整为新堆，然后再次将R[1]与无序区最后一个元素交换，得到新的无序区（R1, R2 , ... Rn-2）和新的有序区（Rn-1, Rn）。不断重复此过程直到有序区的元素个数为n-1，则整个排序过程完成



***7.2、简单实例***

给定一个列表array=[4，6，8，5，9]，对其进行堆排序（使用大根堆）。

**步骤一、构造初始堆。将给定的无序序列构造成一个大顶堆**

1、假设给定无序序列结构如下：

![sort_head_explam_01](images\sort_head_explam_01.png)



2、此时我们从最后一个非叶子节点开始（叶节点自然不用调整，第一个非叶子结点arr.length/2-1=5/2-1=1，也就是下面的6结点，从左至右，从上至下进行调整）

**注意：**我们把6和9比较交换之后，必须考量9这个节点对于其子节点会不会产生任何影响，因为其是叶子节点，所以不加考虑；但是，一定要熟练这种思维，写代码的时候就比较容易理解为什么会出现一次非常重要的交换了。

![sort_head_explam_02](images\sort_head_explam_02.png)

3、找到第二个非叶节点4，由于[4,9,8]中9元素最大，4和9交换

在真正代码实现中，这时候4和9交换过后，必须考虑9所在的这个节点位置，因为其上的值变了，必须判断对其的两个子节点是否造成了影响。这么说不合适，实际上就是判断其作为根节点的那棵树，是都还满足大根堆的原则，每一次交换，都必须要循环把子数部分判别清楚。

![sort_head_explam_03](images\sort_head_explam_03.png)

这时交换导致了子根[4,5,6]出现混乱，继续调整，[4,5,6]中6最大，交换4和6.

牢记上面说的规则，每次交换都要把改变了的那个节点所在的树重新判断一下，这里就用上了，4和9交换了，变动了的那棵子树就必须重新调整，一直调整到符合大根堆的规则为止

![sort_head_explam_04](images\sort_head_explam_04.png)

此时，我们就将一个无序序列构造成了一个大顶堆。



**步骤二、将堆顶元素与末尾元素进行交换，使末尾元素最大。然后继续调整堆，再将堆顶元素与末尾元素交换，得到第二大元素，如此反复进行交换、重建、交换。**

1、将对顶元素9和末尾元素4进行交换

这里，必须说明一下，所谓的交换，实际上就是把最大值从树里面拿掉了，剩下参与到排序的树，其实只有总节点的个数减去拿掉节点个数了，所以下图用的是虚线。

![sort_head_explam_05](images\sort_head_explam_05.png)

2、重新调整结构，使其满足大根堆的定义

![sort_head_explam_06](images\sort_head_explam_06.png)

3、再将堆顶元素8与末尾元素5进行交换，得到第二大元素8

![sort_head_explam_07](images\sort_head_explam_07.png)

4、后续过程，继续调整，交换，如此反复进行，最终使得整个序列有序

![sort_head_explam_08](images\sort_head_explam_08.png)

***7.3、动图演示***

![sort_head](images\sort_head.gif)

***7.3、代码实现***

/**

\* 堆排序

*

\* @param array      需要排序的int数组

\* @return 排序后的数组

*/

private static int len;

public static int[] heapSort(int[] array){

​    len = array.length;

​    if (len < 1) {

​        return array;

​    }

​    //1.构建一个最大堆

​    buildMaxHeap(array);

​    //2.循环将堆首位（最大值）与末位交换，然后在重新调整最大堆

​    while (len > 0) {

​        swap(array, 0, len - 1);

​        len--;

​        adjustHeap(array, 0);

​    }

​    return array;

}



/**

\* 建立最大堆

*

\* @param array 需要构建的数组

*/

private static void buildMaxHeap(int[] array) {

​    //从最后一个非叶子节点开始向上构造最大堆

​    for (int i = (len-1) / 2; i >= 0; i--) {

​        adjustHeap(array ,i);

​    }

}



/**

\* 调整使之成为最大堆

*

\* @param array

\* @param i

*/

private static void adjustHeap(int[] array, int i) {

​    int maxIndex = i;

​    //如果有左子树，且左子树大于父节点，则将最大指针指向左子树

​    if (i * 2 < len && array[i * 2] > array[maxIndex]) {

​        maxIndex = i * 2;

​    }

​    //如果有右子树，且右子树大于父节点，则将最大指针指向右子树

​    if (i * 2 + 1 < len && array[i * 2 + 1] > array[maxIndex]) {

​        maxIndex = i * 2 + 1;

​    }

​    //如果父节点不是最大值，则将父节点与最大值交换，并且递归调整与父节点交换的位置。

​    if (maxIndex != i) {

​        swap(array, maxIndex, i);

​        adjustHeap(array, maxIndex);

​    }

}



/**

\* 交换数组内两个元素

*

\* @param array 源元素数组

\* @param i     交换位置i

\* @param j     交换位置j

*/

private static void swap(int[] array, int i, int j) {

​    int temp = array[i];

​    array[i] = array[j];

​    array[j] = temp;

}



***7.4、算法分析***

最佳情况：T(n) = O(nlogn) 最差情况：T(n) = O(nlogn) 平均情况：T(n) = O(nlogn)



<font color="red">**8、计数排序（Counting Sort）**</font>

计数排序的核心在于将输入的数据值转化为键存储再额外的开辟的数组空间中。作为一种线性时间复杂度的排序，计数排序要求输入的数据必须是有确定范围的整数

计数排序是一种稳定的排序算法。计数排序使用一个额外的数组C，其中第i个元素是待排序数组A中的值等于i的元素的个数。然后根据数组C来将A中的元素排到正确的位置。它只能对整数进行排序。



***8.1、算法描述***

​    *找出待排序的数组中最大和最小的元素；

​    *统计数组中每个值为i的元素出现的次数，存入数组C的第i项；

​    *对所有的计数累加（从C中的第一个元素开始，每一项和前一项相加）；

​    *反向填充目标数组：将每个元素i放在新数组的第C(i)项，每放一个元素就将C(i)减去1



***8.2、动图演示***

![sort_counting](images\sort_counting.gif)



***8.3、代码实现***

/**

\* 计数排序（仅支持整数排序）

*

\* @param array 需要排序的int数组

\* @return 排序后的数组

*/

public static int[] countingSort(int[] array) {

​    //首先取出array数组中最大，最小的两个元素

​    int maxElement = array[0];

​    int minElement = array[0];

​    for (int anArray : array) {

​        if (anArray > maxElement) {

​            maxElement = anArray;

​        }

​        if (anArray < minElement) {

​            minElement = anArray;

​        }

​    }

​    //定义一个额外空间数组；长度为最大元素与最小元素之间存在的整数个数

​    int[] extraArray = new int[maxElement - minElement + 1];

​    Arrays.fill(extraArray, 0);

​    for (int anArray : array) {

​        extraArray[anArray - minElement]++;

​    }

​    //反向填充目标数组

​    int index = 0, i = 0;

​    while (index < array.length) {

​        if (extraArray[i] != 0) {

​            array[index] = i + minElement;

​            extraArray[i]--;

​            index++;

​        } else {

​            i++;

​        }

​    }

​    return array;

}



***8.4、算法分析***

当输入的元素是n 个0到k之间的整数时，它的运行时间是 O(n + k)。计数排序不是比较排序，排序的速度快于任何比较排序算法。由于用来计数的数组C的长度取决于待排序数组中数据的范围（等于待排序数组的最大值与最小值的差加上1），这使得计数排序对于数据范围很大的数组，需要大量时间和内存。

最佳情况：T(n) = O(n+k)  最差情况：T(n) = O(n+k)  平均情况：T(n) = O(n+k)



**9、桶排序（Bucket Sort）**

桶排序是计数排序的升级版。它利用了函数的映射关系，高效与否的关键就在于这个映射函数的确定。

桶排序的工作原理：假设输入数据服从均匀分布，将数据分有限数量的桶里，每个桶再分别排序（有可能再使用别的排序算法或是以递归方式继续使用桶排序进行排序）



<font color="red">***9.1、算法描述***</font>

​    *人为设置一个BucketSize，作为每个桶所能放置多少个不同数值（例如当BucketSize==5时，该桶可以存放{1，2，3，4，5}这几种数字，但是容量不限，及可以存放100个3）

​    *遍历输入数据，并且把数据一个一个放到对应的桶里去；

​    *对每个不是空的桶进行排序，可以使用其它排序方法，也可以递归使用桶排序；

​    *从不是空的桶里把排好序的数据拼接起来

注意：如果递归使用桶排序为各个桶排序，则当桶的数量为1时要手动减小BucketSize增加下一循环桶的数量，否则会陷入死循环，导致内存溢出。

***9.2、图片展示***

![sort_bucket](images\sort_bucket.jpg)

***9.3、代码实现***

/**

\* 桶排序

\* 桶排序中：无序数组有个要求,就是成员隶属于固定(有限的)的区间,如范围为0-9

*

\* @param array      需要排序的int数组

\* @param bucketSize 桶的大小

\* @return 排序后的数组

*/

public static ArrayList<int[]> bucketSort(int[] array, int bucketSize) {

​    //首先取出array数组中最大，最小的两个元素

​    int maxElement = array[0];

​    int minElement = array[0];

​    for (int anArray : array) {

​        if (anArray > maxElement) {

​            maxElement = anArray;

​        }

​        if (anArray < minElement) {

​            minElement = anArray;

​        }

​    }

​    //计算出桶的数量

​    int bucketCount = (maxElement - minElement) / bucketSize + 1;

​    //定义桶

​    List<List<Integer>> buckets = new ArrayList<>(bucketCount);

​    for (int i = 0; i < bucketCount; i++) {

​        buckets.add(new ArrayList<>());

​    }

​    //装载桶

​    for (int anArray : array) {

​        //根据值计算出所在的桶索引

​        int bucketIndex = anArray / bucketSize;

​        buckets.get(bucketIndex).add(anArray);

​    }

​    //对每个桶利用快排（其他方式排序也是可以的）进行排序

​    ArrayList<int[]> sortedList = new ArrayList<>(bucketCount);

​    for (List<Integer> bucket : buckets) {

​        int[] bucketArray = new int[bucket.size()];

​        for (int i = 0; i < bucket.size(); i++) {

​            bucketArray[i] = bucket.get(i);

​        }

​        sortedList.add(quickSort(bucketArray, 0, bucketArray.length - 1));

​    }



​    return sortedList;

}

***9.4、算法分析***

桶排序最好情况下使用线性时间O(n)，桶排序的时间复杂度，取决与对各个桶之间数据进行排序的时间复杂度，因为其它部分的时间复杂度都为O(n)。很显然，桶划分的越小，各个桶之间的数据越少，排序所用的时间也会越少。但相应的空间消耗就会增大。 

最佳情况：T(n) = O(n+k)   最差情况：T(n) = O(n+k)   平均情况：T(n) = O(n2)　



**10、基数排序（Radix Sort）**

基数排序也是非比较排序算法，对每一位进行排序，从最低位开始排序，复杂度为O(kn)，为数组长度，k为数组中得数得最大位数；



基数排序是按照低位优先排序，然后收集；再按照高位排序，然后再收集；依次类推，直到最高位。有时候有些属性是优先级顺序的，先按低优先级排序，再按高优先级排序。最后的次序就是高优先级高的在前，高优先级相同的低优先级高的在前。基数排序基于分别排序，分别收集，所以是稳定的。



<font color="red">***10.1、算法描述***</font>

​    *取得数组中的最大数，并取得位数；

​    *arr为原始数组，从最低位开始取每个位组成radix数组；

​    *对radix进行计数排序（利用计数排序使用于小范围数的特点）

***10.2、动图展示***

![sort_radix](images\sort_radix.gif)



***10.3、代码实现***

/**

\* 基数排序

*

\* @param array      需要排序的int数组

\* @return 排序后的数组

*/

public static int[] radixSort(int[] array) {

​    //先获取最大数

​    int maxElement = array[0];

​    for (int anArray : array) {

​        if (anArray > maxElement) {

​            maxElement = anArray;

​        }

​    }

​    //计算其对应的位数

​    int maxDigit = 0;

​    while (maxElement != 0) {

​        maxElement /= 10;

​        maxDigit++;

​    }

​    //定义长度为10的桶radix

​    List<List<Integer>> radixList = new ArrayList<>(10);

​    for (int i = 0; i < 10; i++) {

​        radixList.add(new ArrayList<>());

​    }

​    //从最低位开始取每个位组成radix数组；

​    int mod = 10, div = 1;

​    for(int i=0;i<maxDigit;i++){

​        for(int anArray : array){

​            int num = (anArray % mod) / div;

​            radixList.get(num).add(anArray);

​        }



​        int index = 0;

​        for (int j = 0; j < radixList.size(); j++) {

​            for (int k = 0; k < radixList.get(j).size(); k++) {

​                array[index++] = radixList.get(j).get(k);

​            }

​            radixList.get(j).clear();

​        }

​        mod *= 10; div *= 10;

​    }



​    return array;

}



***10.4、算法分析***

最佳情况：T(n) = O(n * k)   最差情况：T(n) = O(n * k)   平均情况：T(n) = O(n * k)

基数排序有两种方法：

MSD 从高位开始进行排序 LSD 从低位开始进行排序 

**基数排序 vs 计数排序 vs 桶排序**

这三种排序算法都利用了桶的概念，但对桶的使用方法上有明显差异：

- 基数排序：根据键值的每位数字来分配桶
- 计数排序：每个桶只存储单一键值
- 桶排序：每个桶存储一定范围的数值