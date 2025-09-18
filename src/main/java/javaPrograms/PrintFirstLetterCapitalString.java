package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class PrintFirstLetterCapitalString {
    public static void main(String[] args) {
        String name = "my name is shubham";
       String[] word =  name.split(" ");
       StringBuilder sb = new StringBuilder();
       for (String words:word){
           if (!words.isEmpty()){
               sb.append(Character.toUpperCase(words.charAt(0))).append(words.substring(1).toLowerCase()).append(" ");
           }
       }
        System.out.println(sb.toString().trim());

    }
}
