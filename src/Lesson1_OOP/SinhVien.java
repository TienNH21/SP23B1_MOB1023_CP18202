package Lesson1_OOP;

public class SinhVien extends Nguoi {
    /*
     * SinhVien kế thừa từ class Nguoi
     * (1) SinhVien được thừa hưởng toàn bộ
     *  các thuộc tính và phương thức của lớp cha
     * (2) SinhVien chỉ được truy xuất trực tiếp đến các thuộc tính
     *   KHÔNG PRIVATE của lớp Nguoi.
     * (3) Đối tượng của class con được phép có kiểu của class cha.
     */
    @Override
    public void xuatThongTin()
    {
        System.out.println("Hello Poly");
    }
    
    public void xuatThongTin(int diem)
    {
        System.out.println("Diem: " + diem);
    }
}
