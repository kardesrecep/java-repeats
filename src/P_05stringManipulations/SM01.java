package P_05stringManipulations;

import java.util.Scanner;

public class SM01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Example: kullanicadan aldigimiz kelimenin ilk ve son harfini ekrana yazdirin
        //Philips =>Ps

        System.out.println("Isim ve soyisminizi giriniz");
        String str2= scan.nextLine();
      /*  1.way
        char illkHarf= str.charAt(0);
        char sonHarf= str.charAt(str.length()-1);
        System.out.println("-"+illkHarf+sonHarf );


        //2.way
     String ilkHarf=   str.substring(0,1);
     String sonHarf=str.substring(str.length()-1);
        System.out.println(ilkHarf+sonHarf);

       */

        /*
        Ex-2:Verilen Stringdeki sadece hayvan isimlerini ekrana yazzdiriniz
        ==> "Ben kedi esim tavuk oglum papagan sever"
         */
        String str1="Ben kedi, esim tavuk, oglum papagan sever";

    String kedi=    str1.substring(4,8);
    String  tavuk= str1.substring(15,20);
    String papagan= str1.substring(28,35);

        System.out.println(kedi+"-"+tavuk+"-"+papagan);
        //ex-3: Isim ve soy ismi iceren isimlerden isim ve soyisimlerin bas harflerini ekrana yazdirin
        //Ali Can ===> A-C
     String a=   str2.substring(0,1);
    String b= str2.split(" ")[1].substring(0,1);
        System.out.println(a+b);


    }

}
