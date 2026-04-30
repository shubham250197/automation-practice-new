package pages;

import rst.pdfbox.layout.shape.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonListElementString {
    public static void main(String[] args){
        List<String> list1 = Arrays.asList("apple","banana","chai");
        List<String> list2 = Arrays.asList("apple");

        List<String>list = new ArrayList<>(list1);
        list.retainAll(list2);
        System.out.println(list);
    }
}
