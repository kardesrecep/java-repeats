package P_02ifStatements;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        /*
        kullanicidan yasa degerini alainiz ve hangi evrede oldugunu tabloya gore yazdirin
        0-4=>baby
        5-12=>child
        13-20=>teenager
        21-30=>adult
        //else(not expected)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas<0){
            System.out.println("gecerli yas giriniz");

        } else if (yas<=4) {
            System.out.println("baby");
            
        } else if (yas<=12) {
            System.out.println("child");
            
        } else if (yas<=20) {
            System.out.println("teenager");

        } else if (yas<=30) {
            System.out.println("adult");

        }else {
            System.out.println("not expected");
        }
    }
}
