package P_16method_creation;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        C02 m1= new C02();
        m1.selam();

        C02 m2=new C02();



        Scanner input=new Scanner(System.in);
        System.out.println("x ve y icin degerler giriniz");
        //Kullanicidan deger aldik
        int sonuc=m2.carp(input.nextInt(),input.nextInt());

        System.out.println(sonuc);




    }

public int carp(int x, int y){
        int carp=x*y;

        return carp;
}

    public static void selam(){
        System.out.println("selamlar ");
    }
}
