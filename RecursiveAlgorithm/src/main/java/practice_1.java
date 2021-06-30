/**
 * @description:
 * 假如这里有n个台阶，每次你可以跨1个台阶或者2个台阶，请问走这n个台阶有多少种走法？
 * 如果有7个台阶，你可以2，2，2，1这样子上去，也可以1，2，1，1，2这样子上去，总之走法有很多，那如何用编程求得总共有多少种走法呢？
 *
 * 1、可以是一步走，也可以是两步走
 *      如果最后剩下了一个台阶，那么总的走法应该是fn = fn-1；
 *      如果最后剩下了两个台阶，那么总的走法应该是fn = fn-2；
 *      如果最后剩下了三个台阶，其实就可以归结为以上两种情况；
 *
 *      所以最后的上台阶的走法应该满足：
 *      f(n) = f(n-1)+f(n-2)
 *

 * @author: JayChan
 * @date: 2021/6/28
 * @time: 11:18 上午
 * Copyright (C) 2015 xxx
 * All rights reserved
 */
public class practice_1 {

    /**
     * 台阶数量
     */
    private static int n = 3;

    public static void main(String[] args) {
        System.out.println("count is :" + n);
        System.out.println("fun is :" + f(n));
    }

    /**
     *
     * @param n 剩下的台阶
     */
    public static int f(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;
        return f(n-1)+f(n-2);
    }

}
