package P_02ifStatements;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {


        //Orn1 kullanicidan alinan sayinin tek mi cift mi oldugunuu yazdiran program yaznz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        if(sayi%2!=0){
            System.out.println("sayi tek syi");

        }else {
            System.out.println("sayi cift");
        }
    }
}
