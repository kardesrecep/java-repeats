package P_05stringManipulations;

public class SM02 {
    public static void main(String[] args) {
        /*
        Bir Stringdeki space haric kac tane character kullanildigini gosteren kodu yaziniz
        "Yurtta sulh, cihanda sulh."
         */
        String str = "Yurtta sulh, cihanda sulh.";
        int num = str.replace(" ", "").length();
        System.out.println(num);

        //ex-2: Bir stringdeki tum 'a' harflerini 'A'ya ceviriniz

        String cvr = str.replaceAll("a", "A");
        System.out.println(cvr);

        //ex-3: "sulh" kelimes inin yerine "*" koyunuz
        String yldz = str.replaceAll("sulh", "****");
        System.out.println(yldz);

        /*
        ex-4: Bir stringdeki tum sayilari "*" a ceviriniz
         */
        String id = "RC3455554ASD98CVB";
        String newId = id.replaceAll("[0-9]", "*");
        System.out.println(newId);

        //NOt:Bir grup datayi ifade eden kodalar regex denir
        /*
      Ex-5:  Verilen bir stringde kullanilan nokt isarreti ve rakamlar
         ve space karakteri haric tum karakterlerin sayisini bulan kod yaziniz

         */
        String str4 = "Life is ? better, 123 at the beach!....";
        String sldm = str4.replaceAll("[0-9]", "").
                replace(" ", "").
                replaceAll("\\{Punct}", "");
        System.out.println(sldm.length());

        /*
        ex-6: Bir password gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz
          */

        //  1- space haric en az 8 karakter icermeli

        String pwd = "B78c? K!m.";
        boolean first = pwd.replace(" ", "").length() > 7;


        //  2-en az 1 sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z]", "").length() > 0;


        //   3-en az bir rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]", "").length() > 0;


        //  4-en az 1 buyuk harf icermeli

        boolean fourth = pwd.replaceAll("[^A-Z]", "").length() > 0;

        //  5-en az bir kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length() > 0;

        boolean pwdValid = first && second && third && fourth && fifth;
        if (pwdValid) {
            System.out.println("your pwd valid");
        } else
            System.out.println("your pwd invalid");
//ex-7: Bir stringdeki noktalama isaretleri haric karakter sayisini gosteren kodu yaziniz
        String str1 = "Life, is better ! at the beach...";
        System.out.println(str1.length());
        int punctNumber = str1.replaceAll("[^\\{Punct}]", "").length();

        System.out.println(punctNumber);

        //ex-8: Verilen bir string "Al" ile basliyor ve de ""ar" ile bitiyorsa ekrana harika degilse
        //normal yazzdirin
        String str2 = "Alamancilaar";
       /*
       1.way
        if (str2.startsWith("Al")&&str2.endsWith("ar")){
            System.out.println("Perfect");
        }else {
            System.out.println("Normally");
            }
        */
        //2.way
        boolean bas = str2.startsWith("Al");
        boolean son = str2.endsWith("ar");

        System.out.println(bas && son ? "perfect" : "Normally");

    }
}

