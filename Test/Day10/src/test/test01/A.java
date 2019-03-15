package test.test01;

public interface A {
    void showA();

    public default void showB() {
        System.out.println("BBBB");
    }
}
