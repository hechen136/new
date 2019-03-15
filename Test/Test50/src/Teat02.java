import java.util.ArrayList;

//题目：判断101-200之间有多少个素数，并输出所有素数。
public class Teat02 {
    public static void main(String[] args) {
        boolean bo = true;
        for (int i = 101; i < 201; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    bo = false;
                }
            }
            if (bo) {
                System.out.println(i);
            }
            bo = true;
        }
    }
}
