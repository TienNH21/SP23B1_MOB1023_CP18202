package Lesson11_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DemoFileIOStream {
    public static void main(String[] args) {
        String filename = "demo_file_io.txt";
        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Kết thúc ghi file");
        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Kết thúc đọc file");
    }
    
    public static void ghiFile(String filename)
    {
        String s = "Hello CP18202";
        File f = new File(filename);
        if (f.exists() == false) {
            System.out.println("File không tồn tại");
            return ;
        }
        
        try {
            // Mở luồng ghi file
            FileOutputStream fos = new FileOutputStream(f);
            byte[] b = s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Ghi thành công");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void docFile(String filename)
    {
        File f = new File(filename);
        if (f.exists() == false) {
            System.out.println("File không tồn tại");
            return ;
        }
        
        try {
            // Mở luồng đọc file
            FileInputStream fis = new FileInputStream(f);
            while (true) {
                int i = fis.read();
                if (i == -1) {
                    break;
                }

                char c = (char) i;
                System.out.print(c);
            }

            System.out.println("");            
            fis.close();
            System.out.println("Đọc thành công");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
