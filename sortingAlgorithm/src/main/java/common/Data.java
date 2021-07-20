package common;

/**
 * @description: 用于放置排序用的数据
 * @author: JayChan
 * @date: 2021/6/30
 * @time: 5:18 下午
 * Copyright (C) 2015 xxx
 * All rights reserved
 */
public class Data {

    public static int[] data = {2,1,7,9,3,4,6,5,8,14,10,13,12,11,15};

    public static void toString(int[] data){
        for(int i : data){
            System.out.print(i+",");
        }
        System.out.println("");
    }

    public static int[] exchangeEle(int[] arr, int index_1, int index_2){
        if (index_1 == index_2){
            return arr;
        }
        int[] result = arr;
        int tmp = result[index_1];
        result[index_1] = arr[index_2];
        result[index_2] = tmp;

        return result;
    }

}
