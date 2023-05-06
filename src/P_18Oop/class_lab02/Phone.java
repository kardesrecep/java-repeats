package P_18Oop.class_lab02;

public class Phone {

    PhoneTypes type;
    String brand;
    String model;
    boolean wifi;
    boolean mobileData;

    boolean isThereACall;

    void call(String phoneNumber){
        System.out.println(phoneNumber);
        isThereACall=true;



    }
    void endTheCall(){
        if (isThereACall){
            System.out.println("The call has been terminated");
        }

        }

        void sendMessage(String message){
        if(mobileData || wifi){
            System.out.println("The message sent");
        }
        }


    }



