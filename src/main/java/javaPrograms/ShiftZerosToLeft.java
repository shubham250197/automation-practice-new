package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class ShiftZerosToLeft {
    public static void main(String[] args){
        int[] num = {1,0,1,0,1,0};
       int length = num.length;
       int zeros=0;
       List<Integer>list=new ArrayList<>();
       for (int i =0;i<length;i++){
           if (num[i]!=0){
               list.add(num[i]);
           }
           else {
               zeros++;
           }
       }
       for (int i=0;i<zeros;i++){
           list.add(0,0);
       }
        System.out.println(list);
    }
}
