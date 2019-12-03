package com.wyl.satastructureandalgorithm.datastructure.sparsematrix.controller;

import com.wyl.satastructureandalgorithm.datastructure.sparsematrix.Matrix;
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
}
