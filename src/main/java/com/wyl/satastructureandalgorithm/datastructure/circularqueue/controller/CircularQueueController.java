package com.wyl.satastructureandalgorithm.datastructure.circularqueue.controller;

import com.wyl.satastructureandalgorithm.datastructure.circularqueue.CircularQueue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wyl
 * @date 2019-12-03 14:52
 */
@RestController
@RequestMapping("CircularQueueController")
public class CircularQueueController {
    CircularQueue<Integer> circularQueue;
    @GetMapping("getCircularQueue")
    public String getCircularQueue(int size){
         circularQueue = new CircularQueue(size);
        return circularQueue.toString();
    }
    @GetMapping("push")
    public String push(int value){
        circularQueue.push(value);
        return circularQueue.toString();
    }
    @GetMapping("pop")
    public String pop(){
        int value = circularQueue.pop();
        return circularQueue.toString()+"---返回值是："+value;
    }
}
