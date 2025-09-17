package pages;


import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {
    public static void main(String[] args){
        String name = "my My name Name Shiv";
      String names = name.toLowerCase();
      String[] nameArr = names.split(" ");

        Map<String,Integer>map=new HashMap<>();
        for (String key :nameArr){
            if (map.containsKey(key)){
                map.put(key,map.get(key)+1);
                }
            else {
                map.put(key,1);
            }
        }
        for (Map.Entry<String,Integer> entry :map.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+" = "+entry.getValue());
            }
        }
    }
}
