//題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
//        对兔子，假如兔子都不死，问每个月的兔子总数为多少？

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        int num = sc.nextInt();
        for (int i = 2; i < num + 1; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("第" + (i + 1) + "月有" + list.get(i) * 2 + "只");
        }

    }
}
