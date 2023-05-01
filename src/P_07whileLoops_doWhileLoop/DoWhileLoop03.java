package P_07whileLoops_doWhileLoop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
        //kullanicidan sayi aliniz sayi 100den kucuk ise ekrana kazandin
        //aksi halde ekrana kaybettin yazdirin
        //kullanici kazandikca oyun devam etmeli
        Scanner input = new Scanner(System.in);

//        int sayi = 0;
//        do {
//            System.out.println("bir sayi giriniz");
//            sayi = input.nextInt();
//            if (sayi < 100) {
//                System.out.println("kazandiniz");
//            }
//
//        } while (sayi<100);
//        System.out.println("kaybettiniz");

        //ex-2 kullanicidan isimler aliniz ilk harfi buyuk olup olmadigini kontrol ediniz
        do {
            System.out.println("isim giriniz");
            char ilkHarf=input.next().charAt(0);
            if (ilkHarf>='A'&& ilkHarf<='Z'){
                System.out.println("ismi basariyla girdiniz");

            }else{
                System.out.println("ismi yanlis girdiginiz icin islem iptal " +
                        "edildi lutfen isminizi dogru giriniz");
                break;
            }


        }while (true);

        /*
        //infinite loop sorunsali
        //1
        for (int i = 1; i <4 ; i--) {
            System.out.println("infinite loop sorunsali");

        }
        //2
        for (int i = 1; i <4 ; ) {
            System.out.println("infinite loop sorunsali");

        }
int i=12;
        while (i<15){
            System.out.println("infinite loop sorunsali");
        }

         */



    }




}
