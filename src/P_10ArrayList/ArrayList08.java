package P_10ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList08 {
    public static void main(String[] args) {
        //Bir listteki elemanlardan birbirine en yakin olani bulunuz
        //[12,15,19,30,21]==>19,21 yakin olanlar
        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(19);
        a.add(30);
        a.add(21);
        Collections.sort(a);//listte sort yapmak
        System.out.println(a);

        int minFark = Integer.MAX_VALUE;
        for (int i = 1; i < a.size(); i++) {
            minFark = Math.min(minFark, a.get(i) - a.get(i - 1));
        }
        System.out.println(minFark);
    }
}
