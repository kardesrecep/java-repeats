package P_06loops;

public class ForLoops2 {
    public static void main(String[] args) {
        //ex-1: 3 den 6 ya kadar olan sayilarin toplamini bulan kodu yaziniz

        int toplam = 0;
        for (int i = 3; i < 7; i++) {
            toplam += i;


        }

        System.out.println(toplam);

        //ex-2: 6 dan 3 e kadar tam sayilarin carpimini bulun

        int carpim = 1;

        for (int i = 6; i > 2; i--) {
            carpim *= i;

        }
        System.out.println("carpim"+carpim);

        //ex-3: verilen 3 basamakli bir sayinin rakamlari toplamini bulunuz
      /*
        //1.yol
        int num = 867;
        num = Math.abs(num);

        int sonuc = 0;
        for (int i = num; i > 0; i /= 10) {

            sonuc += i % 10;

        }
        System.out.println(sonuc);
        */
        //2.yol

        int num = 867;
        int sonuc=0;

        num=Math.abs(num);

        while (num>0){
            sonuc+=num%10;
            num/=10;

        }
        System.out.println(sonuc);
        //ex-4: verilen stringi ters ceviren kodu yaziniz.

        String input=" Daha yapilacak isler var";

        String ters="";
        for (int i = input.length()-1; i >=0 ; i--) {
            ters+=input.charAt(i);



        }

        System.out.println(ters);



    }
}
