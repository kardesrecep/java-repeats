package P_11PassByValue;

public class MethodOverloading01 {
    public static void main(String[] args) {
add(3,5);
add(3,5.0);
/*
     Method Overloading nasil yapilic?
    1)Method isimleri gyni olmalidir
     2) )Method parametreleri forkli olmalidir.
         i) Parametre sayilari degistirilebilir
         ii) Parametrelerin data tiplerini degistirebilirsiniz
         iii) Parametrelerin yerlerini degistirebilirsiniz ancak
             data tipleri farkli ise.
             method name + parametreler= Method signature

             *** Method signature diisnda ne degistirirseniz degistirin java o methodlari
             farkli  kabul etmez

   */

    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void add(int a,double b){
        System.out.println(a+b);
    }
    public static void add(double a,int b){
        System.out.println(a+b);
    }
}


