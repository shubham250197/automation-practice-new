package pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonListCharacter {
    public static void main(String[] args){
        List<java.lang.Character> list1 = Arrays.asList('a','b','c');
        List<java.lang.Character> list2 = Arrays.asList('b','c');

        List<java.lang.Character> list = new ArrayList<>(list1);
        list.retainAll(list2);
        System.out.println(list);


    }
}
