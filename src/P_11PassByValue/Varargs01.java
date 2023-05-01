package P_11PassByValue;

public class Varargs01 {
    public static void main(String[] args) {

        /*
    1)Farkli sayilardaki parametrelerie calisabilen bir method
     olusturmak isterseniz "varargs" kullanmolisiniz.
     2) "varargs" arka tarafta "array" kullanic, bu yuzden
     "varargs" larla calisirken "Array" lerle calisiyormus gibi
     davranabilirsiniz.
     3) "varargs" olusturmak icin "<data type>... <varargs ismi>"
     veya "<data type> ...<varargs ismi>"
     4)Bir method'da "varargs" in yaninda baska bir parametre
     kullanilobilir mi?
     "varargs en sonda olmak sartiyla kullanilabilir"
     5)bir methodda birden fazla varargs kullanilamaz
 */


        int r1 = add(12, 3, 4, 4, 5);
        System.out.println("r1 = " + r1);
    }
    //

    //2 sayininn toplamini return eden bir method olusturunuz
    public static int topla(int a, int b) {
        return a + b;
    }

    //3 sayininn toplamini return eden bir method olusturunuz
    public static int topla(int a, int b, int c) {
        return a + b + c;
    }

    //4 sayininn toplamini return eden bir method olusturunuz
    public static int topla(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    //istedigimiz kadar sayiyi toplayabilecek bir method olusturalim
    //arka planinda array calisir
    public static int add(int... a) {
        int sum = 0;
        for (int w : a) {
            sum += w;

        }
        return sum;
    }


}
