import common.Data;

/**
 * @description:插入排序的编写过程中，我主要的难点在于从前往后排，找到对应的位置之后我不知道怎样把后面的数据统一向后移动一位
 *              现在的话是从后向前移动一位，好处是在比较过程中就已经把移位做好了。
 *              是原地排序，稳定算法，最好O(n)。最坏O(n^2)
 * @author: JayChan
 * @date: 2021/7/19
 * @time: 3:38 下午
 * Copyright (C) 2015 xxx
 * All rights reserved
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = Data.data;
        for (int i = 1; i < arr.length; ++i) {
            //确定需要排序的那个值
            int value = arr[i];
            //确定排好序的数组最大坐标
            int j = i - 1;
            for (; j >= 0; --j) {
                //从最大开始挨个和value比较
                if (arr[j] > value) {
                    //让比value大的那个数字后移一位，在后移的过程中，不断把需要后移的数字移动，最后会有两位重复的数字，他们相邻，把前一个作为空位
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            //最好让value坐在空位上
            arr[j+1] = value;
        }
        Data.toString(arr);
    }

}
