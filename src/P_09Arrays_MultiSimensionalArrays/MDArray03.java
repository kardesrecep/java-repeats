package P_09Arrays_MultiSimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MDArray03 {
    public static void main(String[] args) {
        //bir tane md array olusturun ve de sayilarin toplamni yaziniz
        int arr [][]={{2,5,1}, {32,71}, {10}};

        int sum=0;
        for (int[] w:arr) {
            for (int k:w) {
                sum+=k;

            }

        }
        System.out.println(sum);

//ex-2: bir md arrayi normal arraya ceviren kodu yaziniz
        //md eleman sayisni bulmak gerek
        //yeni bir array olusturarak yeni arrayin uzunlugu
        // orjinal arrayin eleman sayisina esit olmali

        int brr [][]={{2,5,1}, {32,71}};

        int toplam=0;

        for (int [] w:brr) {
            toplam+=w.length;
        }

        System.out.println(toplam);

        int index=0;
        int newArr[] =new int[toplam];
        for (int[] w:brr) {
            for (int k:w) {
               newArr[index]=k;
               index++;
            }
        }

        System.out.println(Arrays.toString(newArr));


    }
}
