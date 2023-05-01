package P_02ifStatements;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        //kullanicidan gun ismlerini alip o gunun hafta ici mi
        // haftasonu mu oldugunu kullaniciya soyleyiniz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunAdi = scan.nextLine().toLowerCase();//equalsIgnoreCase de kullanabiliriz
        if (gunAdi.equals("pazartesi")) {
            System.out.println("haftaici");

        }
        if (gunAdi.equals("sali")) {
            System.out.println("haftaici");

        }
        if (gunAdi.equals("carsamba")) {
            System.out.println("haftaici");

        }
        if (gunAdi.equals("persembe")) {
            System.out.println("haftaici");

        }
        if (gunAdi.equals("cuma")) {
            System.out.println("haftaici");

        } else if (gunAdi.equals("cumartesi")) {
            System.out.println("haftasonu");

        } else if (gunAdi.equals("pazar")) {
            System.out.println("haftasonu");

        } else {
            System.out.println("gecerli gun ismi girniz");
        }

        //2.yol

        if (gunAdi.equalsIgnoreCase("pazartesi") ||
                gunAdi.equalsIgnoreCase("sali") ||
                gunAdi.equalsIgnoreCase("carsamba") ||
                gunAdi.equalsIgnoreCase("persembe") ||
                gunAdi.equalsIgnoreCase("cuma")) {
            System.out.println("haftaici..");

        } else if (gunAdi.equalsIgnoreCase("cumartesi") ||
                gunAdi.equalsIgnoreCase("pazar")) {
            System.out.println("haftasonu");

        }
        //3.yol
        boolean haftaIci=   gunAdi.equalsIgnoreCase("pazartesi") ||
                            gunAdi.equalsIgnoreCase("sali") ||
                            gunAdi.equalsIgnoreCase("carsamba") ||
                            gunAdi.equalsIgnoreCase("persembe") ||
                            gunAdi.equalsIgnoreCase("cuma");

        boolean haftaSonu=  gunAdi.equalsIgnoreCase("cumartesi") ||
                            gunAdi.equalsIgnoreCase("pazar");
        if (haftaSonu){
            System.out.println("haftasonu");
        } else if (haftaIci) {
            System.out.println("haftaici");

        }else {
            System.out.println("gecerli gun giriniz");
        }
    }
}
