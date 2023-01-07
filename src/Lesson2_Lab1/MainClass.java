package Lesson2_Lab1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        IProductService prodServ = new ProductService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten SP:");
        String name = sc.nextLine();
        System.out.println("Nhap gia SP:");
        double price = Double.parseDouble(sc.nextLine());
        
        Product p = new Product(name, price);
    }
}
