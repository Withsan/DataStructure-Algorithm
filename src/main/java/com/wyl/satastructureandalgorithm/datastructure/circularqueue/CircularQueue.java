package com.wyl.satastructureandalgorithm.datastructure.circularqueue;

import java.util.Arrays;

/**
 * 循环队列
 *
 * @author Wyl
 * @date 2019-12-03 22:32
 */
public class CircularQueue<E> {
    private E[] arr;
    private int INIT_CAPACITY = 16;
    private int length;
    private int front = 0;
    private int tail = 1;

    public CircularQueue(int size) {
        if (size <=0) {
            throw new IllegalArgumentException("队列长度不能小于等于零");
        }
        arr = (E[]) new Object[size];
        length = arr.length;
    }

    public CircularQueue() {
        arr = (E[]) new Object[INIT_CAPACITY];
        length = arr.length;
    }

    /**
     * 入列
     *
     * @param value
     */
    public void push(E value) {
        if (tail % length == front) {
            System.out.println("队列已满！");
        } else {
            arr[tail] = value;
            tail++;
            tail = tail % length;
        }
    }

    /**
     * 出列
     */
    public E pop() {
        if (tail == front + 1) {
            System.out.println("队列已空！");
            return null;
        } else {
            E value = arr[front];
            front++;
            front = front % length;
            return value;
        }
    }

    /**
     * 重写toString
     *
     * @return 数组的形式.
     */
    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
