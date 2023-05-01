package P_09Arrays_MultiSimensionalArrays;

import java.util.Arrays;

public class BinarySearch01 {
    public static void main(String[] args) {
        //binarySearch() Method: Bu methodu kullanarak bir elemanin Arryde olup olmadigini anlariz
        //binarySearch() methodunu kullanmadan once mutlaka "Arrays.sort()" yapmak gerek
        //binarySearch() methodu aradiginiz elemean varsa o elemanin indexini return eder
        //binarySearch() methodu aradiginiz eleman arrayde yoksa - olarak doner (-4) gibi
        //binarySearch() methodu tekrarlayan elemanlar icin kullanilmaz


        int arr[]={12,34,56,14};
        int sayi=56;
        int sayi2=49;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    int index1=    Arrays.binarySearch(arr,sayi);
        System.out.println(index1);
      int index2=  Arrays.binarySearch(arr,sayi2);
        System.out.println("index2 = " + index2);
    }
}
