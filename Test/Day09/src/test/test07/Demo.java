package test.test07;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Admin admin = new Admin();
        roleMenu(admin);
    }

    private static void roleMenu(Admin admin) {
        while(true) {
            System.out.println("1.管理员  \t 2.顾客 \t 0.退出");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i) {
                case 1 : {
                    adminMenu(admin);
                    break;
                }

                case 2 : {
                    customerMenu(admin);
                    break;
                }
            }
            if (i == 0) {
                break;
            }
        }
    }

    private static void adminMenu(Admin admin) {
        ArrayList<Goods> list = new ArrayList<>();
        Goods goods = new Goods();

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入密码：");
        String passKey = sc.next();
        if (passKey.equals(admin.getKey())) {
            while (true) {
                System.out.println("1.添加商品 \t 2.删除商品 \t 0.返回上一级");
                int i = sc.nextInt();
                switch (i) {
                    case 1: {
                        admin.addGoods(list);
                        goods.show(list);
                        break;
                    }
                    case  2: {
                        admin.removeGoods(list, goods);
                        goods.show(list);
                        break;
                    }
                    default: {
                        roleMenu(admin);
                        break;
                    }
                }
                if (i != 1 && i != 2) {
                    break;
                }
            }
        }
    }

    private static void customerMenu(Admin admin) {
        Customer customer = new Customer();
        Scanner sc = new Scanner(System.in);
        Goods goods = new Goods();
        ArrayList<Goods> list = admin.getList();
        ArrayList<Goods> shopCar = new ArrayList<>();

        while (true) {
            System.out.println("1.添加商品到购物车 \t  2.编辑购物车 \t  0.返回上一级");
            int i = sc.nextInt();
            switch (i) {
                case 1: {
                    goods.show(list);
                    customer.addGoods(list, shopCar, goods );
                    goods.show(shopCar);
                    break;
                }
                case  2: {
                    customer.removeGoods(shopCar, goods);
                    goods.show(shopCar);
                    break;
                }
                default: {
                    roleMenu(admin);
                    break;
                }
            }
            if (i != 1 && i != 2) {
                break;
            }
        }
    }

}
