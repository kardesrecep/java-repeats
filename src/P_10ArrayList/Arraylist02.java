package P_10ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Arraylist02 {
    public static void main(String[] args) {
        String[] meyveler = {"elma", "armut", "portakal", "mandalina", "çilek",
                "kiraz", "üzüm", "muz", "şeftali", "karpuz"};
        List<String> meyve=new ArrayList<>();
        for (String w:meyveler) {
            meyve.add(w);
        }
        System.out.println(meyve);
        List<String> sebze=new ArrayList<>();
        sebze.add("pirasa");
        sebze.add("yarasa");
        sebze.add("elma");
        meyve.removeAll(sebze);
        System.out.println(meyve);

        //containsAll()
        //bir listin icinde coklu elemanlarin var olup olmadigini kontrol eder
        boolean snc1=meyve.containsAll(sebze);
        System.out.println(snc1);

        //example-1

                ArrayList<String> urunler = new ArrayList<String>();

                urunler.add("çatal");
                urunler.add("kaşık");
                urunler.add("tabak");
                urunler.add("bardak");
                urunler.add("bıçak");
                urunler.add("çatal");
                urunler.add("kaşık");
                urunler.add("tabak");
                urunler.add("bardak");
                urunler.add("bıçak");
                urunler.add("bıçak");
                urunler.add("bıçak");

              urunler.remove("bardak");

              //listdeki urunun tamamini silmek icin removeAll() kullanilir
        //ama bunun icin once bir list olusturulup silinecek elementler boylece kolaylikla silinir
        ArrayList<String> silinecekler = new ArrayList<String>();
        silinecekler.add("bardak");
        urunler.removeAll(silinecekler);

        System.out.println("urunler = " + urunler);
        //example-2 bir salary listi olustur eger 10000 den az ise %20 10000 den coksa
        // %10 zam  yapan kodu yaz

        ArrayList<Double> salaries = new ArrayList<>();
        salaries.add(12000.00);
        salaries.add(8000.00);
        salaries.add(15000.00);
        salaries.add(9500.00);
        salaries.add(11000.00);

//        for (int i = 0; i <salaries.size() ; i++) {
//            if (salaries.get(i)<10000){
//                salaries.set(salaries.indexOf(salaries.get(i)),salaries.get(i)*1.2);
//            }
//            else {
//                salaries.set(salaries.indexOf(salaries.get(i)),salaries.get(i)*1.1);
//            }
//        }
        for (Double w:salaries) {
            if (w<10000){
                salaries.set(salaries.indexOf(w),w*1.2 );
            }
            else {
                salaries.set(salaries.indexOf(w),w*1.1);
            }
        }

        System.out.println(salaries);




    }
        }






