import java.util.HashMap;

/**
 * @description:
 * 推荐注册返佣金的这个功能我想你应该不陌生吧？现在很多App都有这个功能。这个功能中，用户A推荐用户B来注册，用户B又推荐了用户C来注册。我们可
 * 以说，用户C的“最终推荐人”为用户A，用户B的“最终推荐人”也为用户A，而用户A没有“最终推荐人”。
 * 给定一个用户ID，如何查找这个用户的“最终推荐人”？
 *
 * 设key为用户id
 * f(key) = f(value)
 * 终止条件
 * value = ""或者得不到最后的value用户
 *
 * @author: JayChan
 * @date: 2021/6/28
 * @time: 11:25 上午
 * Copyright (C) 2015 xxx
 * All rights reserved
 */
public class practice_3 {

    /**
     * key:用户
     * value：推荐人
     * 通过用户寻找推荐人
     *
     * 其实我觉得这里用链表好一点了啦
     */
    public static HashMap<String,String> data = new HashMap<String, String>();

    /**
     * 初始人id
     */
    public static String p = "N";

    /**
     * 封装数据(注意不要封装循环性数据，否则会导致栈溢出)
     */
    static {
        data.put("A","B");
        data.put("B","C");
        data.put("C","D");
        data.put("D","E");
        data.put("E","F");
        data.put("F","G");
        data.put("G","H");
        data.put("H","I");
        data.put("I","J");
        data.put("J","K");
        data.put("K","L");
        data.put("L","M");
        data.put("M","N");
    }

    public static void main(String[] args) {
        System.out.println(f("A"));
    }

    public static String f(String p){
        String s = data.get(p);
        if (s == null||s == ""){
            return p;
        }
        return f(s);
    }

}
