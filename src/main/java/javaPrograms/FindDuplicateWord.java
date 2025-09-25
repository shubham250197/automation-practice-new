package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWord {
    public static void main(String[] args){
        String name ="name Name is Shubham Shubham";
       String name1 = name.toLowerCase();
       String[] names =  name1.split(" ");
       Map<String,Integer>map=new HashMap<>();
       for (String key:names){
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

