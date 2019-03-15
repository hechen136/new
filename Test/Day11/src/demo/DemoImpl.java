package demo;

public class DemoImpl  {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        };
        myInterface.method();

        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名对象&匿名内部类");
            }
        }.method();
    }
}
