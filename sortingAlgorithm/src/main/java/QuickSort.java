import common.Data;

/**
 * @description: 优秀的我竟然一次性就做对了，哈哈哈哈哈哈，这个弄明白他的原理其实还是比较简单的
 * 分解，排序，排完之后，保证左边的比中间值小，右边的比中间值大就可以，再次分解，再次排序。。。。。。
 * @author: JayChan
 * @date: 2021/7/20
 * @time: 3:45 下午
 * Copyright (C) 2015 Meituan
 * All rights reserved
 */
public class QuickSort {

    static int[] arr = Data.data;
    static int n = arr.length;

    public static void main(String[] args) {
        Data.toString(arr);
        quickSort(arr, 0, n-1);
        Data.toString(arr);
    }

    public static void quickSort(int[] arr, int start, int end){
        if (start >= end) return;
        int mid = splitArr(arr, start, end);
        quickSort(arr, start, mid-1);
        quickSort(arr, mid+1, end);
    }

    public static int splitArr(int[] arr, int start, int end){
        //比较值
        int mid = arr[end];
        //i记录了需要交换的那个数字的坐标，i前的坐标放比mid小的数字
        int i = start;
        //j记录了正在比较的坐标
        int j = start;

        while(j < end){
            if (arr[j] < mid){
                Data.exchangeEle(arr, i++, j);
            }
            j++;
        }
        Data.exchangeEle(arr, i, j);

        return i;
    }

}
