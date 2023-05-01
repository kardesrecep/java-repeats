package P_16method_creation;

public class C05_StaticMethods_NormalMethods {

    private int x=12;


    public static void main(String[] args) {
C05_StaticMethods_NormalMethods stm= new C05_StaticMethods_NormalMethods();
stm.normalMethod();

//static methodlarda instance almaya gerek olmadan calistirilabilir

        //static olmayan ve  instance almak zorunda olan methodlar
        // statik olmayan variablelere ulasabilir
        C05_StaticMethods_NormalMethods.staticMethods();

        //Math() ->  static methoddur

        System.out.println("max(1,2,5) = " + max(1, 2, 5));
      int maxKarsilastirma= max2(3,5,7);
        System.out.println("maxKarsilastirma = " + maxKarsilastirma);

         int maxSonKarsilastirma= max2(maxKarsilastirma,7,3);
        System.out.println("maxSonKarsilastirma = " + maxSonKarsilastirma);


    }

    public static int max(int x, int y, int z){
        int max=x;
        if (y>max)
            max=y;

        if (z>max)
            max=z;

        return max;
    }

    public static int max2(int x, int y, int z){
        return Math.max(x,y);
    }

    public void normalMethod(){
        System.out.println(x);

    }

    public static void staticMethods(){
        //static methodlar static olmayanlar variable ve methodlara ulasamaz, erisemez
        // alinacak hata-> java: non-static variable x cannot be referenced from a static context

        //egr ulasmak istiyorsak o zaman non-static olan degiskenlerimiz de static olmali
        //private static int x=12; gibi

        // methodum static oldugu icin instance olsuturmadan dogrudan class kullarak cagirabilrirm

        //System.out.println(x);
    }



}
