package P_10ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Arraylist03 {
    public static void main(String[] args) {
//Iki arraylostin esit olup olmadigini kontrol eden kodu yaziniz
        // iki arrayin esit olabilmesi icin elemanlar esit olmali
        // ve ayni elemanlar ayni indexte olmali


        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        m.add('t');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');
        //1.way

        int counter = 0;
        for (int i = 0; i < m.size(); i++) {
            if (m.size()!=n.size()){
                System.out.println("listler esit degildir");
                break;

            }
            if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("listler esit degildir");
                break;
            }

        }
        if (counter == 0) {
            System.out.println("listler esit");
        }
        //2.way
        boolean esitMi=m.equals(n);
        if (esitMi){
            System.out.println("listler esit");
        }
        else{
            System.out.println("listler esit degildir");
        }


    }
}
