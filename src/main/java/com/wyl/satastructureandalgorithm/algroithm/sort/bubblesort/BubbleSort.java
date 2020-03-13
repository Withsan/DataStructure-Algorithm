package com.wyl.satastructureandalgorithm.algroithm.sort.bubblesort;

import java.util.List;

/**
 * @author Wyl
 * @date 2020-01-06 22:21
 */
public class BubbleSort {
    public static void sortV1(int[] source) {
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source.length - i - 1; j++) {
                int tmp;
                if (source[j] > source[j + 1]) {
                    tmp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = tmp;
                }
            }
        }
    }

    public static void sortV2(int[] source) {
        for (int i = 0; i < source.length; i++) {
            // 循环一遍后发现没有交换
            boolean isChange = false;
            for (int j = 0; j < source.length - i - 1; j++) {
                int tmp;
                if (source[j] > source[j + 1]) {
                    tmp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = tmp;
                    isChange = true;
                }
            }
            if (!isChange) {
                break;
            }
        }
    }
    public static void sortV3(int[] source) {
        int exChangeIndex=0;
        int sortBorder = source.length -1;
        for (int i = 0; i < source.length; i++) {
            // 循环一遍后发现没有交换
            boolean isChange = false;
            for (int j = 0; j < sortBorder; j++) {
                int tmp;
                if (source[j] > source[j + 1]) {
                    exChangeIndex = j;
                    tmp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = tmp;
                    isChange = true;
                }
            }
            sortBorder =exChangeIndex;
            if (!isChange) {
                break;
            }
        }
    }
}
