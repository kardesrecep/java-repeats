package P_18Oop.class_degiskenleri2;

public class Gamer {
   static int oyuncuSayisi=0;
    public Gamer(){
        oyuncuSayisi++;
    }

    int  saglik=100;
    void yasam(){
        saglik=100;
    }

    void yumruk(){
        saglik--;

    }
    void oyuncuSayisi(){
        System.out.println(oyuncuSayisi);
    }


}
