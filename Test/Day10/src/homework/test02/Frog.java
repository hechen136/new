package homework.test02;

public class Frog extends Animal implements Swimming {

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }

    public void eat() {
        System.out.println("吃虫子");
    }
}
