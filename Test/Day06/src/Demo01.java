import java.util.Scanner;

//学生类，人类的实例化
public class Demo01 {
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
       // stu.name = sc.next();
       // System.out.println(stu.name);

        Person p = new Person();
        p.name = sc.next();
        //p.age = sc.nextInt();
        int num = sc.nextInt();
        p.setAge(num);

        System.out.print(p.name + p.getAge() + "岁");
        p.eat();
        p.shit();
    }
}
