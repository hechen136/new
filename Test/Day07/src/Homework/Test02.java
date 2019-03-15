package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("请输入第" + (i + 1) + "个字符串:");
            list.add(sc.next());
        }
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + "]");
                break;
            }
            System.out.print(list.get(i) + ", ");
        }

    }
}
