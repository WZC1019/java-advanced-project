package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java高级1班Git实践项目启动成功！");
        
        // 使用UserService功能
        UserService userService = new UserService();
        userService.listAllUsers();
        
        // 使用Calculator功能
        Calculator calculator = new Calculator();
        System.out.println("10 + 5 = " + calculator.add(10, 5));
        System.out.println("10 - 5 = " + calculator.subtract(10, 5));
        System.out.println("10 * 5 = " + calculator.multiply(10, 5));
        
        try {
            System.out.println("10 / 5 = " + calculator.divide(10, 5));
        } catch (ArithmeticException e) {
            System.out.println("计算错误: " + e.getMessage());
        }
    }
}