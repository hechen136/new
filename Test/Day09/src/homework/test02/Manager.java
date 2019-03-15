package homework.test02;

public class Manager extends Worker {
    private double jiangjin;

    public Manager() {
    }

    public Manager(double jiangjin) {
        this.jiangjin = jiangjin;
    }

    public Manager(String name, String id, double money, double jiangjin) {
        super(name, id, money);
        this.jiangjin = jiangjin;
    }

    public double getJiangjin() {
        return jiangjin;
    }

    public void setJiangjin(double jiangjin) {
        this.jiangjin = jiangjin;
    }

    public void work () {
        System.out.println("管理程序员");
    }
}
