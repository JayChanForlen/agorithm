package search.skiplist;

/**
 * @description:
 * @author: JayChan
 * @date: 2021/7/23
 * @time: 4:41 PM
 * Copyright (C) 2015 xxx
 * All rights reserved
 */
public class SkipList {

    private int n = 0;

    private static SkipList instance = null;

    private static final double RADIO = 0.5;

    private Data head;

    private SkipList() {
    }

    public int getSize(){
        return n;
    }

    /**
     * Singleton
     *
     * @return SkipList
     */
    public static SkipList getInstance() {
        if (instance == null) {
            instance = new SkipList();
            instance.head = new Data(Integer.MIN_VALUE, null);
        }
        return instance;
    }

    private void checkInstance() {
        if (instance == null || instance.head == null) {
            throw new RuntimeException("链表未进行初始化");
        }
    }


    /**
     * 查询数组目前存储情况
     * @return linkToString
     */
    public String get() {
        checkInstance();
        StringBuilder res = new StringBuilder();
        Data date = head;
        while (date.getPoint() != null) {
            res.append(date.getPoint()).append("|");
            date = date.getPoint();
        }
        return res.toString();
    }

    /**
     * 通过索引获取链表中的元素
     *
     * @param index
     * @return element
     */
    public int get(int index) {
        checkInstance();
        int n = 0;
        Data data = head.getPoint();
        while (true) {
            if (n == index) {
                return data.getObj();
            } else if (data.getPoint() != null) {
                data = data.getPoint();
            } else {
                return -1;
            }
            n++;
        }
    }

    /**
     * 添加元素
     *
     * @param element
     * @return index
     */
    public String add(int element) {
        checkInstance();
        Data eleDate = new Data(element, null);
        if (head.getPoint() == null) {
            head.setPoint(eleDate);
            n++;
            return get();
        } else {
            Data data = head.getPoint();
            while (data.getObj() <= element) {
                if (data.getPoint() == null) {
                    data.setPoint(eleDate);
                    n++;
                    return get();
                }
                if (data.getPoint().getObj() > element) {
                    eleDate.setPoint(data.getPoint());
                    data.setPoint(eleDate);
                    n++;
                    return get();
                }
                data = data.getPoint();
            }
            throw new RuntimeException("预期之外的错误");
        }
    }

    /**
     * 删除元素
     *
     * @param element
     * @return link
     */
    public String del(int element) {
        checkInstance();
        Data pre = head;
        Data data = head.getPoint();
        while (data.getPoint() != null) {
            if (data.getObj() == element) {
                pre.setPoint(data.getPoint());
                n--;
                return get();
            } else {
                pre = data;
                data = data.getPoint();
            }
        }
        throw new RuntimeException("未查询到数据：" + element);
    }

    /**
     * 删除最后一个元素
     *
     * @return link
     */
    public String del() {
        checkInstance();
        Data data = head.getPoint();
        while (data.getPoint() != null) {
            if (data.getPoint().getPoint() != null) {
                data = data.getPoint();
            } else {
                data.setPoint(null);
                n--;
            }
        }
        return get();
    }

    /**
     * 获取上级索引树
     * todo
     * @return higherLevelIndexLink
     */
    private SkipList getIndexArr(SkipList skipList) {
        SkipList indexTree = SkipList.getInstance();
        for (int index = 0; index <= n+1; index = index+2){
            indexTree.head.setObj(get(index));
        }
        return indexTree;
    }

    /**
     * 重构索引
     * todo
     */
    private void restructureIndex() {

    }

    /**
     * 链表中元素的存储单元
     */
    public static class Data {
        private int obj;
        private Data point; //在尾哨兵时表示上一个坐标

        public Data(int obj, Data point) {
            this.obj = obj;
            this.point = point;
        }

        public int getObj() {
            return obj;
        }

        public void setObj(int obj) {
            this.obj = obj;
        }

        public Data getPoint() {
            return point;
        }

        public void setPoint(Data point) {
            this.point = point;
        }

        @Override
        public String toString() {
            return String.valueOf(obj);
        }
    }
}
