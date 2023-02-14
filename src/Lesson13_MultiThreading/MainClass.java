package Lesson13_MultiThreading;

public class MainClass {
    public static void main(String[] args) {
        // Hau Quan
        // Kê bàn, Lau bảng
        MyRunnable cv1 = new MyRunnable("Kê bàn"),
            cv2 = new MyRunnable("Lau bảng");

        Thread threadHau = new Thread(cv1);
        Thread threadQuan = new Thread(cv2);
        
        threadHau.start();
        threadQuan.start();
    }
}
