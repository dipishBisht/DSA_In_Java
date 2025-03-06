// TODO Find the occurance of an given number and then return a array with the index where the number occured.

//? First we need to find how many occurance of the given number are in the array adn then create another array of that size and
//? then create a function that insert the index in that array where the number occured.

package recurssion;

import java.util.*;

public class findNumberOccurance {

    public static void main(String[] args) {
        // Created a scanner of take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array :");

        // Take size of array
        int size = sc.nextInt();

        // Create array
        int[] arr = new int[size];
        System.out.println("Enter all numbers :");

        // Take input of array numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to find the occurance of :");

        // Take input of the number for which want occurance
        int number = sc.nextInt();

        // Find the answewr
        int ans = findOccuranceOfNumber(arr, number, 0);
        System.out.println("Total occurance of " + number + " is " + ans);

        // Create index array
        int[] indexArr = new int[ans];

        // Find index's
        findIndex(indexArr, arr, number, 0, 0);
        System.out.println("Index of array where " + number + " is present is :");

        // Print index's
        for (int i : indexArr) {
            System.out.println(i);
        }

        sc.close();
    }

    // Function to find how many occurance of the given number is present
    public static int findOccuranceOfNumber(int[] arr, int number, int index) {

        // Base case
        if (index == arr.length)
            return 0;

        // Divide in sub problem
        int ans = findOccuranceOfNumber(arr, number, index + 1);

        // Do your work
        if (arr[index] == number)
            ans++;

        return ans;
    }

    // Funtion to get the index where the number is present.
    public static void findIndex(int[] ans, int[] arr, int number, int index, int currentIdx) {

        // Base case
        if (index == arr.length)
            return;

        // Do your work
        if (arr[index] == number) {
            ans[currentIdx++] = index;
        }

        // Divide in sub problem
        findIndex(ans, arr, number, index + 1, currentIdx);

    }
}