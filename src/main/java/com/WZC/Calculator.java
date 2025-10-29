package com.example;

/**
 * 计算器工具模块 - 第二个功能模块
 * 提供基本的数学计算功能
 */
public class Calculator {
    
    /**
     * 加法运算
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * 减法运算
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * 乘法运算
     */
    public int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * 除法运算
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("除数不能为零");
        }
        return (double) a / b;
    }
}