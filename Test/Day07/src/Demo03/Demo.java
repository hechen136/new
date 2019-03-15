package Demo03;

import java.util.ArrayList;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100) + 1);
        }

       getNum(list);
    }

    private static void getNum(ArrayList<Integer> list) {
        System.out.print("筛选前：");
        for (Integer aList1 : list) {
            System.out.print(aList1 + " ");
        }
        System.out.println();
        System.out.print("筛选后：");
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 1) {
                list.remove(i);
            }
        }

        for (Integer aList : list) {
            System.out.print(aList + " ");
        }
    }

}
