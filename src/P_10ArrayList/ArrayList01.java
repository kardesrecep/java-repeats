package P_10ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //1.yol
        ArrayList<Integer> arrayList = new ArrayList<>();
        //2.yol
        ArrayList<Integer> array = new ArrayList<>();
        //3.yol
        List<String> arrayString = new ArrayList<>();
        //add () methodu elemani her zaman ens sona ekler.
        //insertion order
        arrayString.add("elma");
        arrayString.add("elmas");
        arrayString.add("selma");
        arrayString.add("celma");
        arrayString.add("belma");

        arrayString.add(1, "ceviz");
        System.out.println(arrayString.size());

        List<String> sebze = new ArrayList<>();
        sebze.add("tomat");
        sebze.add("biber");
        sebze.add("kereviz");

        arrayString.addAll(sebze);
        System.out.println("yeni hali: " + arrayString.size());

        //get():istenen indexteki elemani verir
        String el = sebze.get(2);
        System.out.println(el);
        //isempty() boolean deger dondurur ve vize listin bos olup olmadigini gosterir
        //bossa true dolu ise false verir
        boolean control = sebze.isEmpty();
        System.out.println(control);

        //listte eleman degisirme

        sebze.set(1, "armut");
        System.out.println(sebze);

        String[] meyve = {"Elma", "Armut", "Kiraz", "Çilek"};
        //arrayi liste cevirme yontemi

        List<String> arlist = Arrays.asList(meyve);
        System.out.println(arlist);
    // ArrayList nesnesi oluşturma ve arlist nesnesini kullanarak öğelerini kopyalama

        List<String> meyvelist = new ArrayList<>(arlist);
        System.out.println(meyvelist);

        //example-1: nums arrayindeki tum tek sayilari 11 arttirdiktn sonra yazdirin
        int arr[] = {21, 50, 23, 200, 18, 20, 23,1, 185};
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int w:arr) {
            nums.add(w);

        }
        for (int w:nums) {
            if (w%2!=0){
              nums.set(nums.indexOf(w),w+11);
            }
        }
        System.out.println(nums);
        //example-2: nums arrayindeki tum cift sayilari 2 ile carptiktan sonra yazdirin

        int arr2[] = {1, 50, 23, 20, 18, 20, 23,7, 185};
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        for (int i = 0; i <arr2.length ; i++) {
            nums2.add(arr2[i]);
        }
        System.out.println(nums2);
        for (int w:nums2) {
           if (w%2==0){
               nums2.set(nums2.indexOf(w),w*2);
           }
        }

        //eleman silme
        Integer sayi=100;
        nums2.remove(sayi);

        System.out.println(nums2);
    }
}
