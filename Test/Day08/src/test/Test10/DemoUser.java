package test.Test10;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoUser {
    public static void main(String[] args) {
        meun();
    }

    private static void meun() {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.登录 \t 2.注册 \t 0.退出");
            int i = sc.nextInt();
            switch (i) {
                case 1: {
                    aginUser(list);
                    break;
                }
                case 2: {
                    setUser(list);
                    break;
                }
            }
            if (i == 0 ){
                break;
            }
        }
    }

    private static void setUser(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.print("用户名：");
        user.name = sc.next();
        System.out.print("密码：");
        user.key = sc.next();
        list.add(user);
        System.out.println("注册成功！");
    }

    private static void aginUser(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        User user1 = new User();
        System.out.print("用户名：");
        user1.name = sc.next();
        System.out.print("密码：");
        user1.key = sc.next();
        boolean bo = false;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name);
            System.out.println(list.get(i).key);
        }

        for (int i = 0; i < list.size(); i++) {
            if (user1.name.equals(list.get(i).name) ) {
                bo = true;
                break;
            }
        }

        if(bo) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
    }
}
