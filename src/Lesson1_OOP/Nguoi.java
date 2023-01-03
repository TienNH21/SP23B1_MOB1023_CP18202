package Lesson1_OOP;

public class Nguoi {
    private String hoTen;
    private int tuoi;

    public Nguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public Nguoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public void xuatThongTin()
    {
        System.out.println(this.hoTen + " - " + this.tuoi);
    }
}
