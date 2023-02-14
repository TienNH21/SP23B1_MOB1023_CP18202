package Lesson13_MultiThreading;

public class MyRunnable implements Runnable {
    private String name;
    public MyRunnable(String n)
    {
        this.name = n;
    }

    @Override
    public void run() {
        System.out.println(this.name);
        try {
            // Ngủ 3s
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(this.name + " done");
    }
    
}
