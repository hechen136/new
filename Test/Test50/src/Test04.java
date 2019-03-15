//题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int num = sc.nextInt();
        System.out.print("90 = ");
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                num = num / i;
                if (num == 1 ) {
                    System.out.print(i);
                    break;
                }
                System.out.print(i + "*");
                i = 2;
            }
        }
    }
}
