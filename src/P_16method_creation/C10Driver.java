package P_16method_creation;

public class C10Driver {

    public static void main(String[] args) {
        C11Ogrenci ogrenci = new C11Ogrenci();
        ogrenci.isim = "Ali";
        ogrenci.yas = 12;


        C10Driver drv = new C10Driver();
        drv.ogrenciBilgileri(ogrenci);

        System.out.println("main icinde:"+ ogrenci.isim);
        System.out.println("main icinde:"+ ogrenci.yas);

    }


    public void ogrenciBilgileri( final C11Ogrenci ogrenci) {

        ogrenci.isim = "Asli";



        System.out.println(ogrenci.isim);
        System.out.println(ogrenci.yas);


    }

}
