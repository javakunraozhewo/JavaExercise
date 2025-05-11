package com.lianxi.test.HouseRentalSystem_Practice;

public class index{
    private int Counter = 0;//计数器
    public void printindex() {
        if (Counter == 0) {
            System.out.println("-----------------房屋出租系统-----------------");
        }
        if (Counter == 1) {
            System.out.println("-----------------菜单-----------------");
        }
        System.out.println("\t\t\t1 新 增 房 源");
        System.out.println("\t\t\t2 查 找 房 源");
        System.out.println("\t\t\t3 删 除 房 源");
        System.out.println("\t\t\t4 修 改 房 屋 信 息");
        System.out.println("\t\t\t5 房 屋 列 表");
        System.out.println("\t\t\t6 退\t   出");
        System.out.print("\n请选择(1-6)：");
        Counter = 1;
    }

    public void addhome() {
        System.out.println("111");
    }
}
