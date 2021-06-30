/**
 * @description:
 * 周末你带着女朋友去电影院看电影，女朋友问你，咱们现在坐在第几排啊？电影院里面太黑了，看不清，没法数，现在你怎么办？
 * 为了求得第几排，我们只能去问前面的观众，直到问到第一排的观众，他回答为1；
 * 也就是说：
 * f(n) = f(n-1)+1
 * 终止条件为
 * n = 1
 * @author: JayChan
 * @date: 2021/6/28
 * @time: 11:23 上午
 * Copyright (C) 2015 xxx
 * All rights reserved
 */
public class practice_2 {

    private static int n = 8;

    public static void main(String[] args) {
        System.out.println(f(n));
    }

    public static int f(int n){
        if (n == 1) return 1;
        //菜菜啊，你特么再把这个n-1写成n试试
        return f(n-1)+1;
    }



}
