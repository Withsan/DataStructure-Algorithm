package com.wyl.satastructureandalgorithm.algroithm.sort.bubblesort.controller;

import com.wyl.satastructureandalgorithm.algroithm.sort.bubblesort.BubbleSort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wyl
 * @date 2019-12-03 14:52
 */
@RestController
@RequestMapping("BubbleSortController")
public class BubbleSortController {
    int[] arr = {1,2,3 ,7,5,3,5,20,3040,4,5,6,7,8,9};
    @GetMapping("V1")
    public void V1(){
        int[] arr = {1,2,3 ,7,5,3,5,20,3040,4,5,6,7,8,9};
        BubbleSort.sortV1(arr);
        print(arr);
    }
    @GetMapping("V2")
    public void V2(){
        int[] arr = {1,2,3 ,7,5,3,5,20,3040,4,5,6,7,8,9};
        BubbleSort.sortV2(arr);
        print(arr);
    }
    @GetMapping("V3")
    public void V3(){
        int[] arr = {1,2,3 ,7,5,3,5,20,3040,4,5,6,7,8,9};
        BubbleSort.sortV3(arr);
        print(arr);
    }
    private void print(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
