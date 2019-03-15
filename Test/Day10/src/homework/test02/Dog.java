package homework.test02;

public class Dog extends Animal implements Swimming{
    @Override
    public void swim() {
        System.out.println("狗刨");
    }

    public void eat () {
        System.out.println("啃骨头");
    }
}
