package Lesson2_Interface;

public interface Animal {
    /*
     * Interface chỉ khai báo các hàm,
        KHÔNG có định nghĩa thân hàm cụ thể
     * Các Class thực thi (implements) Interface sẽ phải triển khai
        toàn bộ các hàm được khai báo trong Interface
     * Khi Class thực thi (implements) Interface, đối tượng của Class
        được phép có kiểu của Interface
     */
    public void keu();
    public void an();
    public void diChuyen();
}
