//题目：输入一行字符，
// 分别统计出其中英文字母、空格、数字和其它字符的个数。

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        //Arrays.toString(ch);
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] <= 'Z' && ch[i] >= 'A' || ch[i] <= 'z' && ch[i] >= 'a') {
                a++;
            } else if (ch[i] == ' ') {
                b++;
            } else if (ch[i] >= '0' && ch[i] <= '9') {
                c++;
            }
        }
        System.out.println("字母有：" + a + "个");
        System.out.println("空格有：" + b + "个");
        System.out.println("数字有：" + c + "个");
    }
}
