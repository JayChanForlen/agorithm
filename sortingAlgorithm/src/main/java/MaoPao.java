import common.Data;

/**
 * @description:
 * @author: JayChan
 * @date: 2021/6/30
 * @time: 6:54 下午
 * Copyright (C) 2015 xxx
 * All rights reserved
 */
public class MaoPao {

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
