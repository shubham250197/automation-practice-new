package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateFirstword {
    public static void main(String[] args) {
        String name = "the name name shubham";
       String[] word= name.split(" ");
       Map<String,Integer>map=new HashMap<>();
       for (String key :word){
           if (map.containsKey(key)){
               System.out.println(key);
               break;
           }
           else {
               map.put(key,1);
           }
       }

    }
}
