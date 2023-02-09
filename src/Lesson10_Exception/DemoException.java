package Lesson10_Exception;

public class DemoException {
    public static void main(String[] args) {
        String[] list = { "123", "456", "Ng Van A", null, "789" };
        //                  0      1        2        3      4 
        for (int i = 0; i < 10; i++) {
            try {
                int j = strToInt(list[i]);
                System.out.println(j);
            } catch (NumberFormatException e) {
                System.out.println("Phải là số");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Ngoài phạm vi truy cập");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Có lỗi xảy ra");
                e.printStackTrace();
            } finally {
                System.out.println("Kết thúc xử lý");
            }
        }
    }
    
    // "-1" -> -1
    public static int strToInt(String s) throws NumberFormatException
    {
        try {
            int i = Integer.parseInt(s);
            return i;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
