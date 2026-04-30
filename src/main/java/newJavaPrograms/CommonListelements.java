package newJavaPrograms;

import io.cucumber.java.sl.In;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonListelements {

    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(3,4,5);

        List<Integer> list = new ArrayList<>(list1);
        list.retainAll(list2);
        System.out.println(list);
    }
}
