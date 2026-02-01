class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Sách: " + this.title + " | Tác giả: " + this.author + " | Giá: " + this.price);
    }
}

public class Bai5 {
    public static void main(String[] args) {
        Book b1 = new Book("Lập trình Java", "Tuan Minh", 150000);

        b1.displayInfo();
    }
}