package Bai1;
    class Student {
        String id;
        String name;
        int birth;
        double average;

        public Student(String id, String name, int birth, double average) {
            this.id = id;
            this.name = name;
            this.birth = birth;
            this.average = average;
        }
        public void display() {
            System.out.println("Mã sinh viên: " + id);
            System.out.println("Họ tên: " + name);
            System.out.println("Năm sinh: " + birth);
            System.out.println("Điểm trung bình: " + average);
        }
    }

