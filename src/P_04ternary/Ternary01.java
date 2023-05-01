package P_04ternary;

public class Ternary01 {
    public static void main(String[] args) {
        //Bir sayinin pozitif mi negatif mi oldugunu ekrana yazdiran koodu yaziniz
        int sayi=12;

      String ternary= sayi >0?"pozitif":"negatif";
        System.out.println(ternary);

        //iki sayidan kucuk olani secen kodu yaziniz

        int sayi1=12;
        int sayi2=23;
       int sonuc= sayi1<sayi2 ? sayi1:sayi2;
        System.out.println(sonuc);

        //verilen bir sayinin  mutlak degerini hesaplayan kodu yaziniz
       // mutlak deger: pozitif sayilarin ve  sifirin mutlak degeri kendisidir, negatif sayilairin
        //mutlak degeri ise -1 ile carpimidir.

        int absNumber=45;

        int absResult= absNumber<0 ? -1*absNumber : absNumber;
        System.out.println(absResult);

        //iki tane sayi ayni isaretli ise bu sayilari carpiniz degilse
        // daha o konulara gelmedik baba diyen kod yaziniz.

        int a=12;
        int b= -2;
//ternary farkli data turlerinde sonuc return ederse sonucun data turunu Object yapmak gerek
    Object r1= (a>0&&b>0) || (a<0&&b<0) ? a*b : "daha o konulara gelmedik baba :)";

        System.out.println(r1);

        }

}
