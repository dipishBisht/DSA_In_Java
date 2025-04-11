// TODO Find all combinations of number in the keypad

// ? Base case - when number string is "" then return arraylist with "" empty string, get the first digit and rest of the string
// ? then call the function with rest of the string it will return a string then create a arraylist for the all combbinations then
// ? find the index by - with '0' then get the key value at the index and loop in that key then get the current digit at that key
// ? and loop the arraylist we get from the funcation call and add the current digit in there values and at the end return the
// ? final result

import java.util.*;

public class keypadCombination {

    // All keys and values
    static String[] keys = { "?!", "abc", "def", "ghi", "jkl", "mnop", "qrst", "uvw", "xyz", ".;" };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        // Input number
        String num = sc.nextLine();
        sc.close();

        // Find answer
        List<String> result = findKeyCombinaitions(num);

        // Print answer
        System.out.println(result);
    }

    public static List<String> findKeyCombinaitions(String num) {
        // Base case
        if (num.length() == 0) {
            List<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        // Find first digit
        char digit = num.charAt(0);

        // Find rest of the string
        String rest = num.substring(1);

        // Divide into sub problem
        List<String> result = findKeyCombinaitions(rest);

        // Create list of answer
        List<String> finalResult = new ArrayList<>();

        // Index of digit
        int index = digit - '0';

        // Value at index
        String key = keys[index];

        // Add current digit in the camed answer
        for (int i = 0; i < key.length(); i++) {
            char currentChar = key.charAt(i);
            for (String j : result) {
                finalResult.add(currentChar + j);
            }
        }

        // Return answer
        return finalResult;
    }
}