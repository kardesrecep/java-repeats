package P_09Arrays_MultiSimensionalArrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //ex-1 verilen pozitif ve negatif sayilar iceren bir integer arraydeki
        // "en buyuk negatif
        // "en kucuk pozitif elemani bulunuz"

        int arr[] = {-12, 18, -5, 23, -2, 0};
        Arrays.sort(arr);
        int maxNegative = arr[0];
        int minPositive = arr[arr.length - 1];
        for (int w : arr) {
            if (w < 0) {
                maxNegative = Math.max(maxNegative, w);
            }
            if (w > 0) {
                minPositive = Math.min(minPositive, w);
            }

        }
        System.out.println("maxNegative :" + maxNegative + " and "+ "minPositive :" + minPositive );
    }
}
