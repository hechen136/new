import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        ArrayList<Integer> list1;
        list1 = new ArrayList<>();
        getNumList(list1);
        ArrayList<Integer> list = numList();
        System.out.print("乐透号码：");
        show(list1);
        equle(list1, list);
    }

    private static void getNumList(ArrayList<Integer> list1) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list1.add(r.nextInt(50) + 1);
        }
    }

    private static ArrayList<Integer> numList () {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("输入你的号码，用英文逗号隔开：");
        String str = sc.next();
        String[] strArray = str.split(",");
        int[] num = new int[strArray.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(strArray[i]);
            list.add(num[i]);
        }
        System.out.print("你输入的号码：");
        show(list);
        return list;
    }

    private static void equle(ArrayList<Integer> list1, ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (list1.contains(list.get(i))) {
                System.out.print(list.get(i) + "\t");
                count++;
            }
        }
        System.out.println();
        System.out.println("猜中了：" + count + "个数字");
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
