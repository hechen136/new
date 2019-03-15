import java.util.Random;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = 0;
        int num = r.nextInt(100);

        System.out.print("请输入0到100以内的数：");

        while (true) {
            n = sc.nextInt();

            if (n > num) {
                System.out.println("大了，请重试。");
            } else if ( n < num ) {
                System.out.println("小了，请重试。");
            } else if ( n == num ) {
                System.out.println("恭喜你");
                break;
            }
        }
    }
}
