package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String name = "Namename Shubhshubham";
        name.toLowerCase();
        name.split(" ");
       char[] names =  name.toCharArray();
       Map<Character,Integer>map=new HashMap<>();
       for (char key :names){
           if (map.containsKey(key)){
               map.put(key,map.get(key)+1);
           }
           else {
               map.put(key,1);
           }
       }
       for (Map.Entry<Character,Integer>entry:map.entrySet()){
           if (entry.getValue()>1){
               System.out.println(entry.getKey()+" "+entry.getValue());
           }
       }

    }
}
