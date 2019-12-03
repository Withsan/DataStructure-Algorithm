package com.wyl.satastructureandalgorithm.datastructure.sparsematrix;

import java.util.Arrays;

/**
 * @author Wyl
 * @date 2019-12-03 14:39
 */
public class Matrix {
    private int[][] arr;

    public Matrix(int row, int column) {
        arr = new int[row][column];
    }

    public void setValue(int value, int row, int column) {
            try {
                arr[row-1][column-1] = value;
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    public int getValue(int row, int column){
            try {
                return arr[row-1][column-1];
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
    }


    @Override
    public String toString() {
        return Arrays.deepToString(arr);
    }
}
