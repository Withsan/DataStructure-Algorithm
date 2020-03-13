package com.wyl.satastructureandalgorithm.datastructure.sparsematrix;

/**
 * 稀疏矩阵
 *
 * @author Wyl
 * @date 2019-12-03 14:39
 */
public class SparseMatrix extends Matrix {

    public SparseMatrix(int[][] sparseMatrix) {
        super(sparseMatrix);
    }

    public Matrix toMatrix() {
        // 原始矩阵行数
        int row = arr[arr.length - 1][0];
        // 原始矩阵列数
        int column = arr[arr.length - 1][1];
        int[][] matrixArr = new int[row][column];
        // 这里不要最后一行
        for (int i = 0; i < arr.length - 1; i++) {
            int rowValue = arr[i][0];
            int columnValue = arr[i][1];
            int value = arr[i][2];
            matrixArr[rowValue][columnValue] = value;
        }
        return new Matrix(matrixArr);
    }
}
