package P_01scanner_methodCreations;

public class MethodCreation01 {
    public static void main(String[] args) {
        //main methodun icindeki her sey static olmalidir

        System.out.println( toplamaYap(1.9,2));
        System.out.println(ucSayiyiCarp(5,9,45));
        System.out.println( toplamaYap(2,2));
        System.out.println("toplaVeCarp(12,34,1) = " + toplaVeCarp(12, 34, 1));
        ObjectCreation obj2=new ObjectCreation();
        obj2.hareketEt();



    }
    public static double toplamaYap(double a, double b){
return a+b;
    }
    //uc sayiyi birbiri ile carpan bir method olusturun
    public static int ucSayiyiCarp(int a, int b, int c){

        return a*b*c;
    }
    //ex-3 a+b*c seklinde bir method create ediniz

    public static double toplaVeCarp(double a,double b, double c){

        return (a+b)*c;
    }

}
