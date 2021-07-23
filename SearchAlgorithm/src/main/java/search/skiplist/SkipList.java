package search.skiplist;

/**
 * @description:
 * @author: JayChan
 * @date: 2021/7/23
 * @time: 4:41 PM
 * Copyright (C) 2015 Meituan
 * All rights reserved
 */
public class SkipList {

    private static volatile SkipList instance = null;

    private int space;

    private Data head;

    public static SkipList getInstance(){
        if (instance == null){
            instance = new SkipList();
            instance.head = new Data(new Data());
        }
        return instance;
    }

    /**
     * 添加元素
     * @param element
     * @return
     */
    public int[] add(int element){

        return null;
    }

    /**
     *
     * @param element
     * @return
     */
    public int[] del(int element){

        return null;
    }

    /**
     *
     * @return
     */
    public int[] del(){

        return null;
    }

    /**
     * 查询数组目前存储情况
     */
    public void check() {

    }

    /**
     * 获取链表中的索引
     * @param index
     * @return
     */
    public int get(int index){

        return 0;
    }

    /**
     * 获取上级索引树
     * @param
     * @return
     */
    private int[] getIndexArr(){

        return new int[0];
    }

    /**
     *  重构索引
     */
    private void restructureIndex(){

    }

    /**
     * 链表中的元素
     */
    public static class Data{
        private int data;
        private Data nextPoint;

        public Data() {
        }

        public Data(Data nextPoint) {
            this.nextPoint = nextPoint;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Data getNextPoint() {
            return nextPoint;
        }

        public void setNextPoint(Data nextPoint) {
            this.nextPoint = nextPoint;
        }
    }
}
