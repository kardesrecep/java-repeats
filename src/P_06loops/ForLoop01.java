package P_06loops;

public class ForLoop01 {
    public static void main(String[] args) {
        //ex-1  4ten 17 ye kadar tum tamsayilari ekrana yazdirin
        for (int i = 4; i < 7; i++) {
            System.out.println(i + " ");

            //ex-2  14ten 7 ye kadar tum tamsayilari ekrana yazdirin
            for (int j = 14; j >= 7; j--) {
                System.out.println(j + " ");

            }

        }
        //ex-3 14 ten 5e kadar tum cift sayilari yazdirin
        //1.way
        for (int i = 12; i >= 5; i -= 2) {

            System.out.println(i + " ");

        }
        //2.way
        for (int i = 14; i >= 4; i -= 2) {
            if (i % 2 == 0) {
                System.out.println(i + " ");

            }

        }
        //ex-4 28 den 157e kadar tum tek sayilari yazdirin
        for (int i = 28; i <157 ; i++) {
            if (i%2==1){ // i%2!=0 ayni ifade
                System.out.println(i+" ");
            }

        }
       //ex-5 "Java" stringini "J*a*v*a*" stringine ceviren kodu yaziniz
        String str="Java";
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i)+"*");

        }

        System.out.println("-------------------------------------------");
        //Verilen stringdeki tekrarsiz  karakterleri ekrana yazdiran kodu yaziniz
        String str1="Hellllooo";
        for (int i = 0; i <str1.length() ; i++) {
            char c= str1.charAt(i);
            if (str1.indexOf(c)== str1.lastIndexOf(c)){
                System.out.println(c);
            }
        }


    }
}
