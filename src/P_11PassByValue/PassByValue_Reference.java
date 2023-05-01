package P_11PassByValue;

public class PassByValue_Reference {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before method call: " + num);
        updateNumber(num);
        System.out.println("After method call: " + num);
    }

    public static void updateNumber(int n) {
        n = n + 5;
    }
}
