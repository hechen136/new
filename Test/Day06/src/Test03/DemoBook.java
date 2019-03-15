package Test03;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        System.out.print("共有几本书：");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            Book book = new Book();

            System.out.println("请输入第" + (i + 1) + "本书的信息");
            System.out.print("请输入图书编号：");
            book.setBookId(sc.next());
            System.out.print("请输入书名：");
            book.setName(sc.next());
            System.out.print("请输入ISBN编码：");
            book.setId(sc.next());
            System.out.print("请输入价格：");
            book.setPrice(sc.nextInt());
            System.out.print("请输入出版日期：");
            book.setDate(sc.next());

            list.add(book);
        }

        getMax(list);
    }

    private static void getMax(ArrayList<Book> list) {
        Book b = new Book();
        b.setPrice(list.get(0).getPrice());

        for (int i = 0 ; i < list.size(); i++) {
            if (b.getPrice() < list.get(i).getPrice()) {
                b.setPrice(list.get(i).getPrice());
                b = list.get(i);
            }
        }

        b.showBook(b);
    }
}
