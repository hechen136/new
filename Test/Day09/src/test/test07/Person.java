package test.test07;

import java.util.ArrayList;

public abstract class Person {
    private String name;
    private int role;   //1.管理员  2.顾客

    public Person() {
    }

    public Person(String name, int role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public ArrayList<Goods> removeGoods (ArrayList<Goods> list, int id) {
        Goods goods = new Goods();
        list.remove(goods.getId());
        return list;
    }
}
