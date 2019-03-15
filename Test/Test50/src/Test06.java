//题目：输入两个正整数m和n，求其最大公约数和最小公倍数。

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int min = n < m ? n : m;
        int yue = 1;
        for (int i = 2; i <= min; i++) {
            if (m % i == 0 && n % i == 0) {
                yue = i * yue;
                m = m / i;
                n = n / i;
                i = 2;
            }
        }
        System.out.println(yue);
        System.out.println(yue*m*n);
    }
}
