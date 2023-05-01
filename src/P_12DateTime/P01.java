package P_12DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;


public class P01 {
    public static void main(String[] args) {
        //ex-1:Anlik tarihi ekrana yazdiran kodu yaziniz
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);
        //ex-2:Anlik zamani ekrana yazdiran kodu yaziniz
        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);

        //ex-3:Anlik zamani ve tarihi ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime);
        //ex-4:Japonyadaki Anlik zamani ve tarihi ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("currentDateTimeInJapan = " + currentDateTimeInJapan);
        LocalDateTime currentDateTimeInKyrgyz = LocalDateTime.now(ZoneId.of("Asia/Bishkek"));
        System.out.println("currentDateTimeInKyrgyz = " + currentDateTimeInKyrgyz);

        LocalDateTime currentDateTimeInGermany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println("currentDateTimeInGermany = " + currentDateTimeInGermany);

        //Example-5 Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz
      LocalDate countDate=  LocalDate.of(2023,04,21);
        LocalDate retireDate=countDate.plusDays(789);
        System.out.println("retireDate = " + retireDate);

        //Example-6 Iki cocugun dogum tarihleri arasindaki farki gun olarak  hesaplayan kodu yaziniz
       LocalDate dAli= LocalDate.of(2001,10,12);
       LocalDate dVeli= LocalDate.of(2009,8,15);

       Long diff= ChronoUnit.DAYS.between(dAli,dVeli);
        System.out.println("diff = " + diff);

        //EXample 8: Tom, Ali'den 3 yil 8 ay 13 gun sonro dogdu. Ali is Veli'den 1 yil 15 gun once dogdu. -

        // Tom'un dogum tarihi 18 Kasim 2011 ise Veli ve Ali'nin dogum torihlerini bulunuz.
        LocalDate dobTom= LocalDate.of(2011, 11, 18);
     LocalDate dobOfAli=   dobTom.plusYears(3).plusMonths(8).plusDays(13);
        System.out.println("dobOfAli = " + dobOfAli);
        //Example 8: Istanbul'un Fethi ile, Cumhuriyet'in kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.
LocalDate istFeth=LocalDate.of(1453,05,29);
LocalDate cumhuriyet=LocalDate.of(1923,10,29);
     Long aySayisi=   ChronoUnit.MONTHS.between(istFeth,cumhuriyet);
        System.out.println("aySayisi = " + aySayisi);


    }
}
