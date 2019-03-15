package homework.test02;

public class Programmer extends Worker {
    public Programmer() {
    }

    public Programmer(String name, String id, double money) {
        super(name, id, money);
    }

    @Override
    public void work() {
        System.out.println("敲代码。");
    }
}
