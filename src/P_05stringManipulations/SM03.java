package P_05stringManipulations;

import java.util.Scanner;

public class SM03 {
    public static void main(String[] args) {
        String a = "Java is easy, dont give up baby";
        int indeks = a.indexOf("a");
        System.out.println(a.lastIndexOf("y,"));
        System.out.println(indeks);

        //ex-1: Bir stringdeki bir characterin tekrarli mi tekarasiz mi olup olmadigini gostren kodu yazinz

        String t = "Helllloooooooo";
        char harf = 'o';

        if (t.indexOf(harf) == t.lastIndexOf(harf)) {
            System.out.println("tekrarsiz");

        } else
            System.out.println("tekrarli");


        String u = "Learn java earn money";
        System.out.println("u.indexOf(\"j\",3) = " + u.indexOf("j", 3));
        System.out.println("u.lastIndexOf(\"rn\",11) = " + u.lastIndexOf("rn", 11));
        System.out.println("u.isEmpty() = " + u.isEmpty()); //bos stringler icin
        System.out.println("u.isBlank() = " + u.isBlank());// hem bos string hem de
        // space icin tru return eder

        //ex-2: Kullanicidan alinan isim mutlaka spaceden farkli en az bir character icermeli

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String isim=scan.nextLine();

        if (isim.isBlank()){
            System.out.println("lutfen bir kelime giriniz");

        }else {
            System.out.println(isim);
        }

    }
}
