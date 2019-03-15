public class Test01 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 100; i < 1000; i++) {
            if (i % 10 == 1 || i / 10 % 10 == 2 || i / 100 == 3 || i % 2 == 0 ) {
                continue;
            }
            if (i % 10 == 5) {
                System.out.println();
            }
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("100-1000之间的个位不包含1十位不包含2" +
                "百位不包含3的所有奇数之和:" + sum);

    }
}
