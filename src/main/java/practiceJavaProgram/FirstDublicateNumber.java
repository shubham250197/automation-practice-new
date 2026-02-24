package practiceJavaProgram;

import java.util.HashMap;
import java.util.Map;

public class FirstDublicateNumber {
    public static void main(String[] args) {
        int[] num = {1, 2, 2, 3, 3, 4};
        int numLength = num.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int key : num) {
            if (map.containsKey(key)) {
                System.out.println(key);
                break;
            } else {
                map.put(key, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}
