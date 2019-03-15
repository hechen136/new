import java.util.ArrayList;
import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        getNum(list);
        cNum(list);
    }

    private static void getNum(ArrayList<Integer> list) {
        Random r = new Random();
        for (int i = 0; i < 30; i++) {
            list.add(r.nextInt(100) + 2);
        }
        System.out.println("随机数为：");
        show(list);
    }

    private static void cNum(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = list.get(i) - 1; j >= 2 ; j--) {
                if (list.get(i) % j == 0) {
                    list.remove(i);
                    break;
                }
            }
        }
        System.out.println("质数为：");
        show(list);
    }

    private static void show(ArrayList<Integer> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + "]");
                break;
            }
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }
}
