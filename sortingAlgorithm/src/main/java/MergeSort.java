import common.Data;

/**
 * @description:归并排序是将数据一直一分为二，直到分成每个数据组只有一个元素，再将元素两两合并，直到其中一个数组中没有元素后，将另一个数组中的元素排在后面
 *              给到数组，开始坐标
 *              1、按坐标分解
 *                  坐标为q~p,以（q+p）/2递归分解，直到q>=p
 *              2、按元素合并
 *                  合并q~(q+p)/2和(p+q)/2+1~q
 * @difficulty:
 *              1、合并过程之中，我一直想先分解整个数组，然后一点一点合并，但是我忽略了所有的分解坐标都被压栈了，我拿不到相对应所有的坐标就没办法进行合并，最后是看了别人的思路去吧分解合并放在同一个方法中，这样的话，就由原来的拆盒子，变成了拆完盒子直接计算。
 *              2、合并计算，这个合并计算是我独立写的，总觉得怪怪的，原因是它里面涉及到了太多的变量，也就是说最开始的三个变量在不断的演化为不同的意义，我最后区分了一下，再有就是重复的逻辑脑子有点算不过来了，最后是debug出来的。
 *              注意到：
 *                  1、递归时成员变量的压栈，要么返回出来，要么就不返回，直接计算，但是计算过程如果涉及到了多个递归最好现在脑子里烟花一遍递归过程。、
 *                  2、在一些很基础的循环计算时，注意成员变量的命名，以及演化过程中一些边境值的计算。
 *                  3、在一些边境问题出现时可以使用哨兵的思想对于边境问题进行分化
 * @author: JayChan
 * @date: 2021/7/19
 * @time: 5:16 下午
 * Copyright (C) 2015 xxx
 * All rights reserved
 */
public class MergeSort {

    int[] arr = Data.data;
    int n = arr.length;

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        Data.toString(mergeSort.arr);
        mergeSort.splitArr(mergeSort.arr, 0, mergeSort.n-1);
        Data.toString(mergeSort.arr);
    }

    public void splitArr(int[] arr, int start, int end){
        if (start < end){
            int mid = (start + end)/2;
            //先将左边分解，并合并
            //合并完成，再将右边分解合并
            //之后将两个集合合并
            splitArr(arr, start, mid);
            splitArr(arr, mid+1, end);
            merge(arr, start, end, mid);
        }
    }

    public void merge(int[] arr, int start, int end, int mid){
        //这里三个坐标将数组分解为两个数组，分别是start～mid，mid+1～end
        //tmp里面放置排好序的数据
        int s = start;
        int leftEnd = mid;
        int rightStart = mid+1;
        int[] tmp = new int[end-start+1];
        int tmpIndex = 0;
        while (start <= leftEnd && rightStart <= end) {
            if (arr[start] <= arr[rightStart]) {
                tmp[tmpIndex] = arr[start];
                start++;
            } else {
                tmp[tmpIndex] = arr[rightStart];
                rightStart++;
            }
            tmpIndex++;
        }
        //判断是哪边的数据进去完全了
        if (start > leftEnd){
//            System.out.println("左边的进完全了，移动右边的");
            while(rightStart<=end){
                tmp[tmpIndex++] = arr[rightStart++];
            }
        }else{
//            System.out.println("右边的进完全了，移动左边的");
            while(start<=leftEnd){
                tmp[tmpIndex++] = arr[start++];
            }
        }
        for (int i = 0; i<tmp.length; i++){
            arr[s+i] = tmp[i];
        }

    }

}
