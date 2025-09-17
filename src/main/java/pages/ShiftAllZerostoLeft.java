package pages;

import java.util.ArrayList;
import java.util.List;

public class ShiftAllZerostoLeft {
    public static void main(String[] args){
        int[] sum = {1,0,2,0,3,0};
        int zeros = 0;
       int length =  sum.length;
        List list= new ArrayList<>();
        for (int i =0;i<length;i++){
            if (sum[i]!=0){
                list.add(sum[i]);
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
