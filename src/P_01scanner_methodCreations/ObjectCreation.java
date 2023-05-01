package P_01scanner_methodCreations;

public class ObjectCreation {
    public String marka="Honda";
    public int fiyat=12;
    public static void main(String[] args) {
        // obje olusturma
        ObjectCreation objectCreation1=new ObjectCreation();
        System.out.println("objectCreation1.fiyat = " + objectCreation1.fiyat);
        objectCreation1.hareketEt();
        objectCreation1.dur();
        MethodCreation01 obj=new MethodCreation01();
        System.out.println("obj.toplamaYap() = " + obj.toplamaYap(14,67));
    }

    public void hareketEt(){
        System.out.println("Honda hareket eder");

    }
    public void dur(){
        System.out.println("Honda durur");

    }


}
