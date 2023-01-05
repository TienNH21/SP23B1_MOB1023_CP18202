package Lesson2_Interface;

public abstract class Bird implements Animal, ThuCung {
    public abstract void keu();
    
    public void an()
    {
        System.out.println("Sau");
    }
    
    public void diChuyen()
    {
        System.out.println("Bay");
    }
    
    public void cachNuoi()
    {
        System.out.println("Nuoi trong nha.");
    }
}
