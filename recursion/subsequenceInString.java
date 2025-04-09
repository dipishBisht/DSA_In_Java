// TODO Find all subsequence of string.

// ? When string length is equal to 0 then create a arraylist and add "" empty string and return the arraylist and then get
// ? charAt 0 and rest string from index 1 then call the function with rest string then while backtraking create new arraylist
// ? then run loop in the arraylist while return from the call and then one time add the first char which we get from starting
// ? and one time dont add and then at end return the final list. 

import java.util.*;

public class subsequenceInString {

    public static void main(String[] args) {

        String s = "abc";
        ArrayList<String> result = findSubsequence(s);
        System.out.println(result);
    }

    public static ArrayList<String> findSubsequence(String s) {

        if (s.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        char ch = s.charAt(0);
        String sub = s.substring(1);
        ArrayList<String> result = findSubsequence(sub);

        ArrayList<String> finalResult = new ArrayList<>();

        for (String st : result) {
            finalResult.add("" + st);
            finalResult.add(ch + st);
        }

        return finalResult;
    }
}
