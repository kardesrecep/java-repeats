package P_18Oop.class_lab01;

public class PenRunner {
    public static void main(String[] args) {

        Pen kursunKalem= new Pen();
        kursunKalem.marka="FaberCastell";
        kursunKalem.tip="uclu";
        kursunKalem.doldurulabilir=false;
        kursunKalem.silinebilir=true;

        kursunKalem.yaz("Selam dostlar");
        kursunKalem.tekrarDoldur();
        kursunKalem.sil();

        System.out.println("******************************************");

        Pen dolmaKalem= new Pen();
        dolmaKalem.marka="Kaweco";
        dolmaKalem.tip="roller";
        dolmaKalem.doldurulabilir=true;
        dolmaKalem.silinebilir=false;
        dolmaKalem.yaz("Java ile hayat cok guzel");
        dolmaKalem.tekrarDoldur();
        dolmaKalem.sil();

    }
}
