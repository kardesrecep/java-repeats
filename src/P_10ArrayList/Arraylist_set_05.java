package P_10ArrayList;

import java.util.HashSet;
import java.util.Set;

public class Arraylist_set_05 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 2, 5, 7, 2};

        // Create a HashSet to store the unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Add the elements of the array to the HashSet
        for (int i = 0; i < arr.length; i++) {
            uniqueElements.add(arr[i]);
        }


        // Print the unique elements
        System.out.println("Unique elements:"+  uniqueElements);
        for (Integer element : uniqueElements) {
            System.out.println(element);
        }
    }
}

