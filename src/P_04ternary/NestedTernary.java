package P_04ternary;

public class NestedTernary {
    public static void main(String[] args) {
        /*
        verilen yilin leap yil olup olmadigini kontrol eden kodu yaziniz
        ==> yil 100'e bolunurse 400 e de bolunmelidir --1600+  1800-
        ==> yil 100'e bolunmezse 4 e bolunmelidir --1996+    2001-

         */

        int year = 1600;
        Object leap = year % 100 == 0 ? (year % 400 == 0 ? "Leap year" : "not leap year") :
                (year % 4 == 0 ? "Leap year " : "not leap year");

        System.out.println(leap);

        /*
        Asagidaki kurallara gore passwordun gecerli olup olmadigini kontrol eden kodu yaziniz
        --> 8 karakterden daha fazla veya 8 karakter varsa ilk harfi 'i' olmai
        --> 8 karakterden az varsa ilk harfi 'K' olmali
         */
        String pwd="i2a3ed54";
        char ilkHarf=pwd.charAt(0);

     String kontrol=   pwd.length()<8 ? (ilkHarf=='K' ? "Gecerli": "Gecerli degil"):
                (ilkHarf=='i' ? "gecerli": "gecersiz");
        System.out.println(kontrol);


    }


}

