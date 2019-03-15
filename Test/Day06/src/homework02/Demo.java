package homework02;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager();
        System.out.println("请输入经理的名字：");
        m.setName(sc.next());
        System.out.println("请输入经理的工号：");
        m.setId(sc.next());
        System.out.println("请输入经理的工资：");
        m.setSalary(sc.nextDouble());
        System.out.println("请输入经理的奖金：");
        m.setBonus(sc.nextDouble());

        System.out.print("工号为" + m.getId() + "基本工资为" + m.getSalary() +
                "奖金为" + m.getBonus() + "的项目经理" + m.getName());
        m.work();

        Coder c = new Coder("蔡堰熙", "123", 10000.0);
        System.out.print("工号为" + c.getId() + "基本工资为" + c.getSalary() +
                "的程序员" + c.getName());
        c.work();
    }
}
