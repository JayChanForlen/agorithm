package search.binartsearch;

import common.Data;

import java.util.Scanner;

/**
 * @description:二分法基础类型 找到指定值的随意一个位置；
 * 二分查找法的几种变形：
 * 1、查找 第一个等于       给定值的元素
 * 2、查找 最后一个等于     给定值的元素
 * 3、查找 第一个大于等于   给定值的元素
 * 4、查找 最后一个小于等于 给定值的元素
 * @author: JayChan
 * @date: 2021/7/22
 * @time: 3:21 下午
 * Copyright (C) 2015 Meituan
 * All rights reserved
 */
public class BinarySearch {

    public static void main(String[] args) {

        System.out.println("目标数组为");
        Data.check();
        System.out.println("请输入查询的目标数据");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int index = get(target);
        System.out.println("基础查询，坐标为：" + index);
        System.out.println("————————————————————————————");
        int index_1 = get_1(target);
        System.out.println("变形1，坐标为：" + index_1);
        System.out.println("————————————————————————————");
        int index_2 = get_2(target);
        System.out.println("变形2，坐标为：" + index_2);
        System.out.println("————————————————————————————");
        int index_3 = get_3(target);
        System.out.println("变形3，坐标为：" + index_3);
        System.out.println("————————————————————————————");
        int index_4 = get_4(target);
        System.out.println("变形4，坐标为：" + index_4);
    }

    /**
     * 查找 最后一个小于等于 给定值的元素
     *
     * @param target
     * @return
     */
    private static int get_4(int target) {
        int[] arr = Data.data;
        int i = 0;
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            i++;
            mid = low + ((high - low) >> 1);
            if (arr[mid] < target) {
                //往后查
                low = mid + 1;
            } else if (arr[mid] > target) {
                //往前查
                high = mid - 1;
            } else {
                if (mid == 0 || arr[mid + 1] != target) {
                    System.out.println("查询次数" + i);
                    return mid;
                } else {
                    //继续往后查
                    low = mid - 1;
                }
            }
        }

        //最后没有找到返回下一位
        System.out.println("未找到，查询次数" + i);
        return mid;
    }

    /**
     * 查找第一个大于等于给定值的元素
     *
     * @param target
     * @return
     */
    private static int get_3(int target) {
        int[] arr = Data.data;
        int i = 0;
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            i++;
            mid = low + ((high - low) >> 1);
            if (arr[mid] < target) {
                //往后查
                low = mid + 1;
            } else if (arr[mid] > target) {
                //往前查
                high = mid - 1;
            } else {
                if (mid == 0 || arr[mid - 1] != target) {
                    System.out.println("查询次数" + i);
                    return mid;
                } else {
                    //继续往前查
                    high = mid - 1;
                }
            }
        }

        //最后没有找到返回下一位
        System.out.println("未找到，查询次数" + i);
        return mid + 1;
    }

    /**
     * 查找最后一个等于给定值的元素
     *
     * @param target
     * @return
     */
    private static int get_2(int target) {
        int[] arr = Data.data;
        int i = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            i++;
            int mid = low + ((high - low) >> 1);
            if (arr[mid] < target) {
                //往后查
                low = mid + 1;
            } else if (arr[mid] > target) {
                //往前查
                high = mid - 1;
            } else {
                if (mid == 0 || arr[mid + 1] != target) {
                    System.out.println("查询次数" + i);
                    return mid;
                } else {
                    //继续往后查
                    low = mid - 1;
                }
            }
        }
        System.out.println("未找到，查询次数" + i);
        return -1;
    }

    /**
     * 查找第一个等于给定值的元素
     *
     * @param target
     * @return
     */
    private static int get_1(int target) {
        int[] arr = Data.data;
        int i = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            i++;
            int mid = low + ((high - low) >> 1);
            if (arr[mid] < target) {
                //往后查
                low = mid + 1;
            } else if (arr[mid] > target) {
                //往前查
                high = mid - 1;
            } else {
                if (mid == 0 || arr[mid - 1] != target) {
                    System.out.println("查询次数" + i);
                    return mid;
                } else {
                    //继续往前查
                    high = mid - 1;
                }
            }
        }
        System.out.println("未找到，查询次数" + i);
        return -1;
    }

    private static int get(int target) {
        int[] arr = Data.data;
        int i = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            i++;
            int mid = low + ((high - low) >> 1);
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                System.out.println("查询次数" + i);
                return mid;
            }
        }
        System.out.println("未找到，查询次数" + i);
        return -1;
    }

}
