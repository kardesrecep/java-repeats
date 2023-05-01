package P_12DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class P03DateFormatter {
    public static void main(String[] args) {
        //javadan aldiginiz  date "ay/gun/yil" seklinde yaziniz
        LocalDate current = LocalDate.now();

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = dtf1.format(current);
        System.out.println(formattedDate1);

        //ay degisikligi
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2 = dtf2.format(current);
        System.out.println(formattedDate2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3 = dtf3.format(current);
        System.out.println(formattedDate3);

        //Cift MM konuldugunda 10 dan kucuk aylari 01,02,03.etc seklinde yazar
        //Tek M konuldugunda 10 dan kucuk aylari 1,2,3..etc seklinde yazar
        //"d" 10dan kucuk gunleri 1,2,3 etc seklinde yazar
        //"dd" 10dan kucuk gunleri 01,02,03 etc seklinde yazar
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");
        String formattedDate4 = dtf4.format(current);
        System.out.println(formattedDate4);


    }
}
