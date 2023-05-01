package P_08Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysForEachLoop02 {
    public static void main(String[] args) {
        //string arraydeki "Tom ve "Tomdan" onceki elemanlari yazdirin

        String arr[] = {"Jane", "Mark", "Hamza", "Tom", "Rosa", "Zeynep"};
        for (String w : arr) {
            System.out.println(w + " ");

            if (w.equals("Tom")) {
                break;

            }
            //string arraydeki "Tom ve "jane" haric tum  elemanlari yazdirin

        }
        String arr2[] = {"Jane", "Mark", "Hamza", "Tom", "Rosa", "Zeynep"};
        for (String w : arr2) {

            if (w.equals("Tom") || w.equals("Jane")) {
                continue;

            }
            System.out.println(w + " haric olanlar");

        }
        //example-3 ogretmenin sinifindaki ogrencilerin isimlerini
        // applicationa yuklenmesini saglayan kodu yaziniz
        //(kullanici ile beraber bir Array olusturun icine data ekleyin)

        Scanner input=new Scanner(System.in);
        System.out.println("kac ogrenci ismi gireceksiniz");
        int numsOfStd=input.nextInt();
        System.out.println("girisi sonlandirmak icin Q harfine basiniz.");
        String names[]=new String[numsOfStd];
        for (int i = 1; i <=numsOfStd ; i++) {
            System.out.println("lutfen "+ i+ ". ogrencinin ismini giriniz");

            String stdName= input.next();
            if (stdName.equalsIgnoreCase("Q")){
                break;

            }
            names[i-1]=stdName;

        }
        System.out.println(Arrays.toString(names));


    }
}
