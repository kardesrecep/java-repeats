package P_09Arrays_MultiSimensionalArrays;

public class MD04 {
    public static void main(String[] args) {
        //bir md arraydaki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz

        int arr [][]={{2,5,1}, {32,71}};
        int maxEl=arr[0][0];
        int minEl=arr[0][0];
        for(int[] w:arr){
            for (int k:w) {
                maxEl=Math.max(maxEl,k);
                minEl=Math.min(minEl,k);
            }
        }
        System.out.println("sonuc: "+ (maxEl+minEl));

    }





}
