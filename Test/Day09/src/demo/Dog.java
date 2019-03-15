package demo;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void shit() {
        super.shit();
        System.out.println("狗");
    }
}
