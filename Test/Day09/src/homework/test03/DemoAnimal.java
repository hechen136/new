package homework.test03;

public class DemoAnimal {
    public static void main(String[] args) {
        Person person = new Person();
        Dog dog = new Dog();
        Cat cat = new Cat();
        person.keepPet(dog, "骨头");
        person.keepPet(cat, "鱼");
    }
}
