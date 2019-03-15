package Test02;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        System.out.println("1.录入数据. \t 0.退出");

        while (true) {
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    inputStu(list, sc);
                    System.out.println("1.继续录入.\t0.退出");
                    break;
                case 0:
                    System.out.println("录入完毕");
                    break;
            }
            if (i == 0){
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            student.show();
        }
    }

    public static void inputStu(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        Student student = new Student(name, age);
        list.add(student);
    }
}