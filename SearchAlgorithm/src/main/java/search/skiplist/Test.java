package search.skiplist;

import java.util.Scanner;

/**
 * @description:
 * @author: JayChan
 * @date: 2021/7/26
 * @time: 11:38 AM
 * All rights reserved
 */
public class Test {
    public static void main(String[] args) {
        SkipList skipList = SkipList.getInstance();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String cmd = sc.next();
            String[] cmds = cmd.split("-");
            String s = null;
            switch (cmds[0]){
                case "add":
                    s = skipList.add(Integer.valueOf(cmds[1]));
                    break;
                case "del":
                    if (cmds.length == 1){
                        s = skipList.del();
                    }else{
                        s = skipList.del(Integer.valueOf(cmds[1]));
                    }
                    break;
                case "get":
                    if (cmds.length == 1){
                        s = skipList.get();
                    }else{
                        s = String.valueOf(skipList.get(Integer.valueOf(cmds[1])));
                    }
                    break;
                default:
                    break;
            }
            System.out.println(s);
        }
    }
}
