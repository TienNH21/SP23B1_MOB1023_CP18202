package Lesson2_Interface;

public class Cat implements Animal {
    @Override
    public void keu()
    {
        System.out.println("Meow");
    }
    
    @Override
    public void an()
    {
        System.out.println("Chuot");
    }
    
    @Override
    public void diChuyen()
    {
        System.out.println("Chay, nhay");
    }
}
