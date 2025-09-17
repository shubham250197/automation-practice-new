package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWord {
    public static void main(String[] args){
        String name = "My my name name is Shubham";
       String names=  name.toLowerCase();
       String[] namesArr = names.split(" ");
        Map<String,Integer>map=new HashMap<>();
        for (String key:namesArr){
            if (map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }
            else {
                map.put(key,1);
            }
        }
        for (Map.Entry<String,Integer>entry:map.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+" ="+entry.getValue());
            }
        }


    }


}
