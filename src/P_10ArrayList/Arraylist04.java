package P_10ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Arraylist04 {
    public static void main(String[] args) {
        //verilen listteki elemanlari tekrarsiz yaziniz
        List<Integer> listOrigin=new ArrayList<>();
        listOrigin.add(2);
        listOrigin.add(3);
        listOrigin.add(2);
        listOrigin.add(5);
        listOrigin.add(2);

        List<Integer> newList=new ArrayList<>();
        for (Integer w:listOrigin) {
            if (!newList.contains(w)){
                newList.add(w);
            }
        }
        System.out.println(newList);
    }
}
