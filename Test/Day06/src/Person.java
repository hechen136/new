public class Person {
    String name;
    private int age;

    public void setAge (int num) {
        age = num;
    }
    public int getAge () {
        return age;
    }

    public void eat () {
        System.out.print("会吃饭，");
    }
    public void shit () {
        System.out.print("会拉屎");
    }
}
