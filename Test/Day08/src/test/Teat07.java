package test;

import java.util.Scanner;

public class Teat07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        boolean bo = false;
        for (int i = 0; i < ch.length / 2; i++) {
            if (ch[i] == ch[ch.length - 1 - i]) {
                bo = true;
            }
        }
        System.out.println(bo);
    }
}
