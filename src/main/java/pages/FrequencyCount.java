package pages;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args){
        String[] arr  = {"C", "Java", "Java", "Java", "Python", "C"};
        Map<String ,Integer> map = new HashMap<>();
        for (String key :arr){
            if (map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }
            else {
                map.put(key,1);
            }
        }
        for (Map.Entry<String,Integer>entry:map.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+" = "+entry.getValue());
            }
        }
    }
}
