package pages;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args){
        String name = "my name Is Shubham Hai";
       String nameNew =  name.toLowerCase();
      char[] nameArr = nameNew.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char key :nameArr){
            if (map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }
            else {
                map.put(key,1);
            }
        }
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+" = "+entry.getValue());
            }
        }
    }
}
