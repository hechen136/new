//题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
// 例如2+22+222+2222+22222(此时共有5个数相加)，
//几个数相加有键盘控制。

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "几次:");
        int num = sc.nextInt();
        System.out.print("几：");
        int a = sc.nextInt();
        int sum = 0;
        int j = 10;
        for (int i = 1; i <= num; i++) {
            System.out.println(a + " ");
            sum += a;
            a = a * j + a;
            j = j * 10;
            System.out.println(j);
        }
        System.out.println(sum);
    }
}
