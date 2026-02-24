package programJ;

import java.util.HashMap;
import java.util.Map;

public class ProgramOfJava {
    // string = "abc";
    public static void main(String[] args){
        String name = "abc";
       String names = name.toLowerCase();
        System.out.println(names);
        char[] namearr = name.toCharArray();
        System.out.println(namearr);
        StringBuilder sb = new StringBuilder(name);
        sb.append("def");
        sb.reverse();
        System.out.println(sb);
        String word = "my my name is shubham";
        // dupliucate words and count with help of map

       String[] words =  word.split(" ");
        Map<String,Integer>map=new HashMap<>();
        for (String key :words){
            if (map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }
            else {
                map.put(key,1);
            }
        }
        for (Map.Entry<String,Integer>entry:map.entrySet()){
            if (entry.getValue()>1){

            }
        }

    }
}
