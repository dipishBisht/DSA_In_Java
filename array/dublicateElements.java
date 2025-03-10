// TODO Find is the array have any dublicate element or not.

//? Take input of size of array and array elements then sort the array and create a boolean value to store answer and loop from
//? i=1 -> array length and compare arr[i] == arr[i-1] if true store in boolean varible and at the end print the boolean value.  


package array;

import java.util.*;

public class dublicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");

        // Input size of array
        int num = sc.nextInt();

        // Create array
        int[] arr = new int[num];

        System.out.println("Enter array numbers :");

        // Take input of array numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        // Sorting array
        Arrays.sort(arr);

        // To store is dublicate or not
        boolean isDublicate = false;

        // Finding is any dublicate element present in array or not
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                isDublicate = true;
                break;
            }
        }

        // Print answer
        System.out.println("Dublicate element present in array is " + isDublicate);
    }
}
