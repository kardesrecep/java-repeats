package P_10ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist06 {
    public static void main(String[] args) {
        //Kullanicidan bir harf aliniz, harf sizdeki Listin icinde varsa o harfi "bulundu"ya
        //ceviriniz yoksa o harfi liste ekleyin
        // [ A, K,R,S]==> R [A,K, BULUNDU, S]
        // [ A, K,R,S]==> X [A,K, R, S,X]
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String str = scan.next().toUpperCase().substring(0, 1);

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("K");
        list.add("R");
        list.add("S");

        if (list.contains(str)) {
            list.set(list.indexOf(str), "BULUNDU");

        } else {
            list.add(str);
        }
        System.out.println(list);
    }
}
