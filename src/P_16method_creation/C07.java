package P_16method_creation;

import java.util.Arrays;

public class C07 {


    //ex-1) x'in degerini y'ye y'nin degerini x'e atan method create ediniz
    public static void swap(int sayilar[]) {
        int temp = sayilar[0];
        sayilar[0]=sayilar[1];
        sayilar[1]=temp;



    }

    public static void main(String[] args) {


        int sayilar[]={2,3};
        System.out.println(Arrays.toString(sayilar));
        C07.swap(sayilar);
        System.out.println(Arrays.toString(sayilar));


    }
}
