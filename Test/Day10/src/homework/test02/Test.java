package homework.test02;

public class Test {
    public static void main(String[] args) {
//        double pi = Math.PI;
//        String str = "" + pi;
//        System.out.println(str.charAt(1));
        Person p = new Person();
        Dog dog = new Dog();
        p.feed(dog);
        dog.swim();

        Frog frog = new Frog();
        p.feed(frog);
        frog.swim();

        Sheep sheep = new Sheep();
        p.feed(sheep);

    }
}
