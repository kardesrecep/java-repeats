package P_01scanner_methodCreations;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Example: kullanicidan isim ve soy isimlerini alip isim ve soyisimlerin ilk harflerini
        //ekrana yazdiran program yaziniz

        //Kerem Cem => KC gibi

        Scanner scan= new Scanner(System.in);
        //1.yol
/*
        System.out.println("isminizi giriniz");
    char ad= scan.next().charAt(0);

        System.out.println("soyisminizi giriniz");
       char soyad=scan.next().charAt(0);

        System.out.println(""+ ad+soyad);

 */
        //2.yol

        System.out.println("Tam isminizi giriniz");
       String tamIsim=scan.nextLine();

       char ilkHarf=tamIsim.charAt(0);
        System.out.println(ilkHarf);

        char soyIsminIlkHarfi=tamIsim.split(" ")[1].charAt(0);


        System.out.println(soyIsminIlkHarfi);







    }
}
