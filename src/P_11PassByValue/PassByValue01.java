package P_11PassByValue;

public class PassByValue01 {
    public static void main(String[] args) {
        /*
        1-Java variablerin orjinal degerlerini korumak ister
        2- Variable methodlar icinde kullanildiginda java methodun icine orjinal degeri koymaz,
        odegerin kopyasini uretir ve methodda o kopyayi yollar.Method kopya uzerinde
        degisiklik yapar
        dolayisiyla variablelerin orjinal degerleri korunmus olur.
        Bu sisteme "Pass By Value " denir

        //*** Bazi programlama dilleri orjinal degeri koruma altina almamistir. Bu durumu devlere
        birakirlar.Bu tarz diller "PassByReference"  kullanirlar
         */

      int x=5;
 System.out.println(x);
        change(x);
       System.out.println(x);
       int ucret=100;
       //indirimi ucrete de kalici olarak yanistmak icin
        ucret=indirim(ucret);
     int kopya=  indirim(ucret);
        System.out.println(ucret);
        System.out.println("kopya = " + kopya);

    }
    public static void change(int a){
        System.out.println(a*3);


    }
    public static int indirim(int gomlekUcreti){
      return  gomlekUcreti-10;
    }
}
