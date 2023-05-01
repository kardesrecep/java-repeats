package P_12DateTime;

import java.time.LocalDate;
import java.time.Month;

public class P06Practices2 {
    public static void main(String[] args) {
        //Sabit bir tarih olusturunuz
        LocalDate myDate = LocalDate.of(2011, Month.APRIL, 23);
        System.out.println(myDate);
    //Javada  sabit datalari (gun,isimler,sehir, bolge eyalet etc gibi isimleri depolamak
        //ve de gerektiginde kullanmak icin depolar olustururuz bunlara "ENUM" denir.

        //ex-2) Bayburt icin "Bay", Trabzon icicn Ts, Istanbul icin guzel sehir,
        //izmit icin de "pismaniye" yaz

        Cities city=Cities.IZMIT;
        switch (city){
            case BAYBURT:
                System.out.println("BAY");
                break;
            case TRABZON:
                System.out.println("Ts");
                break;
            case ISTANBUL:
                System.out.println("guzel sehir");
                break;
            case IZMIT:
                System.out.println("Pismaniye");
                break;
            default:
                System.out.println("Not defined");
        }


    }
}
