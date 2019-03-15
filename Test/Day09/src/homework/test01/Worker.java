package homework.test01;

public class Worker extends Person{
    private String umit;
    private int workAge;

    public Worker() {
    }

    public Worker(String umit, int workAge) {
        this.umit = umit;
        this.workAge = workAge;
    }

    public Worker(String name, String gender, int age, String nationality, String umit, int workAge) {
        super(name, gender, age, nationality);
        this.umit = umit;
        this.workAge = workAge;
    }

    public String getUmit() {
        return umit;
    }

    public void setUmit(String umit) {
        this.umit = umit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public void work() {
        System.out.println("人的工作是盖房子");
    }


}
