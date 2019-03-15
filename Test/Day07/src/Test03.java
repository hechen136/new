import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(5) + 1);
        }

        ﬁndIndex(list);
        replace( list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
    }

    public static void ﬁndIndex(ArrayList<Integer> list) {
        System.out.print("5的索引是：");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 5) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }

    public static void replace(ArrayList<Integer> list) {
        System.out.print("替换前：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
        System.out.print("替换后：");
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i) == 5) {
               list.set(i, 50);
           }
        }
    }
}
