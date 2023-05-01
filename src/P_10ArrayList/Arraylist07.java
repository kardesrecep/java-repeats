package P_10ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist07 {
    public static void main(String[] args) {

        //Kullanicidan bir harf aliniz, harf sizdeki Listin icinde varsa o harfi "bulundu"ya
        //ceviriniz yoksa o harfi liste ekleyin
        // [ A, K,R,S]==> R [A,K, BULUNDU, S]
        // [ A, K,R,S]==> X [A,K, R, S,X]
        //hepsi bulununca oyundan ciksin
        Scanner scan = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("K");
        list.add("R");
        list.add("S");


        String str = "";

        do {
            System.out.println("lutfen bir harf giriniz");
            str = scan.next().toUpperCase().substring(0, 1);


            if (list.contains(str)) {
                list.set(list.indexOf(str), "BULUNDU");

            } else if(!str.equals("Q")) {
                list.add(str);
            }
            System.out.println(list);//her bulunani basmak icin
        } while (!str.equals("Q"));
        System.out.println(list);
    }
}



