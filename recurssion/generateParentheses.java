// TODO Generate all well formed parentheses of n pairs

//? base condition - if open and close both are 0 so add the string in the list and return, check if the open > 0 then call the
//?  function itself with open-1 and string+"(", then check if close > open then close -1 and string+")".

package recurssion;

import java.util.*;

public class generateParentheses {

    public static void main(String[] args) {
        // Create ArrayList
        List<String> list = new ArrayList<>();

        Scanner sn = new Scanner(System.in);

        System.out.println("Enter number of pairs want:");

        // Take input of number of pairs want
        int n = sn.nextInt();

        // Find pairs
        generateHelper(list, n, n, "");

        // Print all pairs
        for (String s : list) {
            System.out.println(s);
        }

        sn.close();
    }

    public static void generateHelper(List<String> list, int open, int close, String s) {
        // Base case
        if (open == 0 && close == 0) {
            list.add(s);
            return;
        }

        // Condition to add "(" bracket
        if (open > 0)
            generateHelper(list, open - 1, close, s + "(");

        // Condition to add ")" bracket
        if (close > open)
            generateHelper(list, open, close - 1, s + ")");
    }
}