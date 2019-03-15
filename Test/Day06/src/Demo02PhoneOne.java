import java.util.Scanner;

public class Demo02PhoneOne {
    public static void main(String[] args) {
        Phone p = new Phone();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入品牌");
        p.brand = sc.next();
        System.out.println("请输入价格");
        p.price = sc.nextDouble();
        System.out.println("请输入颜色");
        p.color = sc.next();

        System.out.println("品牌：" + p.brand);
        System.out.println("价格：" + p.price);
        System.out.println("颜色：" + p.color);

        p.call("乔布斯");
        p.sendMessage();
    }
}
