package P_12DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class P04TimeFormatter {
    public static void main(String[] args) {
        LocalTime cT = LocalTime.now();
        System.out.println("cT = " + cT);

        LocalTime myTime = LocalTime.of(19, 28, 56, 4567);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedMyTime = dtf1.format(myTime);
        System.out.println(formattedMyTime);
        //HH 24 saatlik sistemini kullanir
        //hh 12 saatlik sistemini kullanir
        //a ise am ve pmdir

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss a");
        String formattedMyTime2 = dtf2.format(myTime);
        System.out.println(formattedMyTime2);
    }
}
