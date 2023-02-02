package Lesson8_Collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("nokia", 3000);
        m.put("samsung", 9000);
        m.put("oppo", 5000);
        m.put("ip", 15000);
        m.put("xiaomi", 2000);
        
        // System.out.println(m);
        
        for (String key: m.keySet()) {
            Integer value = m.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
