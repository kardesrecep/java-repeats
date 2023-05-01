package P_03nestedIf_switch;

public class Q1 {
    public static void main(String[] args) {
       /*
       passwordun ilk harfi buyuk harf ise 'A' olursa gecerli password aksi halde gecersiz password
       passwordun ilk harfi kucuk harf ise 'z' olursa gecerli password aksi halde gecersiz password


        */

        String password= "Axy12!";

        //  password.charAt(0) bu sekilde de yapabilirdik fakat kod kalabaligina gerek yok


        char ilkHarf= password.charAt(0);

        if (ilkHarf>='A'&& ilkHarf<='Z'){

            if (ilkHarf=='A'){
                System.out.println("gecerli password");

            }else {
                System.out.println("gecersiz password");
            }


        } else if (ilkHarf>='a'&& ilkHarf<='z') {
            if (ilkHarf=='z'){
                System.out.println("gecerli password");


            }else {
                System.out.println("gecersiz password");
            }
            
        }else {
            System.out.println("ilk karakter harf olmali");
        }


    }
}
