package com.wyl.satastructureandalgorithm.datastructure.map;


import java.util.Arrays;

/**
 * @author Administrator
 */
public class MyBitMap {
    private  long[] words;
    private  int arraySize =4;
    public MyBitMap(int capacity){
        arraySize = getArraySize(capacity);
        words = new long[arraySize];
    }
    public MyBitMap(){
        words = new long[arraySize];
    }

    /**
     * 存储数据
     *
     * @param index
     */
    public void set(int index){
        int wordIndex = getWordIndex(index);
        words[wordIndex] |= (1L << index);
    }

    /**
     * 检查元素是否在当前集合中
     * @param index 下标
     * @return
     */
    public boolean get(int index){
        int wordIndex = getWordIndex(index);
        return (words[wordIndex]&(1L << index))!=0;
    }

    /**
     * 获取每一个元素在数组中的下标
     * @param bitIndex 实际“位”的下标
     * @return 返回当前位在数组中的下标
     */
    private int getWordIndex(int bitIndex) {
        return bitIndex >> 6;
    }

    /**
     * 获取初始化数组的大小
     * @param paramSize 想要存储的“位”数
     * @return 数组实际的位数
     */
    private int getArraySize(int paramSize) {
        return paramSize >> 6;
    }

    @Override
    public String toString() {
        for(long arrayItem:words){
            System.out.println(Long.toBinaryString(arrayItem));
        }
        return null;
    }
}
