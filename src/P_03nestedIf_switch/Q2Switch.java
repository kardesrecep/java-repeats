package P_03nestedIf_switch;

import java.util.Scanner;

public class Q2Switch {
    public static void main(String[] args) {
        /*
        Kullanicidan  gun sayisini alinin ve gun isminini ekrana yazdiriniz
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Gun numarasini giriniz");
        byte gunNo=input.nextByte();

        switch (gunNo){
                case 1:
                System.out.println("pazar");
                break;
                 case 2:
                System.out.println("pazartesi");
                break;
                 case 3:
                System.out.println("sali");
                break;
                 case 4:
                System.out.println("carsamba");
                break;
                 case 5:
                System.out.println("persembe");
                break;
                 case 6:
                System.out.println("cuma");
                break;
                 case 7:
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("gecerli gun yaziniz");


        }



    }
}
