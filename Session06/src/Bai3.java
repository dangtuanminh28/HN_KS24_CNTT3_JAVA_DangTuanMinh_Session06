class Product {
    private String productID;
    private String productName;
    private double price;

    public Product(String productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.setPrice(price);
    }

    public String getProductID() {
        return productID;
    }
    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String tenSP) {
        this.productName = productName;
    }

    public double getGiaBan() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Mã sản phẩm: " + productID);
            System.out.println("Giá không hợp lệ. Giá phải lớn hơn 0!");
            System.out.println("--------------------------");
        }
    }

    public void displayMenu() {
        System.out.println("Mã: " + productID + " | Tên: " + productName + " | Giá: " + price);
        System.out.println("=========================");
    }
}

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Danh sách sản phẩm:");
        Product product1 = new Product("SP001", "Laptop Dell", 150000);
        Product product2 = new Product("SP002", "Iphone X pro 16", 900000);
        product1.displayMenu();
        product2.displayMenu();

        // Kiểm tra giá ko hợp lệ
        System.out.println("Kiểm tra giá sai:");
        product1.setPrice(-5);
        product2.setPrice(0);

        System.out.println("Kết quả giá sai:");
        product1.displayMenu();
        product2.displayMenu();
    }
}