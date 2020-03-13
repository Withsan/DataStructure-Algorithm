package com.wyl.satastructureandalgorithm.datastructure.sparsematrix;

import java.util.Arrays;

/**
 * 普通矩阵
 *
 * @author Wyl
 * @date 2019-12-03 14:39
 */
public class Matrix {
    protected int[][] arr;


    public Matrix(int[][] matrixArr) {
        arr = matrixArr;
    }

    public Matrix(int row, int column) {
        arr = new int[row][column];
    }

    public void setValue(int value, int row, int column) {
        try {
            arr[row - 1][column - 1] = value;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getValue(int row, int column) {
        try {
            return arr[row - 1][column - 1];
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * 转化为稀疏矩阵
     *
     * @return
     */
    public SparseMatrix toSparseMatrix() {
        // 有多少个数据就有多少行(+1行为了记录原始数组大小)
        int rows = getArrNum();
        int[][] sparseMatrix = new int[rows + 1][3];
        int sparseMatrixRow = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    sparseMatrix[sparseMatrixRow][0] = i;
                    sparseMatrix[sparseMatrixRow][1] = j;
                    sparseMatrix[sparseMatrixRow][2] = arr[i][j];
                    sparseMatrixRow++;
                }
            }
        }
        // 最后记录原始矩阵大小
        sparseMatrix[sparseMatrixRow][0] = arr.length;
        sparseMatrix[sparseMatrixRow][1] = arr[0].length;
        sparseMatrix[sparseMatrixRow][2] = 0;
        return new SparseMatrix(sparseMatrix);
    }

    /**
     * 获取数据中不为0的节点个数
     */
    private int getArrNum() {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    num++;
                }
            }
        }
        return num;
    }

    /**
     * 重写toString
     *
     * @return
     */
    @Override
    public String toString() {
        return Arrays.deepToString(arr);
    }
}
