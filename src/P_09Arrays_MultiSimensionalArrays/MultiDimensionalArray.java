package P_09Arrays_MultiSimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //bir arrayin elemanlari array ise bu arrayler"MD" arraylardir
        int arr[][] = new int[3][2];
        arr[1][0] = 6;
        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;
        System.out.println(Arrays.deepToString(arr));
        //md arraylerde array elementlerinden birini yazdirma
        System.out.println(Arrays.toString(arr[1]));
        //md arraylerde icteki elemani yazdirma
        System.out.println(arr[0][1]);
//ex-1:String bir md array olusturun eleman ekleyin ve de toplam eleman sayisini ekrana yazdirin
        String str[][]=new String[4][3];
        str[0][0]="a";
        str[0][1]="b";
        str[0][2]="c";

        str[1][0]="s";
        str[1][1]="x";
        str[1][2]="b";

        str[2][0]="k";
        str[2][1]="l";
        str[2][2]="v";

        str[3][0]="j";
        str[3][1]="m";
        str[3][2]="r";

        System.out.println("md array: "+ Arrays.deepToString(str));
        int sum=0;
        for (String[] w:str) {
            sum+=w.length;

        }

        System.out.println(sum);

    }
}
