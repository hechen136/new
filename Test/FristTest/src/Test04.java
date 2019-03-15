import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请用数字输入名次：");
        int a = sc.nextInt();

        switch (a) {
            case 1 : {
                System.out.println("将参加清华大学组织的1个月夏令营.");
                break;
            }
            case 2 : {
                System.out.println("将奖励联想笔记本电脑一部.");
                break;
            }
            case 3 : {
                System.out.println("将奖励移动硬盘一个");
                break;
            }
            default: {
                System.out.println("没有任何奖励,谢谢参与。");
                break;
            }
        }

    }
}
