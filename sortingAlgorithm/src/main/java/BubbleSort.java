import common.Data;

/**
 * @description:冒泡排序，每一次都将获取剩余数据里的最大的数，就好像是大数是大泡泡一样，越大的泡泡，越早浮出水面
 *              冒泡是一个原地排序算法，稳定算法，其空间复杂度为o1，最好情况的时间复杂度一次搞定为On，最坏情况为O(n^2)
 * @author: JayChan
 * @date: 2021/6/30
 * @time: 6:54 下午
 * Copyright (C) 2015 xxx
 * All rights reserved
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = Data.data;
        Data.toString(arr);
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int p = 0; p < arr.length-i-1; p++) {
                if (arr[p] > arr[p + 1]) {
                    Data.exchangeEle(arr, p, p + 1);
                    flag = true;
                }
            }
            if (!flag) break;
        }
        Data.toString(arr);
    }

}
