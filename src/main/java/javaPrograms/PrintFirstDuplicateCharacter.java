package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class PrintFirstDuplicateCharacter {
    public static void main(String[] args){
        String name = "aabcdde";
       char[] word=  name.toCharArray();
        Map<Character,Integer>map=new HashMap<>();
        for (char key:word){
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
