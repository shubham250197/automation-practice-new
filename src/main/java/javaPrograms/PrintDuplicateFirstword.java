package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateFirstword {
    public static void main(String[] args){
        String name ="name Name is Shubham shubham";
        String names = name.toLowerCase();
       String[] word =  names.split(" ");
       Map<String,Integer>map=new HashMap<>();
       for (String key :word){
           if (map.containsKey(key)){
               System.out.println(key);
               break;
           }
           map.put(key,1);
       }
       for (Map.Entry<String,Integer>entry:map.entrySet()){
           if (entry.getValue()>1){
               System.out.println(entry.getKey()+"  = "+entry.getValue());
           }
       }
    }

}

