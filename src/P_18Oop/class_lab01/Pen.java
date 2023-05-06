package P_18Oop.class_lab01;

public class Pen {
    String marka;
    String tip;
    boolean doldurulabilir;
    boolean silinebilir;

    void yaz(String metin) {
        System.out.println(metin);

    }

    void tekrarDoldur() {
        if (doldurulabilir) {
            System.out.println("kalem dolduruldu");
        } else {
            System.out.println("kalem doldurulamaz");

        }

    }

    void sil() {
        if (silinebilir) {
            System.out.println("yazi silinir");
        } else {
            System.out.println("yazi silinemez");
        }

    }


}
