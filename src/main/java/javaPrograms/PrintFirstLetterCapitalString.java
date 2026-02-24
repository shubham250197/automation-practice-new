package javaPrograms;

import org.checkerframework.checker.index.qual.SubstringIndexBottom;

import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.List;

public class PrintFirstLetterCapitalString {
    public static void main(String[] args){
        String name = "my name is shubham";
       String[] names=  name.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String words:names){
            sb.append(Character.toUpperCase(words.charAt(0))).append(words.substring(1).toLowerCase()).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    }


