package sp23b1_mob1023_cp18202;

import Lesson1_OOP.Nguoi;
import Lesson1_OOP.SinhVien;

public class SP23B1_MOB1023_CP18202 {

    public static void main(String[] args) {
//        Nguoi n = new Nguoi();
//        n.setHoTen("Ng Van A");
//        n.setTuoi(20);

        SinhVien sv; // biến SV có kiểu Nguoi
        sv = new SinhVien(); // tạo ra đối tượng có kiểu SinhVien
        sv.setHoTen("Ng Van A");
        sv.setTuoi(20);
        sv.xuatThongTin();
        sv.xuatThongTin(9);
    }
}
