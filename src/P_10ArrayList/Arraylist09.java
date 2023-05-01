package P_10ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Arraylist09 {
    public static void main(String[] args) {
        //Bir integer listindeki 7 haric tum elemanlari 2 arttiriniz
        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w : ages) {
            if (w == 7) {
                continue;
            }
            // w=w+2;==> listler boyle update edilemezler, bunun icin set() methodunu kullanmaliyiz
            ages.set(ages.indexOf(w), w + 2);
        }
        System.out.println(ages);
        //ex-2: verilen listte 8 ve 8den onceki tum elemanlari 2 katina cikariniz
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);
        for (Integer w : nums) {

            nums.set(nums.indexOf(w),w*2);
            if(w==8){
                break;
            }


        }
        System.out.println(nums);
    }
}
