package P_08Arrays;

import java.util.Arrays;

public class ForEachLoop03 {
    public static void main(String[] args) {
        //foreach=>
        int stdAges []=new int[7];
        System.out.println(Arrays.toString(stdAges));

        //arraye eleman ekleme

        stdAges [0]=1;
        stdAges [1]=3;
        stdAges [2]=5;
        stdAges [3]=7;
        stdAges [4]=9;
        stdAges [5]=11;
        stdAges [6]=13;
        int total = 0;
        for (int each : stdAges) {
            total += each;
            // System.out.println("each" + each); donguyu gormek icin

        }

        System.out.println("total = " + total);
        //String array olusturup icine 5 isim yerlestirip isimlerdeki karakter sayilarinin toplamini ekrana yazdirin

        String stdNames[] = new String[5];
        stdNames[0] = "Ali";
        stdNames[1] = "Tom";
        stdNames[2] = "Veli";
        stdNames[3] = "Kemal";
        stdNames[4] = "Cem";

        int karakterToplami = 0;
        for (String w : stdNames) {
            karakterToplami += w.length();

        }
        System.out.println("karakterToplami = " + karakterToplami);

        //char bir array olusturup icine 5 karakter yerlstirip sadece buyuk harfleri  ekrana yazdirin

        char ch[] = {'A', 'c', 'D', 'K', 'm'};
        for (char w : ch) {
            if (w >= 'A' && w <= 'Z') {
                System.out.print(w);

            }
        }
    }
}

