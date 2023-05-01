package P_09Arrays_MultiSimensionalArrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //ex-1: Bir stringdeki sesli harflerin sayisini bulan kodlari yaziniz

        String str= "Hayat sevince guzel, yasamak ne mutlu sey";
     str=   str.toLowerCase();
       String harfler[] = str.split("");
       int counter=0;
        System.out.println(Arrays.toString(harfler));
        for (String w:harfler) {
            switch (w){
                case "a":
                case "e":
                case "o":
                case "u":
                case "i":
                    counter++;

            }
        }
        System.out.println(counter);
    }
}
