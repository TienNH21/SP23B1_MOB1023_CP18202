package Lesson11_IO;

import Lesson2_Lab1.Product;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DemoObjectIOStream {
        public static void main(String[] args) {
        String filename = "demo_object_io.txt";
        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Kết thúc ghi file");
        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Kết thúc đọc file");
    }
    
    public static void ghiFile(String filename)
    {
        File f = new File(filename);
        if (f.exists() == false) {
            System.out.println("File không tồn tại");
            return ;
        }
        
        ArrayList<Product> ds = new ArrayList<>();
        ds.add(new Product("Ao", 100000));
        ds.add(new Product("Quan", 200000));
        
        try {
            // Mở luồng ghi file
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(ds);
            
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
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            ArrayList<Product> ds = (ArrayList<Product>) ois.readObject();
            
            System.out.println("---------");
            for (Product p : ds) {
                System.out.println(p.getName() + "-" + p.getPrice());
            }
            System.out.println("---------");
            
            fis.close();
            System.out.println("Đọc thành công");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
