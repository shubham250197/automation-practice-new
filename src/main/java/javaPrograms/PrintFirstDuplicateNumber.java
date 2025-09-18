package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class PrintFirstDuplicateNumber {
    public static void main(String[] args){
        int[] num = {1,2,2,3,4};
       int length = num.length;
        Map<Integer,Integer>map=new HashMap<>();
        for (int numArr:num){
            if (map.containsKey(numArr)){
                System.out.println(numArr);
                break;
            }
            else {
                map.put(numArr,1);
            }
        }

    }
}
