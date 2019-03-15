import java.util.ArrayList;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        meun(list, sc);
    }

    private static void meun(ArrayList<Integer> list, Scanner sc) {
        System.out.print("初始化list，请输入几个值，并用英文的逗号隔开：");
        add(list,sc);
        System.out.println("初始化成功！请继续你的操作。");
        show(list);
        while (true) {
            System.out.println("1.添加元素。 \t 2.获取元素。 \t 0.退出");
            int i = sc.nextInt();
            switch (i) {
                case 1: {
                    add(list, sc);
                    System.out.println("添加元素后：");
                    show(list);
                    break;
                }
                case 2: {
                    remove(list, sc);
                    System.out.println("获取元素后：");
                    show(list);
                    break;
                }
            }
            if (i == 0 ){
                break;
            }
        }
    }

    private static void add(ArrayList<Integer> list, Scanner sc) {
        System.out.print("添加元素：");
        String str = sc.next();
        String[] str1 = str.split(",");
        int[] addNum = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            addNum[i] = Integer.parseInt(str1[i]);
            list.add(addNum[i]);
        }
    }

    private static void remove(ArrayList<Integer> list, Scanner sc) {
        System.out.print("获取元素：");
        int n = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n) {
                list.remove(i);
                i--;
            }
        }
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
