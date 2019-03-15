package test.test07;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Person {
    private double money;

    public Customer() {
    }

    public Customer(double money) {
        this.money = money;
    }

    public Customer(String name, int role, double money) {
        super(name, role);
        this.money = money;
    }

    public ArrayList<Goods> removeGoods(ArrayList<Goods> shopCar, Goods goods) {
        Scanner sc = new Scanner(System.in);
        goods.show(shopCar);
        System.out.print("你要删除的商品的id：");
        int id = sc.nextInt();
        System.out.println(shopCar.get(id-1).getName() + "从购物车中移除成功！");
        shopCar.remove(id - 1);
        return shopCar;
    }

    public ArrayList<Goods> addGoods(ArrayList<Goods> list, ArrayList<Goods> shopCar, Goods goods) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入商品id：");
        int ided = sc.nextInt();
        shopCar.add(list.get(ided - 1));
        return shopCar;
    }
}
