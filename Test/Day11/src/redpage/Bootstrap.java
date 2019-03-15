package redpage;

public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("传智播客");
        red.setOwnerName("王思聪");

        NomalMode nomalMode = new NomalMode();
        red.setOpenWay(nomalMode);
    }
}
