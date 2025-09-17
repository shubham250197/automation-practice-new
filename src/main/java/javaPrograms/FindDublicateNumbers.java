package javaPrograms;

import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.Map;

public class FindDublicateNumbers {
    public static void main(String[] args){
        int[] num = {1,1,2,4,5,7,7,3};
       int numLength =  num.length;
        Map<Integer,Integer>map=new HashMap<>();
        for (int key :num){
            if (map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else {
                map.put(key,1);
            }
        }
        for (Map.Entry<Integer,Integer>entry:map.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+" = "+entry.getValue());
            }
        }
    }

}
