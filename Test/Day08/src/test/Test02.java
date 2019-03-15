package test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("输入一个QQ号：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);
        boolean bo = true;
        if (str.length() < 5 || str.length() > 12 || ch == '0') {
            bo = false;
        } else {
            char[] ch1 = str.toCharArray();
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] < '0' || ch1[i] > '9' ){
                    bo = false;
                    break;
                } else {
                    bo = true;
                }
            }
        }
        System.out.println(bo);
    }
}
