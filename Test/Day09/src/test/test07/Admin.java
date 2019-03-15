package test.test07;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Person {
    private String key = "123456";
    private ArrayList<Goods> list = new ArrayList<>();

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ArrayList<Goods> getList() {
        return list;
    }

//    public void setList(ArrayList<Goods> list) {
//        this.list = list;
//    }

    public Admin() {
    }

    public Admin(String key, ArrayList<Goods> list) {
        this.key = key;
        this.list = list;
    }

    public Admin(String name, int role, String key, ArrayList<Goods> list) {
        super(name, role);
        this.key = key;
        this.list = list;
    }

    public void removeGoods (ArrayList<Goods> list, Goods goods) {
        Scanner sc = new Scanner(System.in);
        goods.show(list);
        System.out.print("你要删除的商品的id：");
        int i = sc.nextInt();
        list.remove(i - 1);
        System.err.println("删除成功！！");
    }

    public void addGoods(ArrayList<Goods> list) {
        Scanner sc = new Scanner(System.in);
        Goods goods2 = new Goods();
        System.out.print("添加的商品名称：");
        String str = sc.next();
        goods2.setName(str);
        System.out.print("添加的商品ID：");
        goods2.setGoodsId(sc.next());
        System.out.print("添加商品价格：");
        goods2.setPrice(sc.nextDouble());
        list.add(goods2);
        System.err.println("添加成功!!!");
        System.out.println("=================================");
        this.list = list;
    }
}
