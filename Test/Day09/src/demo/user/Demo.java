package demo.user;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Person p = new Person();
        Master m = new Master();
        System.out.print("发多少钱：");
        int num = new Scanner(System.in).nextInt();
        System.out.print("发多少份：");
        int i = new Scanner(System.in).nextInt();
        setRedPage(m, num);
        getRedPage(p, num, i);
    }

    private static void setRedPage(Master m,int num) {
        m.setName("何晨");
        m.setMoney(100 - num);
        m.redPage();
        System.out.println(m.getName() + "还有余额:" + m.getMoney());
    }

    private static void getRedPage(Person p, int num, int i) {
        p.setName("陈。。");
        p.setMoney(100 + num / i);
        p.redPage();
        System.out.println(p.getName() + "还有余额:" + p.getMoney());
    }
}
