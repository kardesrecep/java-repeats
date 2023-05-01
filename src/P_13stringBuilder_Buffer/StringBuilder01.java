package P_13stringBuilder_Buffer;

public class StringBuilder01 {
    public static void main(String[] args) {
        //Strinbuilder javada bir classtir
        // ve de string olusturmaya yarar
        //Stringbuilder mutable classtir,string ise immutabledir
        //immutable classlarda varolan deger degistirilemez, degisitirmek istediginizde
        //memoryde yeni variable yeni degerle olusturulur ve de eski variablenin pointeri yeni variableye
        //dondurulur
        //Eger bir variable hicbir pointer tarafinddan gosterilmiyorsa o "garbage collector tarafindan silinir
        //Mutable classlarda var olan deger degistirilebilir. Orjinal deger korunmaz
        //=>String classlarin immutable yapisi security icin onemlidir
        //"String Clos" Lorin “imwutable" yopisi "security" icin onemlidir.
/*
 "String closs" Lorin "immutoble" yopisi "security" icin onenlidin.

‘Auni degere sahin birden fazla String oldugundo, Javo bir tone container olusturur
 ve oyni deger sahip String’terin bu containen'é
kullulanilmasini tomin eder. Bu moneory'd Korvmak icin iyidir ancak
 contoiner’doki degers bir variable icin degistirdiginizde tun voriabte'Larin
etkitenmess tehlikesi vardir. Bu tehlikeden kurtvinok icin Java, String’sri
“inqutadleCdeaisnes)* yapnistir. Fakot hechongi bir yardabtee ‘in
dogerin’ degistirack icin Jova bir yot bulmustur. Degistinaek stediginiz
variabte icin yeni bir container olusturur ve varioble'in podnter'ini bu
yeni varioble’a yontendirir. BoyleLikte hen degisin saglannis hen de digerteri etkitenmenis otur.

 */


        String str = "java";
        str = "SUPER JAVA";
        System.out.println(str);


        StringBuilder strb = new StringBuilder("java");

        strb = new StringBuilder("ultra super java");
        System.out.println(strb);

        String hesapSahibi1 = "Ali Can";
        String hesapSahibi2 = "Ali Can";
        String hesapSahibi3 = "Veli Bal";
        hesapSahibi1.toLowerCase();
        System.out.println(hesapSahibi1);

        //Stringbuilder nasil olusturulur
        //1.yol
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder);
        //2.yol
        StringBuilder stringBuilder2 = new StringBuilder();
        //yol-a
        stringBuilder2.append("selam");
        System.out.println("stringBuilder2 = " + stringBuilder2);

        stringBuilder2.append(" herkese");
        //yol-b
        stringBuilder2.append(" selam!").append(" vayyyy :)");//method chain
        System.out.println(stringBuilder2);
        //SB larda character sayisi bulma

        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("hello");
        int numOfChar = stringBuilder3.length();
        System.out.println("numOfChar = " + numOfChar);
        int capacity = stringBuilder3.capacity();
        System.out.println("capacity = " + capacity);
        //capacity asimlarinda varolanin 2katinin 2 fazlazi gelir

        //setCharAt();
        stringBuilder3.setCharAt(0, 'c');
        System.out.println("stringBuilder3 = " + stringBuilder3);

        //delete()
        stringBuilder3.append("xxxxxxxxxxxxxxxxm");
        stringBuilder3.delete(5, 21);
        System.out.println("stringBuilder3 = " + stringBuilder3);

        //deleteCharAt()
        stringBuilder3.deleteCharAt(5);
        System.out.println("stringBuilder3 = " + stringBuilder3);

        stringBuilder3.reverse();
        System.out.println("stringBuilder3 = " + stringBuilder3);

        //immutable oldugu icin deger degismedi
        String abc = "java";
        abc = abc.replace("j", "t");
        System.out.println(abc);

        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("developer");

        //toString();
        String usedString = stringBuilder4.toString();
        usedString.toUpperCase();
        System.out.println(usedString);

        //tekrardan sb ye cevirdik
        StringBuilder stringBuilder5 = new StringBuilder(usedString);
        System.out.println("stringBuilder5 = " + stringBuilder5);

        //insert();2.karakterden sonra ekleneni koyar
        stringBuilder5.insert(2,"f");
        System.out.println("stringBuilder5 = " + stringBuilder5);


        //2.karakterden sonra "jklmnoprst" stringinin 5,6,7 deki characterlerini yerlestirir
        stringBuilder5.insert(2,"jklmnoprst",5,8);
        System.out.println("stringBuilder5 = " + stringBuilder5);


        //compareTo();
        //sbler tamamiyla ayni ise 0 verir
        //a alfabetik sirada bden sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
        // a alfabetik sirada bden once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir

        StringBuilder a=new StringBuilder("java");
        StringBuilder b=new StringBuilder("tava");
      int result=  a.compareTo(b);
        System.out.println("result = " + result);


    }
}
