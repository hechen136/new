package Test03;

public class Book {
    private String bookId;
    private String name;
    private String id;
    private double price;
    private String date;

    Book() {}

//    public Book(String bookId, String name, String id,
//                double price, String date) {
//        this.bookId = bookId;
//        this.name = name;
//        this.id = id;
//        this.price = price;
//        this.date = date;
//    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void showBook(Book book) {
        System.out.println("最贵的书是：" + book.name);
    }
}
