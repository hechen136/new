import java.util.Random;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        boolean bo = true;

        while (num == 1) {
            String s = getCode();
            System.out.println("六位数随机验证码为：" + s);
            bo = getChicke(s);
            if (bo) {
                System.out.println("验证成功。");
                break;
            } else {
                System.out.println("验证失败。");
            }
            System.out.println("1.继续。  0.退出");
            num = sc.nextInt();
        }
    }

    public static String getCode() {
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E',  'F', 'G', 'H',
                       'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',  'Y',
                         'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                            'q',  'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6; i++) {
            int j = random.nextInt(arr.length);
            code += arr[j];
        }

        return code;
    }

    public static boolean getChicke(String s) {
        System.out.print("请输入验证码：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean bo = str.equals(s);
        return  bo;
    }
}
