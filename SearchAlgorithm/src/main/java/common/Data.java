package common;

/**
 * @description:
 * @author: JayChan
 * @date: 2021/7/22
 * @time: 3:25 下午
 * Copyright (C) 2015 Meituan
 * All rights reserved
 */
public class Data {

    public static final int[] data = {1,1,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7,8,8,9,10,11,11,11,14,14,15,16,16,16,16,17,18,18,18,18,19,20,20};

    public static void check(){
        for (int i : data){
            if (i<10) {
                System.out.print("0"+i + "|");
            }else{
                System.out.print(i + "|");
            }
        }
        System.out.println();
        for (int i = 0; i < data.length; i++){
            if (i<10) {
                System.out.print("0"+i + "|");
            }else{
                System.out.print(i + "|");
            }
        }
        System.out.println();
    }
}
