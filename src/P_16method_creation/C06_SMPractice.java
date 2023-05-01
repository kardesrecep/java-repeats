package P_16method_creation;

import java.util.Arrays;

public class C06_SMPractice {

    public static void main(String[] args) {
        boolean majority = C06_SMPractice.majority(true, false, false);
        System.out.println("majority = " + majority);

        int x[] = {1, 2, 3};
        int y[] = {1, 6, 3};
        System.out.println(C06_SMPractice.eq(x, y));

        System.out.println("C06_SMPractice.cube(3) = " + C06_SMPractice.cube(3));

        int arr[] = {2, 3, 4, 5};
        int toplamSonuc = C06_SMPractice.add(arr);
        System.out.println(toplamSonuc);

int sonucCiftler []=  C06_SMPractice.ciftSayilar(new int[]{1,2,3,4,5,6,7,8,9,0} );
        System.out.println("sonucCiftler = " + Arrays.toString(sonucCiftler));

    }


    // iki degisken tru ise true
    //2 den az ise false donduren method yaziniz
    public static boolean majority(boolean x, boolean y, boolean z) {

        return (x && y) || (x && z) || (y && z);

    }

    // x ve y elemanlarinin boyutlarini ve icindekilerini karsilastiran methodu yaziniz
    public static boolean eq(int[] x, int[] y) {

        boolean result = true;

        if (x.length == y.length) {
            for (int i = 0; i < x.length; i++) {
                if (x[i] != y[i]) {
                    result = false;
                    break;
                }
            }

        } else {
            result = false;
        }

        return result;
    }

    public static int cube(int x) {
        return x * x * x;
    }

    public static int add(int[] x) {

        int result = 0;

        for (int i = 0; i < x.length; i++) {

            result += x[i];

        }


        return result;
    }

    public static int[] ciftSayilar(int x[]) {
        int sonuc[] = null;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                count++;

            }

        }
        sonuc = new int[count];
        int index=0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                sonuc[index++] = x[i];
            }
        }
        return sonuc;
    }
}
