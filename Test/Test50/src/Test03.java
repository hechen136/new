//题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。

public class Test03 {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (num == i*i*i +j*j*j +k*k*k) {
                        System.out.println(num);
                    }
                    num++;
                }
            }
        }
    }
}
