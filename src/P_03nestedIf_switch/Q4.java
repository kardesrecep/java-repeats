package P_03nestedIf_switch;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {



        /*
  ****Not= Switchde sadece int, byte, short, char, string, data turleri kullanilabilir***


        kullanicidan islem ve iki sayi alarak islemin sonucunu
         ekrana yazdiran bir hesap makinesi yapiniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Islemi giriniz: +,-,*,/,%");
        char islem = input.next().charAt(0);


        System.out.println("Ilk sayiyi giriniz");
        double ilkSayi = input.nextDouble();

        System.out.println("Ikinci sayiyi giriniz");
        double ikinciSayi = input.nextDouble();


        switch (islem) {
            case '+':
                System.out.println(ilkSayi + ikinciSayi);
                break;
            case '-':
                System.out.println(ilkSayi - ikinciSayi);
                break;
            case '*':
                System.out.println(ilkSayi * ikinciSayi);
                break;
            case '/':
                System.out.println(ilkSayi / ikinciSayi);
                break;
            case '%':
                System.out.println((ilkSayi * ikinciSayi)/100);
                break;
            default:
                System.out.println("Bu islem tanimlanmamistir");


        }

    }
}