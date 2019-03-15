import java.util.ArrayList;
import java.util.Random;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        getScoreList(list);
    }

    private static void getScoreList(ArrayList<Integer> list) {
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            list.add(r.nextInt(101));
        }
        countScore(list);
    }

    private static void countScore(ArrayList<Integer> list) {
        int[] n = new int[4];
        for (Integer aList : list) {
            if (aList >= 80 && aList <= 100) {
                n[0]++;
            } else if (aList >= 60 && aList <= 79) {
                n[1]++;
            } else if (aList >= 40 && aList <= 59) {
                n[2]++;
            } else if (aList < 40) {
                n[3]++;
            }
        }
        printCount(n);
    }

    private static void printCount(int[] n) {
        System.out.println("100-80分的" + n[0] + "人");
        System.out.println("79-60分的" + n[1] + "人");
        System.out.println("59-40分的" + n[2] + "人");
        System.out.println("39-0分的" + n[3] + "人");
    }
}
