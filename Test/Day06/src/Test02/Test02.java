package Test02;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        int num = 1;
        Scanner sc = new Scanner(System.in);
        while (num == 1) {
            date();
            System.out.println("1.继续。  0.退出");
            num = sc.nextInt();
        }
    }

    public static void date() {
        Scanner sc = new Scanner(System.in);
        MyDate date = new MyDate();
        System.out.print("请输入年份：");
        date.setYear(sc.nextInt());
        System.out.print("请输入月份：");
        date.setMonth(sc.nextInt());
        System.out.print("请输入日期：");
        date.setDay(sc.nextInt());
        date.showDate();
        date.isBo();
    }
}
