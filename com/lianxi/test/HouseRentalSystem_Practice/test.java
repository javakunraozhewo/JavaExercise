package com.lianxi.test.HouseRentalSystem_Practice;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        home[] home1 = new home[0];
        home test = new home();


//        String[][] home = new String[0][5];
//        home h1 = new home("丁真", 12138, "北京", 3000, "未出租");
//        home h2 = new home("张三", 12225, "故宫", 2000, "未出租");
//        home h3 = new home("王八蛋", 1123125, "紫禁城", 1000, "未出租");
//        home1[0] = h1;
//        home1[1] = h2;
//        home1[2] = h3;

        index a = new index();
        while (true) {
            a.printindex();
            int index = scanner.nextInt();

            if (index == 1) {//添加房源
                home1 = test.addhome(home1);
            } else if (index == 2) {//查找房源
                test.Search(home1);
            } else if (index == 3) {//删除房源
                test.delhome(home1);
            }else if (index == 4) {//修改房源
                test.Modifyf(home1);
            }else if (index == 5) {//房屋列表
                test.list(home1);
            }else if (index == 6) {//退出系统
                int exit = new home().exit();
                if (exit == 1) {
                    return;
                }else if (exit == 2) {
                    continue;
                }
            }else {
                System.out.println("你的输入有误");
            }
        }
    }
}
