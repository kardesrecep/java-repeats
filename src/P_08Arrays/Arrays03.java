package P_08Arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //verilen arraydeki elemanlari tekrarsiz yaziniz

            int[] arr = {2, 3, 3, 2, 5, 7, 2};

            // Create a new array to store the unique elements
            int[] uniqueArr = new int[arr.length];
            int uniqueCount = 0;

            // Loop through the array
            for (int i = 0; i < arr.length; i++) {
                boolean isUnique = true;

                // Check if the current element is already in the unique array
                for (int j = 0; j < uniqueCount; j++) {
                    if (arr[i] == uniqueArr[j]) {
                        isUnique = false;
                        break;
                    }
                }

                // If the current element is unique, add it to the unique array
                if (isUnique) {
                    uniqueArr[uniqueCount] = arr[i];
                    uniqueCount++;
                }
            }

            // Print the unique elements
            System.out.println("Unique elements:");
            for (int i = 0; i < uniqueCount; i++) {
                System.out.println(uniqueArr[i]);
            }
        }
    }