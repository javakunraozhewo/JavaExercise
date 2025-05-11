package com.lianxi.test.HouseRentalSystem_Practice;

import java.util.Scanner;

public class home{
    private String name;//名字
    private long num;//号码
    private String Address;//地址
    private int money;//月租
    private String Status;//状态true为已出租,反之未出租。

    Scanner scanner = new Scanner(System.in);

    public home() {
    }

    public home(String name, long num, String address, int money, String status) {
        this.name = name;
        this.num = num;
        Address = address;
        this.money = money;
        Status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void printf(int id, home h1) {
        System.out.println(String.format("%-10s%-15s%-15s%-15s%-10s%-10s", id, "\t\t" + h1.getName(), "\t\t" + h1.getNum(), "\t\t" + h1.getAddress(), "\t\t" + h1.getMoney(), "\t\t" + h1.getStatus()));
    }

    public home[] addhome(home[] home1) {
        System.out.println("---------------------------------------------------添加房屋---------------------------------------------------");
        System.out.print("姓名：");
        String name = scanner.next();
        System.out.print("电话：");
        long num = scanner.nextLong();
        System.out.print("地址：");
        String dizhi = scanner.next();
        System.out.print("月租：");
        int money = scanner.nextInt();
        System.out.print("状态(未出租/已出租)：");
        String zt = scanner.next();
        if (zt.equals("未出租") || zt.equals("已出租")) {
            home h1 = new home(name, num, dizhi, money, zt);
            home[] temp = new home[home1.length+1];
            for (int i = 0; i < home1.length; i++) {
                temp[i] = home1[i];
            }
            temp[home1.length] = h1;
            home1 = temp;

            System.out.println("---------------------------------------------------添加完成---------------------------------------------------");
        }else {
            System.out.println("你的输入有误!");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        return home1;

    }

    public void Search(home[] home1) {
        System.out.println("---------------------------------------------------查找房屋---------------------------------------------------");
        System.out.print("请输入你要查找的id：");
        int id = scanner.nextInt();
        if (id <= home1.length && id != 0) {
            printf(id, home1[id-1]);
        } else {
            System.out.println("没有该房屋！");
            System.out.println("---------------------------------------------------没有该房屋---------------------------------------------------");
            return;
        }
        System.out.println("---------------------------------------------------查找房屋---------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();

    }

    public void delhome(home[] home1) {
        System.out.println("---------------------------------------------------删除房屋---------------------------------------------------");
        System.out.print("请选择待删除的房屋编号(-1退出)：");
        int del = scanner.nextInt();
        if (del == -1) {
            return;
        } else if (del <= home1.length && del != 0) {
            home[] temp = new home[home1.length-1];
            char ctemp = 'N';
            System.out.print("请选择是否删除(Y/N)：");
            ctemp = scanner.next().charAt(0);
            if (ctemp == 'Y' || ctemp == 'y') {
                ctemp = 'N';
                System.out.println("请小心选择：");
                System.out.println("请输入你的选择(Y/N)：");
                ctemp = scanner.next().charAt(0);

                if (ctemp == 'Y' || ctemp == 'y') {
                    int k = 0;
                    for (int i = 0; i < home1.length; i++) {
                        if (i == del - 1) {
                            continue;
                        }
                        temp[k] = home1[i];
                        k++;
                    }
                    home1 = temp;
                    System.out.println("---------------------------------------------------删除完成---------------------------------------------------");
                }else {
                    System.out.println("已取消");
                }
            }
        }else {
            System.out.println("已取消");
        }
        System.out.println();
        System.out.println();
        System.out.println();

    }

    public home[] Modifyf(home[] home1) {
        System.out.println("---------------------------------------------------修改客户---------------------------------------------------");
        System.out.print("请选择待修改房屋编号(-1退出)：");
        int Modify = -1;
        Modify = scanner.nextInt();
        if (Modify == -1) {
            return home1;
        }else if (Modify <= home1.length && Modify != 0 ) {
            System.out.print("姓名（" + home1[Modify-1].getName() + ")");
            home1[Modify-1].setName(scanner.next());
            System.out.print("电话（" + home1[Modify-1].getNum() + ")");
            home1[Modify-1].setNum(scanner.nextLong());
            System.out.print("地址（" + home1[Modify-1].getAddress() + ")");
            home1[Modify-1].setAddress(scanner.next());
            System.out.print("租金（" + home1[Modify-1].getMoney() + ")");
            home1[Modify-1].setMoney(scanner.nextInt());
            System.out.print("状态（" + home1[Modify-1].getStatus() + ")");
            home1[Modify-1].setStatus(scanner.next());
        }
        System.out.println("---------------------------------------------------修改完成---------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        return home1;
    }

    public void list(home[] home1) {
        System.out.println("---------------------------------------------------房屋列表---------------------------------------------------");
        System.out.println(String.format("%-10s%-15s%-15s%-15s%-10s%-10s", "编号", "\t" + "房主", "\t" + "电话", "\t" + "地址", "\t" + "月租", "\t" + "状态(未出租/已出租)"));
        for (int i = 0; i < home1.length; i++) {
            printf(i+1, home1[i]);
//            System.out.println(String.format("%-10s%-15s%-15s%-15s%-10s%-10s", i+1, home1[0], home[i][1], home[i][2],  home[i][3], home[i][4]));
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public int exit() {
        System.out.print("请输入你的选择(Y/N)");
        char ctemp = scanner.next().charAt(0);
        while (true) {
            if (ctemp == 'y' || ctemp == 'Y') {
                System.out.println("你退出了程序~~");
                return 1;
            }else if (ctemp == 'n' || ctemp == 'N') {
                System.out.println("程序继续》。。");
                return 2;
            }
            System.out.println("选择错误，请重新输入：");
            ctemp = scanner.next().charAt(0);
        }
    }
}

