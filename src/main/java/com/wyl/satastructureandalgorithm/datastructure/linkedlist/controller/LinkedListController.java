package com.wyl.satastructureandalgorithm.datastructure.linkedlist.controller;

import com.wyl.satastructureandalgorithm.datastructure.circularqueue.CircularQueue;
import com.wyl.satastructureandalgorithm.datastructure.linkedlist.MyLinkedList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

/**
 * @author Wyl
 * @date 2019-12-03 14:52
 */
@RestController
@RequestMapping("LinkedListController")
public class LinkedListController {
    MyLinkedList<Integer> linkedList;
    @GetMapping("testFirst")
    public void testFirst(){
        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;
        Integer five = 5;
        linkedList = new MyLinkedList<>();
        linkedList.add(one);
        linkedList.add(two);
        linkedList.add(three);
        linkedList.add(four);
        linkedList.add(five);
        linkedList.reverse();
        linkedList.showList();
        linkedList.reverseShow();
    }

}
