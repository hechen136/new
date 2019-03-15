package demo;

public class Zi extends Fu{
    int num = 20;
    public void method() {
        System.out.println(super.num);
        super.method();
        System.out.println("zi");
    }
}
