import common.Data;

/**
 * @description:选择排序也会将数组分成两个分区，排序分区和未排序分区，和插入的区别是，每一次的比较他都会将最小的移动出来并进行换位
 *              选择排序也是一种原地；但是他并不是稳定排序，因为他需要一个最小的数字来进入排序分区并交换；
 *              最好情况下和最坏情况下都是O(n^2)
 * @author: JayChan
 * @date: 2021/7/19
 * @time: 4:24 下午
 * Copyright (C) 2015 xxx
 * All rights reserved
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = Data.data;
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            int min = arr[i];
            for(int j = i+1; j < arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            Data.exchangeEle(arr, i, minIndex);
        }
        Data.toString(arr);
    }

}
