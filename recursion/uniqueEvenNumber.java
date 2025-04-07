import java.util.*;

public class uniqueEvenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");

        // Input array size
        int size = sc.nextInt();

        // Create array of size
        int[] digits = new int[size];

        System.out.println("Enter arrays numbers :");

        // Input array numbers
        for (int i = 0; i < digits.length; i++) {
            digits[i] = sc.nextInt();
        }
        sc.close();

        // Create set to store unique results
        Set<Integer> result = new HashSet<>();

        // Sort array to get answer in sorted way
        Arrays.sort(digits);

        // To get to know about number used or not
        boolean[] used = new boolean[digits.length];

        // Find asnwer
        find(digits, result, new StringBuilder(), used);

        // Print answer
        System.out.println(result);
    }

    public static void find(int[] digits, Set<Integer> result, StringBuilder ans, boolean[] used) {
        // Base case
        if (ans.length() == 3) {
            if (ans.charAt(0) != '0') {
                int num = Integer.parseInt(ans.toString());
                if (num % 2 == 0) {
                    result.add(num);
                }
            }
            return;
        }

        // Divide in sub problem and call the function
        for (int i = 0; i < digits.length; i++) {
            if (used[i])
                continue;
            if (i > 0 && digits[i] == digits[i - 1] && !used[i - 1])
                continue;
            used[i] = true;
            ans.append(digits[i]);
            find(digits, result, ans, used);
            ans.deleteCharAt(ans.length() - 1);
            used[i] = false;
        }
    }
}
