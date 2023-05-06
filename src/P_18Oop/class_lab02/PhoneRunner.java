package P_18Oop.class_lab02;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.brand="Apple";
        phone.model="Iphone14ProMax";
        phone.type=PhoneTypes.CELLPHONE;
        phone.mobileData=true;
        phone.wifi=true;


       // phone.call("05552223344");
        phone.endTheCall();
        phone.sendMessage("Selam brooo");

        //hatalarin onune gecmek icin abstract class kullanmak gerek

    }


}
