package com.lianxi.test.SmallChanage;

import java.util.Scanner;

public class SmallChanageSys {
    public static void main(String[] args) {
        //导入scanner包用于捕捉键盘输入内容
        Scanner scanner = new Scanner(System.in);
        String[][] s = new String[0][3];
        Person person = new Person("用户1", 18, '男', 0.0);

        int count = 0;//计数器
        boolean b = true;

        while(b) {
//            //win系统的执行清屏指令
//            if (？ > 0) {
//                try {
//                    ProcessBuilder builder = new ProcessBuilder("cmd", "/c", "cls");
//                    builder.inheritIO().start().waitFor();
//
//                } catch (IOException | InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("请继续");
//            }

            //零钱通菜单
            System.out.println("-----------------------零钱通菜单-----------------------");
            System.out.println("\t\t\t\t1 零钱通明细");
            System.out.println("\t\t\t\t2 收益入账");
            System.out.println("\t\t\t\t3 消费");
            System.out.println("\t\t\t\t4 退\t出");

            //开始执行
            System.out.print("请选择（1-4）：");
            int cd = scanner.nextInt();//读取用户输入的数

            //开始判断
            if (cd > 0 & cd < 5) {
                switch (cd) {
                    case 1:
                        if (count == 0) {
                            System.out.println("还没有任何流水！吃我一发闪电五连鞭！！！");
                        }else{
                            person.printming();
//                            return;
                        }
                        break;
                    case 2:
                        while (true) {

                            System.out.println("请输入本次入账金额：");
                            double a = scanner.nextDouble();
                            person.ruzhang(a, count);
                            count++;

                            System.out.println("是否继续？(y/n)");
                            char c1 = scanner.next().charAt(0);
                            if (c1 == 'y') {

                            }else {
                                break;
                            }
                        }
                        break;

                    case 3:
                        while (true) {

                            System.out.println("请输入本次消费种类名字：");
                            String s2 = scanner.next();
                            System.out.println("请输入本次消费金额：");
                            double a = scanner.nextInt();
                            if (person.xfyz(a, count, s2)) {
                                count++;
                            }

                            System.out.println("是否继续？(y/n)");
                            char c1 = scanner.next().charAt(0);
                            if (c1 == 'y') {

                            }else {
                                break;
                            }
                        }
                        break;
                    case 4:
                        while (true) {
                            System.out.println("你确定要退出吗？:(y/n)");
                            char c1 = scanner.next().charAt(0);
                            if (c1 == 'y'){
                                return;
                            }else if (c1 == 'n'){
                                break;
                            }else {
                                System.out.println("乱填是吧，哦呀哈哈，amagi~");
                            }
                        }

                }
            } else {
                System.out.println("输入错误，请输入正确的序号。吊毛");
            }
        }
    }
}
