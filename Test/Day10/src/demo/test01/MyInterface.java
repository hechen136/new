package demo.test01;

public interface MyInterface {
    public abstract void method();
    public abstract void method02();
    public default void method03() {
        System.out.println("=======");
    }
}
