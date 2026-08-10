import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_414 {

    public static int max(int nums[]) {
        Arrays.sort(nums);

        int count = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                count++;

                if (count == 3) {
                    return nums[i];
                }
            }
        }

        return nums[nums.length - 1];
    }

    public static void display(int nums[]) {
        System.out.println("3rd Maximum = " + max(nums));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Of Array :- ");
        int size = sc.nextInt();

        int nums[] = new int[size];

        System.out.println("Enter Elements :- ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        display(nums);
    }
}