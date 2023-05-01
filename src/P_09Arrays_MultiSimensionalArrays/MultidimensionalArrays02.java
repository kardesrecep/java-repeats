package P_09Arrays_MultiSimensionalArrays;

import java.util.Arrays;

public class MultidimensionalArrays02 {
    public static void main(String[] args) {
        //M.D array olsuturma bicimi
        char arr [][]= { {'a','b'},{'C'},{'v','?'}};
        System.out.println(Arrays.deepToString(arr));

        //ex-Bir string md arrayin icinde "a" olan elemanlari yazdirin
        String str[][]={{"learn","java","it"},{"is","easy"} };

        for (String[] w:str) {
            for (String k:w) {
                if (k.contains("a")){
                    System.out.println(k+ "");
                }

            }


        }
    }
}
