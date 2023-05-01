package P_12DateTime;

import java.time.LocalDate;

public class P02 {
    public static void main(String[] args) {
        //ex-1 verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate mydate = LocalDate.of(1989, 05, 2);
        int day = mydate.getDayOfMonth();
        int month = mydate.getMonthValue();
        if (day >= 21 && month == 3) {
            System.out.println("Koc");
        } else if (day <= 20 && month == 4) {
            System.out.println("Koc");

        } else if (day >= 21 && month == 4) {
            System.out.println("Boga");
        } else if (day <= 20 && month == 5) {
            System.out.println("Boga");
        }

        //2.yol:
        if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
            System.out.println("Koc");
        } else if (((day >= 21 && month == 4) || (day <= 20 && month == 5))) {
            System.out.println("Boga");
        }
    }

}
