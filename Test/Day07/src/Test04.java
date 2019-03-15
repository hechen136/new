import java.util.ArrayList;
import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        getNumList(list);
        printcount(list);
    }

    private static void getNumList(ArrayList<Integer> list) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(r.nextInt(10) + 1);
        }
    }

    private static void printcount(ArrayList<Integer> list) {
        int[] n = new int[10];
        for (Integer aList : list) {
            switch (aList) {
                case 1: {
                    n[0]++;
                    break;
                }
                case 2: {
                    n[1]++;
                    break;
                }
                case 3: {
                    n[2]++;
                    break;
                }
                case 4: {
                    n[3]++;
                    break;
                }
                case 5: {
                    n[4]++;
                    break;
                }
                case 6: {
                    n[5]++;
                    break;
                }
                case 7: {
                    n[6]++;
                    break;
                }
                case 8: {
                    n[7]++;
                    break;
                }
                case 9: {
                    n[8]++;
                    break;
                }
                case 10: {
                    n[9]++;
                    break;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("数字：" + (i + 1) + "----" + n[i] + "次");
        }
    }
}
