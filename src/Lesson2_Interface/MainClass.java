package Lesson2_Interface;

public class MainClass {
    public static void main(String[] args) {
//        Animal c; // Khai báo biến c có kiểu Cat
//        c = new Cat(); // Khởi tạo đối tượng có kiểu Cat
//        c.an();
//        c.keu();
//        c.diChuyen();

        Animal tc = new ChimSau();
        ((ThuCung) tc).cachNuoi();
    }
}
