package P_16method_creation;

import java.util.Arrays;

public class C08PassByValue {

    //parametreler javada passbyvalue seklinde gonderilir

    //method overloading: methodlar ayni isimle fakat farkli parametrelerle olusturulur
    //method signaturesi onemlidir

    //passByValue : parametrelere gonderilen degisiklikler cagirana geri yansitilmaz
    //passByReference : parametrelere gonderilen degisiklikler degistirilebilir

    public static void main(String[] args) {
//        C08PassByValue drv= new C08PassByValue();
//        int x=20;
//        System.out.println(x);
//        drv.passByValue(x);
//        System.out.println("son hali: "+ x);

        C08PassByValue drv= new C08PassByValue();


        int number[]={1,2,3,5,7,9};
        System.out.println(Arrays.toString(number));

        drv.degistir(number);
        System.out.println(Arrays.toString(number));





    }

    public void passByValue(int x){
        System.out.println("PBV: "+ x);
        x=10;
        System.out.println("x = " + x);
// burdali degisimin sebebi arrayin referans type oldugudur
    }
//ex-2: icinde array barindiran bir method olsutur ve 2 ile carp
    public void degistir(int sayilar[]){

        for (int i = 0; i < sayilar.length ; i++) {

            sayilar[i]=sayilar[i]*2;

        }



    }


}
