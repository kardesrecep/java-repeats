package P_18Oop.class_and_objects;

import P_18Oop.class_and_objects.Circle;

public class Driver {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.r = 3;
/*
Abstraction: classin ic detaylarina hakim olmadan disaridan bir kullanim
ile sinif icindeki
methodlari cagirarak istenilen islemlerin yerine getirilmei gerceklesir
 */

        System.out.println(circle.x);
        System.out.println(circle.y);
        System.out.println(circle.r);

        double alan = circle.alanHesapla();
        double cevre = circle.cevreHesapla();

        System.out.println(alan);
        System.out.println(cevre);
        //classlar tekrardan kullanilabilen code parcaciklaridir
Circle circle2=new Circle();
circle2.r=30;
        System.out.println(circle2.alanHesapla());
        System.out.println(circle2.cevreHesapla());

        Circle circle3= circle2; //bellekte ayni yeri gosterdikleri
        // icin circle2 ve circle3 un degeri aynidir
        circle3.r=40;




    }
}
