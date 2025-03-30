// TODO  There are some disks and you have 3 towers you have to move all disks from tower 1 to 2 with the help of 3 and have to
// todo: print the instructions of that rules are you cannot move 2 disk at a time greater disk cannot come to its smaller

// ? Base case when all disks finished then return and move all disk one by one from tower 1 to tower 3 with the help the tower 2
// ? then manually set the last disk in tower 2 then send all disk one by one from tower 3 totower 1 with tower 1.


import java.util.Scanner;

public class towerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.println("Enter no of disks :");
        int disks = sc.nextInt();
        System.out.println("Enter tower 1 name :");
        String t1 = sc.next();
        System.out.println("Enter tower 2 name :");
        String t2 = sc.next();
        System.out.println("Enter tower 3 name :");
        String t3 = sc.next();

        sc.close();

        // Print instructions
        printInstructions(disks, t1, t2, t3);
    }

    public static void printInstructions(int disks, String t1, String t2, String t3) {
        // Base case
        if (disks == 0)
            return;

        // Do your work and divide into sub problem
        printInstructions(disks - 1, t1, t3, t2);
        System.out.println(disks + " from " + t1 + " to " + t2);
        printInstructions(disks - 1, t3, t2, t1);
    }
}
