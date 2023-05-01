package P_03nestedIf_switch;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /*
        Kullanciya ay ismini sorunuz ve kullancinin verdigi ay isminden son aya kadar ekrana yazdirin
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismini giriniz");
        String ayAdi = input.next().toLowerCase();

        switch (ayAdi) {
            case "ocak":
                System.out.println("Ocak");

            case "subat":
                System.out.println("Subat");

            case "mart":
                System.out.println("Mart");

            case "nisan":
                System.out.println("Nisan");

            case "mayis":
                System.out.println("Mayis");

            case "haziran":
                System.out.println("Haziran");

            case "temmuz":
                System.out.println("Temmuz");

            case "agustos":
                System.out.println("Agustos");

            case "eylul":
                System.out.println("Eylul");

            case "ekim":
                System.out.println("Ekim");

            case "kasim":
                System.out.println("Kasim");

            case "aralik":
                System.out.println("Aralik");
                break;

            default:
                System.out.println("gecerli ay adi yaziniz");


        }

    }
}
