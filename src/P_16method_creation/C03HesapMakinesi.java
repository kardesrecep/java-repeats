package P_16method_creation;

import java.util.Scanner;

public class C03HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, sonuc;
        char operator;

        System.out.println("İşlem yapmak istediğiniz sayıları ve operatörü giriniz:");
        sayi1 = input.nextInt();
        sayi2 = input.nextInt();
        operator = input.next().charAt(0);
        switch (operator) {
            case '+' -> {
                sonuc = topla(sayi1, sayi2);
                System.out.println(sayi1 + " + " + sayi2 + " = " + sonuc);
            }
            case '-' -> {
                sonuc = cikar(sayi1, sayi2);
                System.out.println(sayi1 + " - " + sayi2 + " = " + sonuc);
            }
            case '*' -> {
                sonuc = carp(sayi1, sayi2);
                System.out.println(sayi1 + " * " + sayi2 + " = " + sonuc);
            }
            case '/' -> {
                sonuc = bol(sayi1, sayi2);
                System.out.println(sayi1 + " / " + sayi2 + " = " + sonuc);
            }
            default -> System.out.println("Hatalı giriş yaptınız!");
        }

    }

    public static int topla(int x, int y){

        return x+y;
    }
    public static int cikar(int x, int y){

        return x-y;
    }
    public static int carp(int x, int y){

        return x*y;
    }
    public static int bol(int x, int y){

        return x/y;
    }
    public static double karekokAl(double x){

        return  Math.sqrt(x);
    }

    public static double kareAl(double x){

        return Math.pow(x,2);
    }
}
