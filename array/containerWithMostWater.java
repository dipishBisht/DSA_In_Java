//  TODO Find the max value container in which the most water can store.

//? Its two pointer approach start from 0 and end from the length of array loops till left exceds right and find the arear and 
//? return the maximum area and if value of left is greater do right-- else left++.


package array;

public class containerWithMostWater {

    public static void main(String[] args) {
        // Given array
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        // Initialize variables
        int left = 0, right = height.length - 1, result = 0;

        // Loops till left is smaller than right
        while (left <= right) {
            // Find the area
            int area = (Math.min(height[left], height[right])) * (right - left);

            // Find the maximum area
            result = Math.max(result, area);

            // If right value is greater then left++ else right--
            if (height[left] <= height[right])
                left++;
            else
                right--;
        }

        // Print the result
        System.out.println(result);
    }
}