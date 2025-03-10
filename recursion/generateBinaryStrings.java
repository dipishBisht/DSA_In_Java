// TODO Find list of binary string of n size which should not contain consecutive 1's 

//? Create a ArrayList of string and in the helper function the basae case check if the num ==0 if it is add str in arraylist 
//? and return, then we check the edge case when the strig size is 0 then add both 1 and 0 to string else add the 0 but for 1 
//? check if the last digit is 1 or not.

package recursion;

import java.util.ArrayList;

public class generateBinaryStrings {
    public static void main(String[] args) {
        // Length of binary string
        int num = 3;

        // Arraylist of string
        ArrayList<String> arr = new ArrayList<>();

        // Finding the binary strings
        generateBinaryStringsHelper(arr, num, "");

        // Printing binary strings
        for (String i : arr) {
            System.out.println(i);
        }
    }

    public static void generateBinaryStringsHelper(ArrayList<String> arr, int num, String str) {
        // Base case
        if (num == 0) {
            arr.add(str);
            return;
        }

        // Do your work and divide into sub problem
        if (str.length() == 0) {
            generateBinaryStringsHelper(arr, num - 1, str + '1');
            generateBinaryStringsHelper(arr, num - 1, str + '0');
        } else {
            generateBinaryStringsHelper(arr, num - 1, str + '0');
            
            // If the last digit is not 1
            if (str.charAt(str.length() - 1) != '1')
                generateBinaryStringsHelper(arr, num - 1, str + '1');
        }

    }
}
