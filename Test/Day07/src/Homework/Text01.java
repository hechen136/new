package Homework;

import java.util.Random;
import java.util.Scanner;

public class Text01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("要随机生成多少个数：");
        int num = sc.nextInt();
        int[] n = new int[num];
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(100) + 1;
            System.out.print(n[i] + "\t");
            sum += n[i];
        }

        int max = n[0];
        for (int i = 1; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }

        System.out.println();
        System.out.println("最大的数是：" + max);
        System.out.println("平均数是：" + sum / num);

    }
}
