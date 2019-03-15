package homework;

import java.util.Scanner;

public class HomeworkPhone {
    public static void main(String[] args) {
        //全参构造
        Phone two = new Phone("小米", 988.0);
        System.out.print("正在使用价格为" + two.getPrice() + "元的" + two.getBrand() + "牌手机" );
        two.call("何晨");
        System.out.print("正在使用价格为" + two.getPrice() + "元的" + two.getBrand() + "牌手机" );
        two.sendMessage();
        System.out.print("正在使用价格为" + two.getPrice() + "元的" + two.getBrand() + "牌手机" );
        two.playGame();
        System.out.println("*********************************************");

        //无参构造
        Phone one = new Phone();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入手机品牌：");
        one.setBrand(sc.next());
        System.out.print("请输入手机价格：");
        one.setPrice(sc.nextDouble());

        System.out.print("正在使用价格为" + one.getPrice() + "元的" + one.getBrand() + "牌手机" );
        one.call("何晨");
        System.out.print("正在使用价格为" + one.getPrice() + "元的" + one.getBrand() + "牌手机" );
        one.sendMessage();
        System.out.print("正在使用价格为" + one.getPrice() + "元的" + one.getBrand() + "牌手机" );
        one.playGame();
    }
}
