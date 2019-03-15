package test;

public class Test05 {
    public static void main(String[] args) {
        double d = Math.random() * 100;
        System.out.println(d);
        d = Math.floor(d * 100) / 100;
        System.out.println(d);
    }
}
