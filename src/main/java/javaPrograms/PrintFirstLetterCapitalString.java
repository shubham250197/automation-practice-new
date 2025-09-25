package javaPrograms;

import org.checkerframework.checker.index.qual.SubstringIndexBottom;

import java.util.ArrayList;
import java.util.List;

public class PrintFirstLetterCapitalString {
    public static void main(String[] args){
        String name = "my name is shubham";
       String[] names = name.split( " ");
       StringBuilder sb = new StringBuilder();
       for (String word :names){
           sb.append(word.toUpperCase().charAt(0)).append(word.substring(1).toLowerCase()).append(" ");
       }
        System.out.println(sb.toString().trim());
    }
}

