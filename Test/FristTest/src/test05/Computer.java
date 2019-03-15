package test05;

public class Computer {
    private String brand;
    private int price;

    public Computer() {}

    public Computer(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void movie() {
        System.out.println("看电影....");
    }

    public  void game() {
        System.out.println("打游戏....");
    }
}
