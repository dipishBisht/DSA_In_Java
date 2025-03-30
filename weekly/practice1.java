import java.util.*;

public class practice1 {
    public static void main(String[] args) {

        // int num = 141;
        // boolean ans = findIsNumberPalindrome(num);
        // System.out.println(ans);

        // String date = "2080-02-29";
        // String ans = convertDateToBinary(date);
        // System.out.println(ans);

        // int num = 3;
        // int ans = findNthFibonacciNum(num);
        // System.out.println(ans);

        // int num = 5;
        // boolean ans = isNumPowerOf3(num);
        // System.out.println(ans);

        // int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        // int ans = containerWithMostWater(arr);
        // System.out.println(ans);

        // int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        // int ans = findMaximumInArray(arr, 0);
        // System.out.println(ans);

        // int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        // int ans = findMinimumInArray(arr, 0);
        // System.out.println(ans);

        // int[] arr = { 1, 5, 3, 4, 1, 5, 2 };
        // int ans = findOccuranceOfN(arr, 1, 0);
        // System.out.println(ans);

        // int size = 4;
        // printBinaryString("", size);

        // int n = 2;
        // List<String> ans = new ArrayList<>();
        // generateParenthesis(ans, "", n, n);
        // System.out.println(ans);

        // int top = 100;
        // int[] arr = new int[top + 1];
        // Arrays.fill(arr, -1);
        // int ans = climbStairs(top, arr);
        // System.out.println(ans);

        // printDecreasing(5);

        // printIncreasing(5);

        // int[] arr = { 1, 3, 2, 5, 4, 1 };
        // boolean ans = dublicateElements(arr, 0);
        // System.out.println(ans);

        // int n = 5;
        // int ans = sumOfNNaturalNum(n);
        // System.out.println(ans);

        // int ans = nthPowerOfNum(2, 5);
        // System.out.println(ans);

        // printIncreasingDecresingNum(5);

        // boolean ans = isPallindrome("hello");
        // System.out.println(ans);

        // int[] arr = { 1, 2, 3, 4, 5 };
        // reverseArray(arr);
        // for(int i:arr){
        // System.out.println(i);
        // }

        // boolean ans=isNumPowerOf4(12);
        // System.out.println(ans);

        // int[] nums = { 1, 6, 3, 2, 4, 5 };
        // List<List<Integer>> ans = new ArrayList<>();
        // findSubsets(nums, ans, new ArrayList<>(), 0);
        // System.out.println(ans);

        // int[] nums = { 1, 6, 3 };
        // List<List<Integer>> ans = new ArrayList<>();
        // findPermutation(nums, ans, 0);
        // System.out.println(ans);

    }

    public static boolean findIsNumberPalindrome(int num) {

        int ans = 0;
        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp = temp / 10;
        }

        return num == ans;
    }

    public static String convertDateToBinary(String date) {

        StringBuilder sb = new StringBuilder();

        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(0, 4))))
                .append("-")
                .append(Integer.toBinaryString(Integer.parseInt(date.substring(5, 7))))
                .append("-")
                .append(Integer.toBinaryString(Integer.parseInt(date.substring(8, 10))));

        return sb.toString();
    }

    public static int findNthFibonacciNum(int num) {

        if (num == 1)
            return 0;

        if (num == 2)
            return 1;

        return findNthFibonacciNum(num - 1) + findNthFibonacciNum(num - 2);
    }

    public static boolean isNumPowerOf3(int num) {
        if (num == 1)
            return true;

        if (num <= 0 || num % 3 != 0)
            return false;

        return isNumPowerOf3(num / 3);
    }

    public static int containerWithMostWater(int[] arr) {

        int left = 0, right = arr.length - 1, ans = 0;

        while (left <= right) {

            int length = Math.min(arr[left], arr[right]);
            int breath = right - left;

            ans = Math.max(length * breath, ans);
            if (arr[left] <= arr[right])
                left++;
            else
                right--;
        }

        return ans;
    }

    public static int findMaximumInArray(int[] arr, int idx) {

        if (idx == arr.length)
            return Integer.MIN_VALUE;

        int ans = findMaximumInArray(arr, idx + 1);

        return Math.max(ans, arr[idx]);
    }

    public static int findMinimumInArray(int[] arr, int idx) {

        if (idx == arr.length)
            return Integer.MAX_VALUE;

        int ans = findMaximumInArray(arr, idx + 1);

        return Math.min(ans, arr[idx]);
    }

    public static int findOccuranceOfN(int[] arr, int num, int idx) {

        if (arr.length == idx)
            return 0;

        int ans = findOccuranceOfN(arr, num, idx + 1);

        if (arr[idx] == num)
            ans++;

        return ans;
    }

    public static void printBinaryString(String s, int size) {

        if (s.length() == size) {
            System.out.println(s);
            return;
        }

        if (s.length() == 0) {
            printBinaryString(s + "1", size);

            printBinaryString(s + "0", size);
        } else {

            if (s.charAt(s.length() - 1) == '0')
                printBinaryString(s + "1", size);

            printBinaryString(s + "0", size);
        }
    }

    public static void generateParenthesis(List<String> ans, String s, int open, int close) {

        if (open == 0 && close == 0) {
            ans.add(s);
            return;
        }

        if (close > open) {
            generateParenthesis(ans, s + "}", open, close - 1);
        }

        if (open > 0) {
            generateParenthesis(ans, s + "{", open - 1, close);
        }
    }

    public static int climbStairs(int top, int[] arr) {

        if (top == 0)
            return 1;

        if (arr[top] != -1)
            return arr[top];

        int ans = climbStairs(top - 1, arr);

        if (top >= 2)
            ans += climbStairs(top - 2, arr);

        arr[top] = ans;
        return ans;
    }

    public static void printDecreasing(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int n) {
        if (n == 0)
            return;

        printIncreasing(n - 1);
        System.out.println(n);
    }

    public static boolean dublicateElements(int[] arr, int idx) {

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                return true;
        }
        return false;
    }

    public static int sumOfNNaturalNum(int n) {
        if (n == 0) {
            return 0;
        }
        return sumOfNNaturalNum(n - 1) + n;
    }

    public static int nthPowerOfNum(int num, int power) {

        if (power == 0)
            return 1;

        int ans = nthPowerOfNum(num, power / 2);

        return power % 2 == 0 ? ans * ans : ans * ans * num;
    }

    public static void printIncreasingDecresingNum(int num) {
        if (num == 0)
            return;

        System.out.println(num);
        printIncreasingDecresingNum(num - 1);
        System.out.println(num);
    }

    public static boolean isPallindrome(String s) {

        int left = 0, right = s.length() - 1;

        while (left <= right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static boolean isNumPowerOf4(int num) {
        if (num == 1)
            return true;

        if (num <= 0 || num % 4 != 0)
            return false;

        return isNumPowerOf4(num / 4);
    }

    public static void findSubsets(int nums[], List<List<Integer>> ans, List<Integer> arr, int idx) {
        if (nums.length == idx) {
            List<Integer> temp = new ArrayList<>(arr);
            ans.add(temp);
            return;
        }

        arr.add(nums[idx]);
        findSubsets(nums, ans, arr, idx + 1);
        arr.remove(arr.size() - 1);
        findSubsets(nums, ans, arr, idx + 1);
    }

    public static void findPermutation(int[] nums, List<List<Integer>> ans, int idx) {
        if (nums.length == idx) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                temp.add(nums[i]);
            }
            ans.add(temp);
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            int temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
            findPermutation(nums, ans, idx + 1);
            temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
        }
    }
}