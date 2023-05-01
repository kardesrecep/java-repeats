package P_07whileLoops_doWhileLoop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //ex:  3-10 arasi sayilari yazdirin
        int sayi = 3;
        while (sayi <= 10) {
            System.out.println(sayi);
            sayi++;
        }

        //ex= 17-4 ekadar tum cift sayilari yazdir
        int i = 17;
        while (i >= 4) {
            if (i % 2 == 0) {

                System.out.println(i + "");
            }
            i--;

        }
        //ex=12-67 e kadar sayilarin toplamini yaziniz
        int sum = 0;
        int num1 = 12;
        while (num1 <= 67) {
            sum += num1;

            num1++;
        }
        System.out.println(sum);


        //ex: size verilen tamsayinin rakamlari toplamni bulunuz
        int toplam = 0;
        int sayi2 =912;
        while (sayi2>0){
            toplam+=sayi2%10;
            sayi2/=10;

        }
        System.out.println("toplam = " + toplam);

        //ex: kullancidan alina sayinin carpim tablosunu ekrana yazdirin
        System.out.println("sayi girjniz");
        int sayii= scan.nextInt();

        int n=1;
        while (n<=10){
            System.out.println(sayii+ "X"+ n+"="+ sayii*n);

            n++;
        }
        //bir ondalik sayinin ondalik kismindaki rakamlar toplaminni bulun
        double num=24.5675;
       // String.valueOf() methodu parantezin icine konan datayi String yapar
        //Rgex icin  nokta kullandigimizda onune "\\" koyun.
        String str=String.valueOf(num);
     String decimalData=  str.split("\\.")[1];
    int decimalInt= Integer.valueOf(decimalData);
    int total=0;

    do {
        total+=decimalInt%10;
        decimalInt/=10;

    }while(decimalInt>0);
        System.out.println("total = " + total);

    }









    }



