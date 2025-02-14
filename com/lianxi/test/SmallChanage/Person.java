package com.lianxi.test.SmallChanage;

public class Person {
    private String name;
    private int age;
    private char genden;
    private double money = 0.0;
    private int sount = 0;
    private String[][] mx = new String[1][4];

    public Person(String name, int age, char genden, double money) {
        this.name = name;
        this.age = age;
        this.genden = genden;
        this.money = money;
    }

    public void ruzhang (double money, String rq, int count) {
        this.money += money;
        String[][] s = new String[count + 1][4];
        s[count][0] = "收益入账";
        s[count][1] = ("+" + money);
        s[count][2] = rq;
        s[count][3] = ("余额：" + this.money);
        if (sount == 0) {
            for (int i = 0; i < mx.length; i++) {
                for (int j = 0; j < mx[i].length; j++) {
                    mx[i][j] = s[i][j];
                }
            }
        }else {
            kuoron(s);
        }
        sount++;
    }
    public void xiaofei (double money, String rq, int count, String xfname) {
        this.money -= money;
        String[][] s = new String[count + 1][4];
        s[count][0] = xfname;
        s[count][1] = ("-" + money);
        s[count][2] = rq;
        s[count][3] = ("余额：" + this.money);
        if (sount == 0) {
            for (int i = 0; i < mx.length; i++) {
                for (int j = 0; j < mx[i].length; j++) {
                    mx[i][j] = s[i][j];
                }
            }
        }else {
            kuoron(s);
        }
        sount++;
    }

    public boolean xfyz(double money, String rq, int count, String xfname) {
        if (this.money - money >= 0) {
            xiaofei(money, rq, count, xfname);
            return true;
        } else {
            System.out.println("吊毛，你没那么多钱消费。");
            return false;
        }
    }

    private void kuoron(String[][] s) {
        for (int i = 0; i < mx.length; i++) {
            for (int j = 0; j < mx[i].length; j++) {
                s[i][j] = mx[i][j];
            }
        }
        mx = s;
    }

    public void printming() {
        System.out.println("-----------------------零钱通明细-----------------------");
        for (int i = 0; i < mx.length; i++) {
            for (int j = 0; j < mx[i].length; j++) {
                System.out.print(mx[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGenden() {
        return genden;
    }

    public void setGenden(char genden) {
        this.genden = genden;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String[][] getMx() {
        return mx;
    }

    public void setMx(String[][] mx) {
        this.mx = mx;
    }
}
