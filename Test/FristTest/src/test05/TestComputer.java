package test05;

public class TestComputer {
    public static void main(String[] args) {
        Computer one = new Computer("苹果", 12000);  //全参构造
        Computer two = new Computer();                              //setter方法
        two.setBrand("联想");
        two.setPrice(6500);

        System.out.print("正在使用价格为" + one.getPrice() + "元的" + one.getBrand() + "电脑");
        one.movie();
        System.out.print("正在使用价格为" + two.getPrice() + "元的" + two.getBrand() + "电脑");
        two.game();

    }
}
