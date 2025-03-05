public class containerWithMostWater {

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        int left = 0, right = height.length - 1, result = 0;

        while (left <= right) {
            int area = (Math.min(height[left], height[right])) * (right - left);

            result = Math.max(result, area);

            if (height[left] <= height[right])
                left++;
            else
                right--;
        }

        System.out.println(result);
    }
}