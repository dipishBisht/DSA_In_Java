package Day_3;

public class Practice_1 {

    public static void main(String[] args) {

        int[] nums = { 23, 1, 5, 32, 54, 54, 25 };
        int secondGreatest = findSecondGreatest(nums);
        System.out.println(secondGreatest);
    }

    // + Function to find second largest number in an array
    public static int findSecondGreatest(int[] arr) {

        int greatest = arr[0];
        int secondGreatest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > greatest) {
                secondGreatest = greatest;
                greatest = arr[i];
            } else if (secondGreatest < arr[i] && arr[i] < greatest)
                secondGreatest = arr[i];
        }

        return secondGreatest;
    }
}
