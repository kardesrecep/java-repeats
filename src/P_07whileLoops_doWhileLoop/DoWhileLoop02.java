package P_07whileLoops_doWhileLoop;

public class DoWhileLoop02 {

    public static void main(String[] args) {
        int k=12;
        do{

            System.out.println("loppps");
            k++;
        }while (k<=14);

        //ex= Bir ondalik sayinizn ondalik kismndaki rakamlarin toplamini bulunuz

        double sayi=24.5673;


    String str=    String.valueOf(sayi);
    String decimalpart= str.split("\\.")[1];

    int num=Integer.valueOf(decimalpart);
        System.out.println("num "+ num);

        int toplam=0;
        do {

toplam+=num%10;
num/=10;



        }while (num>0);

        System.out.println("rakamlar toplam = " + toplam);

    }

    }

