package P_12DateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class P05Practices {
    public static void main(String[] args) {
        //ex-1: japonya ile Almanya arasindaki zaman farkini saat olarak hesaplayan java kodunu yaziniz
        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long hoursDiff = ChronoUnit.HOURS.between(germany, japan);
        System.out.println("Japonya ile Almanya arasındaki zaman farkı: " + hoursDiff + " saat");

        //Istanbul-Yakutsk saat farki
        LocalDateTime istanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        LocalDateTime yakutsk = LocalDateTime.now(ZoneId.of("Asia/Yakutsk"));
       Long hoursDiff2=  ChronoUnit.HOURS.between(istanbul,yakutsk);
        System.out.println("Istanbul ile Yakutsk arasındaki zaman farkı: " + hoursDiff2 + " saat");
    }
}


