package P_02ifStatements;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //kullanicidaan alinan sayinin negatif,pozitif veya notr oldugnu soyleyen kodu yaziniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi>0){
            System.out.println("pozitif");

        } else if (sayi==0) {
            System.out.println("notr");

        }else {
            System.out.println("negatif");
        }
    }
}
