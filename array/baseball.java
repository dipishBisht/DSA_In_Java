// TODO: You will get a string of arrays which will contain numbers, +, D, C in it if + then add last two numbers and push the
// todo- sum in the result array, if C then remove last number from result array, if D then multiply the last number by 2 and
// todo- push the in the result array then at end give the sum of result array.   

//? Loop the array and check by if condition id current data is + then add last 2 and push in the result array, if C then remove
//? the last digit from result array, if D then multiply last digit by 2 and push and in else when is number then convert the
//? number string to number and push in the array.  

package array;

import java.util.ArrayList;

public class baseball {
    public static void main(String[] args) {

        // Operations to perform
        String[] operations = { "5", "2", "C", "D", "+" };

        // To store numbers
        ArrayList<Integer> record = new ArrayList<>();

        // Find the number record
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int ans = record.get(record.size() - 1) + record.get(record.size() - 2);
                record.add(ans);
            } else if (operations[i].equals("C")) {
                record.remove(record.size() - 1);
            } else if (operations[i].equals("D")) {
                record.add(2 * record.get(record.size() - 1));
            } else {
                record.add(Integer.parseInt(operations[i]));
            }
        }

        // To store sum
        int sum = 0;

        // Finding sum
        for (int i = 0; i < record.size(); i++) {
            sum = sum + record.get(i);
        }

        // Printing sum
        System.out.println(sum);
    }
}
