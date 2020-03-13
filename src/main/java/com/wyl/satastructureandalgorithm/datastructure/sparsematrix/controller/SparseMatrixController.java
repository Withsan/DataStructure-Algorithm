package com.wyl.satastructureandalgorithm.datastructure.sparsematrix.controller;

import com.wyl.satastructureandalgorithm.datastructure.sparsematrix.Matrix;
import com.wyl.satastructureandalgorithm.datastructure.sparsematrix.SparseMatrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wyl
 * @date 2019-12-03 14:52
 */
@RestController
@RequestMapping("SparseMatrixController")
public class SparseMatrixController {
    Matrix matrix;
    SparseMatrix sparseMatrix;
    @GetMapping("getMatrix")
    public String getMatrix(int row, int column){
        matrix = new Matrix(row,column);
        return matrix.toString();
    }
    @GetMapping("setValue")
    public String setValue(int value,int row, int column){
        matrix.setValue(value,row,column);
        return matrix.toString();
    }
    @GetMapping("toSparseMatrix")
    public String toSparseMatrix(){
        sparseMatrix = matrix.toSparseMatrix();
        return sparseMatrix.toString();
    }
    @GetMapping("toMatrix")
    public String toMatrix(){
        matrix = sparseMatrix.toMatrix();
        return matrix.toString();
    }
}
