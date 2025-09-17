package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections {
    public static  void  main(String[] args){

        LinkedList<String> list = new LinkedList<>();
        list.add("shiva");
        list.add("Shubhi");
        list.add("juhui");
       Iterator itr =  list.iterator();
       while (itr.hasNext()){
           System.out.println(itr.next());
       }
    }
}
