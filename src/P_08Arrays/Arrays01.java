package P_08Arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int stdAges []=new int[7];
        System.out.println(Arrays.toString(stdAges));

        //arraye eleman ekleme

        stdAges [0]=1;
        stdAges [1]=3;
        stdAges [2]=5;
        stdAges [3]=7;
        stdAges [4]=9;
        stdAges [5]=11;
        stdAges [6]=13;

        System.out.println(Arrays.toString(stdAges));
        System.out.println(stdAges[4]);
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

        int ilk=stdAges[0];
        //length()stringlerde
        //length[] arraylerde
        int son=stdAges[stdAges.length-1];
        System.out.println(ilk+son);

        //ex-stdAges arrayi icindeki elemanlarin toplamini ekrana yazdiran kodu yaziniz
        int sum=0;
     for(int i=0; i<stdAges.length;i++){
         sum+=stdAges[i];

     }
        System.out.println(sum);
     int sum2=0;
     int i=0;
     while (i<stdAges.length){
         sum2+=stdAges[i];
         i++;


     }
        System.out.println("sum2 = " + sum2);

     int toplam=0;
     int k=0;
     do {
         toplam+=stdAges[k];
         k++;
     }while (k< stdAges.length);

        System.out.println(toplam);

            
        }


    }

