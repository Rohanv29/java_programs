package Array_List;
//import java.util.ArrayList
// import java.util.Collections;
import java.util.*;

public class Arr_List_01 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        // ArrayList<String>list2=new ArrayList<>();
        // ArrayList<Boolean>list3=new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        //get elements
        int element=list.get(0);
        System.out.println(element);

        //add element in between
        list.add(1,1);
        System.out.println(list);

        //Set element in Array List
        list.set(0,10);
        System.out.println(list);


        //Delete/Remove element
        list.remove(1);
        System.out.println(list);

        //Size
        int size=list.size();
        System.out.println(size);
        //loops 
         for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.print(list);

    }
    
}