import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int max = s1 > s2 ? s1 : s2;
        max = max > s3 ? max : s3;
        System.out.println("最大值是：" + max);
//      int sum = a > b ? (a > c ? a : c) :( b > c ? b : c)
    }
}
