package P_18Oop.class_degiskenleri2;

public class GamerRunner {
    public static void main(String[] args) {

        Gamer gamer1=new Gamer();
        Gamer gamer2=new Gamer();
        Gamer gamer3=new Gamer();
        Gamer gamer4=new Gamer();

        gamer3.oyuncuSayisi();


        //degisken static oldugundan her instance icn ayri ayri olusturulamyacak ve
        //oyuncu sinifinin tamami icin sadece 1 tane olusturulacak




//        System.out.println("gamer1.saglik = " + gamer1.saglik);
//
//        for (int i = 0; i <30 ; i++) {
//            gamer1.yumruk();
//            System.out.println(gamer1.saglik);
//
//        }
//
//        gamer1.yasam();
//        System.out.println(gamer1.saglik);

    }
}
