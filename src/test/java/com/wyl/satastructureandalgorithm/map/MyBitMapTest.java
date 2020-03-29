package com.wyl.satastructureandalgorithm.map;

import com.wyl.satastructureandalgorithm.datastructure.map.MyBitMap;
import org.junit.Test;

public class MyBitMapTest {
    @Test
    public void testMyBitMap(){
        MyBitMap bitMap = new MyBitMap();
        for (int i = 0; i <100 ; i++) {
            bitMap.set(i);
        }
        for (int i = 0; i <100 ; i++) {
            System.out.println(bitMap.get(i));
        }

    }



}
