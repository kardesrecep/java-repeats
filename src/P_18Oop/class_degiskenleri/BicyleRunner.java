package P_18Oop.class_degiskenleri;

public class BicyleRunner {

    public static void main(String[] args) {
        Bicycle bicycle=new Bicycle();
        bicycle.hiz=10;
        bicycle.vites=21;
        Bicycle.bicycleCounts=1;

//        System.out.println(bicycle.hiz);
//        System.out.println(bicycle.vites);
        bicycle.bilgileriYazdir();
        System.out.println("***************************************");
        Bicycle bicycle2=new Bicycle();

        bicycle2.vites=5;
        bicycle2.hiz=15;
        Bicycle.bicycleCounts=2;
        bicycle2.bilgileriYazdir();
//her instance icin farkli  uye degiskeni olusmustur
 //bicycleCounts degiskeni static olarak tanimlandigi icin butun instanceler
       // degiskene ulasip degerlerini yazdirabildiler


    }
}
