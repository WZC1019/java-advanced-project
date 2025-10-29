package com.WZC;

/**
 * 用户服务模块 - 第一个功能模块
 * 提供用户相关的业务功能
 */
public class UserService {
    private String[] users = {"张三", "李四", "王五"};
    
    /**
     * 获取所有用户列表
     */
    public void listAllUsers() {
        System.out.println("=== 用户列表 ===");
        for (int i = 0; i < users.length; i++) {
            System.out.println((i + 1) + ". " + users[i]);
        }
    }
    
    /**
     * 根据索引获取用户
     */
    public String getUserById(int index) {
        if (index >= 0 && index < users.length) {
            return users[index];
        }
        return "用户不存在";
    }
}