package Bai1;
public class Main {
    public static void main(String[] args) {
        Student Student1 = new Student("PTIT001", "Dang Tuan Minh", 2006, 8.5);
        Student Student2 = new Student("PTIT002", "Nguyen Van A", 2005, 7.2);

        System.out.println("Kết quả:");
        Student1.display();
        Student2.display();
    }
}