package javaPrograms;

import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.Map;

public class FindDublicateNumbers {
    public static void main(String[] args){
        int[] num ={1,1,2,4,2,4,4,4};
       int length = num.length;
       Map<Integer,Integer>map=new HashMap<>();
       for (int numArr :num){
           if (map.containsKey(numArr)){
               map.put(numArr,map.get(numArr)+1);
           }
           else {
               map.put(numArr,1);
           }
       }
       for (Map.Entry<Integer,Integer>entry:map.entrySet()){
           if (entry.getValue()>1){
               System.out.println(entry.getKey()+" = "+entry.getValue());
           }
       }
    }
}




