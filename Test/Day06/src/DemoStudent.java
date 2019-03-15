public class DemoStudent {
    private String name;
    private int age;
    private String sex;

    public void setName(String name1) {
        name1 = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void eat () {
        System.out.println("会吃饭");
    }

    public void study () {
        System.out.println("会上课");
    }
}
