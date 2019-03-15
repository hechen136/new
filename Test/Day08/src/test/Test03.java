package test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入大字符串：");
        String str1 = sc.nextLine();
        System.out.println("输入小字符串：");
        String str2 = sc.next();
        String[] array = str1.split(str2);
        System.out.println(array.length - 1);
    }
}
