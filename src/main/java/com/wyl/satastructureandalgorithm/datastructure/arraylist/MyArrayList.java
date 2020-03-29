package com.wyl.satastructureandalgorithm.datastructure.arraylist;

import java.util.Arrays;

/**
 * @author wyl
 */
public class MyArrayList<T> {
    /**
     * 默认初始化
     */
    private static final Object[] DEFAULT_CAPACITY_ELEMENTS = {};
    /**
     * 存储元素数组
     */
    transient private Object[] elements;
    /**
     * 第一次扩容默认初始化容量
     */
    private static final int DEFAULT_CAPACITY = 10;
    /**
     * list中元素个数
     */
    private int size;

    /**
     * 初始化
     */
    public MyArrayList() {
        this.elements = DEFAULT_CAPACITY_ELEMENTS;
    }
    /**
     * 初始化
     */
    public MyArrayList(int capacity) {
        this.elements = new Object[capacity];
    }
    /**
     * 添加一个元素
     *
     * @param t
     * @return
     */
    public boolean add(T t) {
        add(t, elements, size);
        return true;
    }

    public T remove(int index) {
        T oldValue = (T) elements[index];
        int newSize;
        if ((newSize = size - 1) > 0) {
            int moveNum = newSize - index;
            System.arraycopy(elements, index + 1, elements, index, moveNum);
        }
        elements[(size = newSize)] = null;
        return oldValue;
    }

    /**
     * 按照下标查找
     *
     * @param index 数组下标
     * @return 下标所对应的元素
     */
    public T get(int index) {
        return (T) elements[index];
    }

    private void add(T t, Object[] elements, int s) {
        if (s == elements.length) {
            elements = grow(s + 1);
        }
        elements[size] = t;
        size = size + 1;
    }

    private Object[] grow(int minCapacity) {
        int oldCapacity = elements.length;
        int newCapacity;
        if (oldCapacity == 0 || elements == DEFAULT_CAPACITY_ELEMENTS) {
            newCapacity = DEFAULT_CAPACITY;
        } else {
            newCapacity = oldCapacity + (oldCapacity >> 1);
        }
        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }
        return elements = Arrays.copyOf(elements, newCapacity);
    }

    /**
     * 获取list长度
     *
     * @return 返回list中元素个数
     */
    public int size() {
        return size;
    }
}
