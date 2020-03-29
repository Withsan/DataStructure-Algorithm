package com.wyl.satastructureandalgorithm.list;

import com.wyl.satastructureandalgorithm.datastructure.arraylist.MyArrayList;
import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void testMyList(){
        MyArrayList<Integer> intList = new MyArrayList<>(4);
        for (int i = 0; i <10 ; i++) {
            intList.add(i);
        }
        intList.remove(3);
        intList.remove(0);
        for (int i = 0; i <intList.size() ; i++) {
            System.out.println(intList.get(i));
        }
        System.out.println("数组size：" +intList.size());
    }
}
