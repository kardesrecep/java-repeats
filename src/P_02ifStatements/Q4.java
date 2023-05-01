package P_02ifStatements;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        //kullanici  gun numarasini girsin kod gun ismini yazsin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun kodunu  giriniz");
        int code= scan.nextInt();

        if (code==1){
            System.out.println("pazar");
        } else if (code==2) {
            System.out.println("ptesi");

        } else if (code==3) {
            System.out.println("sali");

        }else {
            System.out.println("gecerli gun nosu giriniz");
        }
    }
}
