// TODO Find the reverse of the array

//? Tale input of size of array and then numbers of array then in base condition when left and right pointer pass each other then
//? stop then at each call swaap numbers at the index then call the fn with left + 1 and right - 1.   


import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");

        // Take size of the array
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array numbers :");

        // Take input of array numbers
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        // Revere the array
        reverseHelper(arr, 0, size - 1);
        System.out.println("Numbers are reverse :");

        // Print array numbers after reverse
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void reverseHelper(int[] arr, int left, int right) {
        // Base case
        if (left >= right)
            return;

        // Do your work
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Divide in sub problem
        reverseHelper(arr, left + 1, right - 1);
    }
}
