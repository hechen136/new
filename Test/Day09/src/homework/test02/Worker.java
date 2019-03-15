package homework.test02;

public class Worker {
    private String name;
    private String id;
    private double money;

    public Worker() {
    }

    public Worker(String name, String id, double money) {
        this.name = name;
        this.id = id;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void work () {
        System.out.println("工作.");
    }
}
