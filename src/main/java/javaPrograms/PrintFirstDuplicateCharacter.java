package javaPrograms;

import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.Map;

public class PrintFirstDuplicateCharacter {
    public static void main(String[] args){
        String name = "aabbbcd";
      char[] names = name.toCharArray();
      Map<Character,Integer>map=new HashMap<>();
      for (char key:names){
          if (map.containsKey(key)){
              System.out.println(key);
              break;
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
