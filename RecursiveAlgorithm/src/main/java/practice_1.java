/**
 * @description:
 * 假如这里有n个台阶，每次你可以跨1个台阶或者2个台阶，请问走这n个台阶有多少种走法？
 * 如果有7个台阶，你可以2，2，2，1这样子上去，也可以1，2，1，1，2这样子上去，总之走法有很多，那如何用编程求得总共有多少种走法呢？
 *
 * 1、可以是一步走，也可以是两步走
 *      那么第一个台阶就是一步走和两步走的区别
 *      第二个也是
 *      f(1) = 2
 *      f(2) = f(1)*2
 *      f(3) = f(2)*2
 *      f(n) = f(n-1) * 2
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
    private static int n = 5;

    public static void main(String[] args) {
        System.out.println("count is :" + n);
        for (int i = 5; i > 1; i--){

        }
    }

}
