package P_02ifStatements;

import java.util.Scanner;

public class IfElse01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Sayi pozitif ise ekrana pozitif yazdirin
        //Negatif ise negatif yazdirin
/*
        int sayi=-13;
        if (sayi>0){
            System.out.println("pozitif");

        }
        if (sayi<0){
            System.out.println("negatif");

        }


 */

        //example-2: Verilen Character kucuk harf ise ekrana kucuk harf yazdirin
/*
 char ch= 's';
 if (ch>='a'&& ch<'z'){
     System.out.println("kucuk harf");

 }

 */
        //example-3: Verilen Character buyuk harf ise ekrana Buyuk Harf  degil ise
        //  kucuk harf yazdirin
/*
        char ch='S';
        if (ch>='A'&& ch<='Z'){
            System.out.println("Buyuk Harf");

        }else {
            System.out.println("kucuk harf");
        }


 */

        /*
        example4:verilen bir sayi 3 basamakli ise ekrana usc basamakli yazdirin degilse
        lutfen 3 basamakli bir sayi giriniz yazdiirn



        System.out.println(" bir sayi giriniz");
        int sayi= scan.nextInt();
        sayi=Math.abs(sayi);// mutlak degerini aldim
       //verilecek olan negatif sayiyi onlemis oldum
         if (sayi>99&&sayi<1000){
             System.out.println("sayi 3 basamakli " );

         }else {
             System.out.println(" lutfen 3 basamakli bir sayi giriniz");
         }

         */

        /*
        example-5
        verilen bir sayi cift sayi ise ekrana cift degilse tek sayi yazdirin


        System.out.println(" bir sayi giriniz");
        int sayi= scan.nextInt();

        sayi=Math.abs(sayi);//mutlak deger

        if (sayi%2==0){
            System.out.println("sayi cift sayidir");

        }else {
            System.out.println("sayi tek sayidir");
        }

         */

        /*
        example-6:Verilen bir sayi 300den buyuk veya 1200den kucuk ise ekrana "Harika sayi " yazdirin
         */
        System.out.println(" bir sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi>300||sayi<1200){
            System.out.println("Harika Sayi");

        }else
            System.out.println("harika sayi degil");
    }
}
