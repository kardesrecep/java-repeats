package P_05stringManipulations;

public class Q1 {
    public static void main(String[] args) {

        /*
       1=> equals()->iki stringin aybu olup olmadigini anlamamiza yarar
       2=>  equalsIgnoreCase();
       3=> toLowerCase();
       4=>toUpperCase();
       charAt();
       length();
       contains();
       split();

         */



        /*
        Bir passwordun gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz
        -- En az 8 karakter icermeli
        --space karakteri icermemeli
        -- ilk harfi "M" veya "m" ile baslamali
        -- son kaakteri "?" ile bitmeli

         */
        String pwd="Manisa12?";

     boolean first=   pwd.length()>7;
   boolean second= !pwd.contains(" ");
  boolean third=  pwd.charAt(0)=='M' || pwd.charAt(0)=='m';

boolean fourth= pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first&&second&&third&&fourth);







    }

}
