package P_06loops;

import java.util.Scanner;

public class ForLoops3 {


    public static void main(String[] args) {
  /*
        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();

        int toplam=0;

    for (int i = sayi; i >0 ; i/=10) {
       toplam+= i%10;

      */
       /*
        while (sayi>0) {


            toplam+=sayi%10;
            sayi/=10;

        */

        String ters="";
String str="ey edip adanada pide yeyip gelme kal orda";
        for (int i = str.length()-1; i >=0 ; i--) {
            char c=str.charAt(i);
            ters+=c;
        }
        System.out.println(ters);


    }



    }





