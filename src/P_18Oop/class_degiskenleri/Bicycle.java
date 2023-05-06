package P_18Oop.class_degiskenleri;

public class Bicycle {
    int vites;
    int hiz;

   static int bicycleCounts=0;

    void bilgileriYazdir(){
        System.out.println(vites);
        System.out.println(hiz);
        System.out.println(Bicycle.bicycleCounts);
    }
}
