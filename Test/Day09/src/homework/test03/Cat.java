package homework.test03;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("用" + something + "喂养");
    }

    public void catchMouse() {
        System.out.println("逮老鼠");
    }
}
