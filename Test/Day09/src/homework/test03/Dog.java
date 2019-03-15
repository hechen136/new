package homework.test03;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("用" + something + "喂养");
    }

    public void lookHome() {
        System.out.println("可以看家。");
    }
}
