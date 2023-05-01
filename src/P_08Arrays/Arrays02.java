package P_08Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {
        //example 1: [0,2,3,0,12,0] sifirlari en sona koyunuz

        int original[] = {0, 2, 3, 0, 12, 0};
        int newArr[] = new int[original.length];
        int container = 0;
        for (int i = 0; i < original.length; i++) {
            if (original[i] != 0) {
                newArr[container] = original[i];
                container++;
            }

        }
        System.out.println(Arrays.toString(newArr));

        //example-2: Bir arrayin icinde herhangi bir eleman olup olmadigini
        // kntrol eden ve kac kere tekrarlandigini gosteren kod yaziniz

        int arr[] = {2, 1, 2, -3, 5, 2};
        int elaman = 2;
        int flag = 0;//counter da /// Bazi durumlarin olup olmadigini kontrol etmek icin flag kullanilir
        for (int w : arr) {
            if (w == elaman) {
                flag++;

            }
        }
        if (flag > 0) {
            System.out.println(elaman + " arrayde " + flag + " defa vardir");
        } else {
            System.out.println(elaman + " array'de yok");
        }

        //example-3: verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
        // "Selam sana ey guzel dostum"==>dostum

        String sentence = "Selam sana ey guzel dostum.";
        System.out.println(sentence);
        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        String words[] = sentence.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-1]);//son elementi almak icn 
    }
}
