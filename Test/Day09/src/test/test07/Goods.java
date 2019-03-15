package test.test07;

import java.util.AbstractList;

public class Goods {
    private String name;
    private int id;
    private String goodsId;
    private double price;

    Goods() {
    }

    public Goods(String name, int id, String goodsId, double price) {
        this.name = name;
        this.id = id;
        this.goodsId = goodsId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void show(AbstractList<Goods> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("商品名称：" + list.get(i).getName());
            System.out.println("\t id：" + (i + 1));
            list.get(i).setId(i + 1);
            System.out.println("商品编号：" + list.get(i).getGoodsId());
            System.out.println("id：" + list.get(i).getId());
            System.out.println("商品价格：" + list.get(i).getPrice());
            System.out.println("=================================");
        }
    }
}
