//题目：利用条件运算符的嵌套来完成此题：
// 学习成绩>=90分的同学用A表示，
// 60-89分之间的用B表示，
// 60分以下的用C表示。

import java.util.Random;

public class Test05 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(101);
        System.out.println(i);
        if (i >= 90 ) {
            System.out.println("A");
        }else if (i < 90 && i >=60) {
            System.out.println("B");
        } else  if (i < 60) {
            System.out.println("C");
        }
    }
}
